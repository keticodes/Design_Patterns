package Factory_Method;

import java.util.Random;

class Game {
    public static void main(String[] args) {
        Map map = createMap();
        map.display();
    }

    public static Map createMap() {
        Random random = new Random();
        int rand = random.nextInt(2);
        switch (rand) {
        case 0:
            return new CityMap();
        case 1:
            return new WildernessMap();
            default:
                throw new UnsupportedOperationException("Unexpected value " + rand);
        }
    }
}