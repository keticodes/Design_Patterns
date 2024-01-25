package ASCIIArtUserInterfaces;

import java.util.*;
import ASCIIArtUserInterfaces.UIElement;
class ButtonFactory extends UIFactory {
    @Override
    public UIElement createButton(String text) {
        return new Button(text);
    }

    @Override
    public UIElement createTextField(String text) {
        return new TextField(text);
    }

    @Override
    public UIElement createCheckbox(String text) {
        return new CheckBox(text);
    }
}
