package Decorator;

import java.io.IOException;
import java.io.FileWriter;

class FilePrinter extends PrinterDecorator {
    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(message);
            System.out.println("Printing to file: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

