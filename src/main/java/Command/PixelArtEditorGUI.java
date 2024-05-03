package Command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PixelArtEditorGUI extends Application {
    private static final int PIXEL_SIZE = 20;
    private PixelArtEditor editor = new PixelArtEditor();
    private Circle cursor = new Circle(PIXEL_SIZE / 2);

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Rectangle pixel = new Rectangle(PIXEL_SIZE, PIXEL_SIZE);
                pixel.setFill(Color.WHITE);
                pixel.setStroke(Color.BLACK);
                gridPane.add(pixel, x, y);
            }
        }

        Button generateCodeButton = new Button("Generate Code");
        generateCodeButton.setOnAction(e -> editor.generateCode());

        VBox root = new VBox(gridPane, generateCodeButton);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    editor.moveCursorUp();
                    break;
                case DOWN:
                    editor.moveCursorDown();
                    break;
                case LEFT:
                    editor.moveCursorLeft();
                    break;
                case RIGHT:
                    editor.moveCursorRight();
                    break;
                case SPACE:
                    editor.togglePixel();
                    break;
            }
            updateGUI(gridPane);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateGUI(GridPane gridPane) {
        // Update the GUI based on the state of the editor
    }

    public static void main(String[] args) {
        launch(args);
    }
}
