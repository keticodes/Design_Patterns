package Memento_Observer;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.Stack;

class Originator {
    private Color color1;
    private Color color2;
    private Color color3;
    private boolean isChecked;

    public void setState(Color color1, Color color2, Color color3, boolean isChecked) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.isChecked = isChecked;
    }

    public Memento save() {
        return new Memento(color1, color2, color3, isChecked);
    }

    public void restore(Memento memento) {
        this.color1 = memento.getColor1();
        this.color2 = memento.getColor2();
        this.color3 = memento.getColor3();
        this.isChecked = memento.isChecked();
    }

    public Color getColor1() {
        return color1;
    }

    public Color getColor2() {
        return color2;
    }

    public Color getColor3() {
        return color3;
    }

    public boolean isChecked() {
        return isChecked;
    }
}

