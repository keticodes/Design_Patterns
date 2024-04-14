package Flyweight;

import javafx.scene.image.Image;

public class WaterTile implements Tile {
    private static final Image IMAGE = new Image("watertile.png");

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "water";
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }
}