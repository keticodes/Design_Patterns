package Decorator;



// Abstract decorator class implementing Printer interface
abstract class PrinterDecorator implements Printer {
    protected Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}