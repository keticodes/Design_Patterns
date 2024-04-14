package Flyweight;

import javafx.scene.canvas.GraphicsContext;
import java.util.Random;

public interface Map {
    Tile createTile();
    void display();
    void render(GraphicsContext gc);
}

