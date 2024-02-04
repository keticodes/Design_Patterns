package ASCIIArtUserInterfaces;

import java.util.*;



class Button extends UIElement {
    public Button(String text) {
        super(text);
    }


    public void display() {
        System.out.println(" [ " + text + " ] ");
    }
}
