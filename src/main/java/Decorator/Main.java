package Decorator;

import Decorator.Printer;
public class Main {
    public static void main(String[] args) {
        // Testing basic printer
        Printer printer = new BasicPrinter();
        printer.print("Hello Keti !");

        // Testing encrypted file printer
        Printer printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer2.print("Hello Mandunga!");
    }
}
