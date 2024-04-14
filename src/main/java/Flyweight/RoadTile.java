package Flyweight;

import javafx.scene.image.Image;

public class RoadTile implements Tile {
    private static final Image IMAGE = new Image("roadtile.png");

    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "road";
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }
}