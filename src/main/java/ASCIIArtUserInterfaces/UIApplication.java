package ASCIIArtUserInterfaces;

public class UIApplication {
    public static void main(String[] args) {
        // Create a Button using ButtonFactory
        UIFactory buttonFactory = new ButtonFactory();
        UIElement button = buttonFactory.createButton("Click me");
        button.display();

        // Create a TextField using ButtonFactory
        UIElement textField = buttonFactory.createTextField("Enter text");
        textField.display();

        // Create a Checkbox using ButtonFactory
        UIElement checkbox = buttonFactory.createCheckbox("Remember me");
        checkbox.display();

        // Change the content dynamically
        button.setText("New label");
        button.display();
    }
}
