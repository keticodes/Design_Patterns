package Flyweight;

import javafx.scene.image.Image;

public class SwampTile implements Tile {
    private static final Image IMAGE = new Image("swamptile.png");

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "swamp";
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }
}