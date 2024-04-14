package Flyweight;

import javafx.scene.image.Image;

// Add this method to the Tile interface
class BuildingTile implements Tile {
    private static final Image IMAGE = new Image("building.png");

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "building";
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }
}