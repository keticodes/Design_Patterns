package ASCIIArtUserInterfaces;

import java.util.*;

abstract class UIElement {
    protected String text;

    public UIElement(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}
