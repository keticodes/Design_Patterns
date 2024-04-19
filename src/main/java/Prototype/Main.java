package Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create some initial book recommendations
        List<Book> booksForKids = new ArrayList<>();
        booksForKids.add(new Book("Dr. Seuss", "The Cat in the Hat", "Children's", 1957));
        booksForKids.add(new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", "Fantasy", 1997));
        Recommendation kidsRecommendation = new Recommendation("Kids", booksForKids);

        List<Book> booksForAdults = new ArrayList<>();
        booksForAdults.add(new Book("Agatha Christie", "2017", "Murder on the Orient Express", 2017));
        booksForAdults.add(new Book("Cornelia Funke", "Inkheart", "Fantasy", 2003));
        Recommendation adultsRecommendation = new Recommendation("Adults", booksForAdults);

        // Store the recommendations in a list
        List<Recommendation> recommendations = new ArrayList<>();
        recommendations.add(kidsRecommendation);
        recommendations.add(adultsRecommendation);

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command:");
            String command = scanner.nextLine();

            if (command.equals("view")) {
                // Display the current recommendations
                for (Recommendation recommendation : recommendations) {
                    System.out.println("Recommendation for " + recommendation.getTargetAudience() + ":");
                    for (Book book : recommendation.getBooks()) {
                        System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
                    }
                }
            } else if (command.startsWith("clone")) {
                // Clone a recommendation
                String targetAudience = command.split(" ")[1];
                for (Recommendation recommendation : recommendations) {
                    if (recommendation.getTargetAudience().equals(targetAudience)) {
                        Recommendation clonedRecommendation = recommendation.clone();
                        recommendations.add(clonedRecommendation);
                        System.out.println("Cloned recommendation for " + targetAudience);
                        break;
                    }
                }
            } else if (command.equals("quit")) {
                // Exit the program
                break;
            } else {
                System.out.println("Unknown command. Try 'view', 'clone [targetAudience]', or 'quit'.");
            }
        }

        scanner.close();
    }
}