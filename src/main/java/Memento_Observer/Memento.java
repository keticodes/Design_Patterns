package Memento_Observer;

import javafx.scene.paint.Color;

import java.time.LocalDateTime;

class Memento {
    private final Color color1;
    private final Color color2;
    private final Color color3;
    private final boolean isChecked;
    private final LocalDateTime timestamp;

    public Memento(Color color1, Color color2, Color color3, boolean isChecked) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.isChecked = isChecked;
        this.timestamp = LocalDateTime.now();
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
