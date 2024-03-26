package Proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addDocument("doc1", new Date(), "Unprotected Document Content", false, null);

        // Add protected document
        library.addDocument("doc2", new Date(), "Protected Document Content", true, "user1");

        // Create users
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Access unprotected document
        Document doc1 = library.getDocument("doc1");
        if (doc1 != null) {
            System.out.println("User1 accessing doc1: " + doc1.getContent(user1));
            System.out.println("User2 accessing doc1: " + doc1.getContent(user2));
        }

        // Access protected document
        Document doc2 = library.getDocument("doc2");
        if (doc2 != null) {
            try {
                System.out.println("User1 accessing doc2: " + doc2.getContent(user1));
            } catch (AccessDeniedException e) {
                System.out.println("User1 could not access doc2: " + e.getMessage());
            }

            try {
                System.out.println("User2 accessing doc2: " + doc2.getContent(user2));
            } catch (AccessDeniedException e) {
                System.out.println("User2 could not access doc2: " + e.getMessage());
            }
        }
    }
}