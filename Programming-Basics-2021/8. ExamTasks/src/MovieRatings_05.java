import java.util.Scanner;
public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfFilms = Integer.parseInt(scan.nextLine());
        String filmWithHighestRating = "";
        String filmWithLowestRating = "";
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double totalRating =0;
        for (int i = 1; i <= numberOfFilms; i++) {
            String nameOfFilm = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            if(rating < min) {
                min = rating;
                filmWithLowestRating = nameOfFilm;

            }
            if(rating > max) {
                max = rating;
                filmWithHighestRating = nameOfFilm;
            }
            totalRating += rating;
        }
        double average = totalRating / numberOfFilms;
        System.out.printf("%s is with highest rating: %.1f%n",filmWithHighestRating, max);
        System.out.printf("%s is with lowest rating: %.1f%n", filmWithLowestRating,min);
        System.out.printf("Average rating: %.1f",average);
    }
}
