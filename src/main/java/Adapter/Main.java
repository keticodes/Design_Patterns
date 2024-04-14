package Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setDay(4);
        date.setMonth(4);
        date.setYear(2024);

        System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(10);
        System.out.println("Date after advancing 10 days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}