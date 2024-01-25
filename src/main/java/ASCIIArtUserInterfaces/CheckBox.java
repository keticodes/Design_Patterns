package ASCIIArtUserInterfaces;

class CheckBox extends UIElement {
    public CheckBox(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ ] " + text);
    }
}

