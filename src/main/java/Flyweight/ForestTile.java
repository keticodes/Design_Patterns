package Flyweight;

import javafx.scene.image.Image;

public class ForestTile implements Tile {
    private static final Image IMAGE = new Image("path/to/forest/image.png");

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "forest";
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }
}