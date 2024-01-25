package ASCIIArtUserInterfaces;

abstract class UIFactory {
    public abstract UIElement createButton(String text);
    public abstract UIElement createTextField(String text);
    public abstract UIElement createCheckbox(String text);
}

