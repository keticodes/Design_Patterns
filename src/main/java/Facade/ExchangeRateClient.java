package Facade;

public class ExchangeRateClient {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();
        try {
            Object rates = facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "rates");
            System.out.println(rates.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}