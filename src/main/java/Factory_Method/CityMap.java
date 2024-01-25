package Factory_Method;

import java.util.*;

// Concrete Map classes
class CityMap implements Map {
    @Override
    public Tile createTile() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
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
}

