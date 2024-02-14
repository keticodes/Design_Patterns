package Decorator;

import Decorator.Printer;
// EncryptedPrinter decorator
class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        // Encrypt message here
        String encryptedMessage = encrypt(message);
        System.out.println("Printing encrypted message: " + encryptedMessage);
        printer.print(encryptedMessage);
    }

    private String encrypt(String message) {
        // Implement your encryption algorithm here
        // For demonstration purposes, let's just reverse the message
        return new StringBuilder(message).reverse().toString();
    }
}

