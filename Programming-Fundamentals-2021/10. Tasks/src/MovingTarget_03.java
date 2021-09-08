import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> shootingGallery = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            switch (command) {
                case "Shoot":
                    if (isValidIndex(index,shootingGallery)) {
                        int powerOfIndex = Integer.parseInt(tokens[2]);
                        int currentElementByIndex = shootingGallery.get(index);
                        if (currentElementByIndex <= powerOfIndex)  {
                            shootingGallery.remove(shootingGallery.get(index));
                        } else {
                            currentElementByIndex -= powerOfIndex;
                            shootingGallery.set(index,currentElementByIndex);
                        }

                    }
                    break;
                case "Add":
                    if (isValidIndex(index,shootingGallery)) {
                        int power = Integer.parseInt(tokens[2]);
                        shootingGallery.add(index,power);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if(isValidIndex(index,shootingGallery)) {
                        int radius = Integer.parseInt(tokens[2]);
                        int leftBound = Math.max(index - radius, -1);
                        int rightBound = Math.min(index + leftBound, shootingGallery.size() - 1);
                        if ((leftBound >= 0 && leftBound <= shootingGallery.size() - 1) &&
                                (rightBound >= 0 && rightBound <= shootingGallery.size() - 1)) {
                            shootingGallery.remove(index);
                            shootingGallery.subList(leftBound, rightBound - leftBound + 1).clear();
                        } else{
                            System.out.println("Strike missed!");
                        }
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i <= shootingGallery.size() - 1; i++) {
            System.out.print(shootingGallery.get(i));
            if ( i < shootingGallery.size() - 1) {
                System.out.print("|");
            }
        }
    }

    private static boolean isValidIndex(int index, List<Integer> shootingGallery) {
        return index >= 0 && index <= shootingGallery.size() - 1;
    }
}
