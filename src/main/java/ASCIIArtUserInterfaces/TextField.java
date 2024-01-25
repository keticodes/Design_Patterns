package ASCIIArtUserInterfaces;

class TextField extends UIElement {
    public TextField(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("+------------------------+");
        System.out.println("| " + text + "               |");
        System.out.println("+------------------------+");
    }
}