package Facade;


public class JokeClient {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();
        try {
            String jokeText = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}