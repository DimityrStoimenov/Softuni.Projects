import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int element = Integer.parseInt(tokens[1]);
                    listOfIntegers.add(element);
                    break;
                case "Remove":
                    int number = Integer.parseInt(tokens[1]);
                    if(listOfIntegers.contains(number)) {
                        listOfIntegers.remove((Integer) number);
                    }
                    break;
                case "RemoveAt":
                    int elementOfIndex = Integer.parseInt(tokens[1]);
                    if(elementOfIndex >= 0 && elementOfIndex <= listOfIntegers.size() - 1) {
                        listOfIntegers.remove(elementOfIndex);
                    }
                    break;
                case "Insert":
                    int elementAtIndex = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if( index >= 0 && index <= listOfIntegers.size() - 1) {
                        listOfIntegers.add(index,elementAtIndex);
                    }
                    break;
                case "Contains":
                    int elementByIndex = Integer.parseInt(tokens[1]);
                    if(listOfIntegers.contains(elementByIndex)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String typeOfDigit = tokens[1];
                    if(typeOfDigit.equals("even")) {
                        for (int i = 0; i <= listOfIntegers.size() - 1; i++) {
                            int currentDigit = listOfIntegers.get(i);
                            if (currentDigit % 2 == 0) {
                                System.out.print(currentDigit + " ");
                            }
                        }
                        System.out.println();
                    } else if (typeOfDigit.equals("odd")) {
                        for (int i = 0; i <= listOfIntegers.size() - 1; i++) {
                            int currentDigit = listOfIntegers.get(i);
                            if (currentDigit % 2 == 1) {
                                System.out.print(currentDigit + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    String operation = tokens[1];
                    if(operation.equals("sum")) {
                        int sum = 0 ;
                        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
                            sum += listOfIntegers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    StringBuilder sequence = new StringBuilder();
                    String sign = tokens[1];
                    int num;
                    int digit;
                    if (sign.equals(">=")) {
                        num = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
                            digit = listOfIntegers.get(i);
                            if (digit >= num) {
                                sequence.append(digit);
                                if ( i < listOfIntegers.size() - 1) {
                                    sequence.append(" ");
                                }
                            }
                        }
                        System.out.print(sequence);
                        System.out.println();
                    } else if (sign.equals("<=")) {
                        num = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
                            digit = listOfIntegers.get(i);
                            if (digit <= num) {
                                sequence.append(digit);
                                if ( i < listOfIntegers.size() - 1) {
                                    sequence.append(" ");
                                }
                            }
                        }
                        System.out.print(sequence);
                        System.out.println();
                    } else if (sign.equals(">")) {
                        num = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
                            digit = listOfIntegers.get(i);
                            if (digit > num) {
                                sequence.append(digit);
                                if ( i < listOfIntegers.size() - 1) {
                                    sequence.append(" ");
                                }
                            }
                        }
                        System.out.print(sequence);
                        System.out.println();
                    } else if (sign.equals("<")) {
                        num = Integer.parseInt(tokens[2]);
                        for (int i = 0; i <= listOfIntegers.size() - 1 ; i++) {
                            digit = listOfIntegers.get(i);
                            if (digit < num) {
                                sequence.append(digit);
                                if ( i < listOfIntegers.size() - 1) {
                                    sequence.append(" ");
                                }
                            }
                        }
                        System.out.print(sequence);
                        System.out.println();
                    }
                    break;
            }
            input = scan.nextLine();
        }

    }
}
