package Flyweight;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;


class WildernessMap implements Map {
    private static final int TILE_SIZE = 20; // replace with actual tile size

    @Override
    public Tile createTile() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return new SwampTile();
            case 1:
                return new WaterTile();
            case 2:
                return new BuildingTile();
            default:
                throw new UnsupportedOperationException("Invalid tile type");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < 25; i++) {
            Tile tile = createTile();
            System.out.print(tile.getCharacter());

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    @Override
    public void render(GraphicsContext gc) {
        for (int i = 0; i < 25; i++) {
            Tile tile = createTile();
            gc.drawImage(tile.getImage(), i % 5 * TILE_SIZE, i / 5 * TILE_SIZE);
        }
    }
}

