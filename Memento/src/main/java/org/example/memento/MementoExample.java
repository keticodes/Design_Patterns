package Memento_Observer;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Stack;

public class MementoExample extends Application {
    private final Originator originator = new Originator();
    private final Caretaker caretaker = new Caretaker();

    private final Rectangle rect1 = new Rectangle(100, 100, Color.RED);
    private final Rectangle rect2 = new Rectangle(100, 100, Color.GREEN);
    private final Rectangle rect3 = new Rectangle(100, 100, Color.BLUE);
    private final CheckBox checkBox = new CheckBox("Check me");

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        HBox shapes = new HBox(10);
        shapes.getChildren().addAll(rect1, rect2, rect3);
        root.getChildren().addAll(shapes, checkBox);

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(e -> {
            if (e.isControlDown() && e.getCode().toString().equals("Z")) {
                undo();
            } else if (e.isControlDown() && e.getCode().toString().equals("Y")) {
                redo();
            }
        });

        rect1.setOnMouseClicked(e -> changeColor(rect1));
        rect2.setOnMouseClicked(e -> changeColor(rect2));
        rect3.setOnMouseClicked(e -> changeColor(rect3));

        checkBox.setOnAction(e -> saveState());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Memento Example");
        primaryStage.show();

        // History Window
        ListView<String> historyList = new ListView<>();
        ObservableList<String> historyItems = FXCollections.observableArrayList();
        historyList.setItems(historyItems);
        historyList.setOnMouseClicked(e -> {
            int selectedIndex = historyList.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                Memento selectedMemento = caretaker.undoStack.get(selectedIndex);
                if (selectedMemento != null) {
                    originator.restore(selectedMemento);
                    updateUI();
                }
            }
        });

        Stage historyStage = new Stage();
        historyStage.setTitle("History Window");
        historyStage.setScene(new Scene(new StackPane(historyList), 200, 300));
        primaryStage.setOnCloseRequest(e -> historyStage.close());
        historyStage.show();
    }

    private void changeColor(Rectangle rect) {
        Color newColor = Color.color(Math.random(), Math.random(), Math.random());
        rect.setFill(newColor);
        saveState();
    }

    private void saveState() {
        originator.setState((Color) rect1.getFill(), (Color) rect2.getFill(), (Color) rect3.getFill(), checkBox.isSelected());
        caretaker.addMemento(originator.save());
        updateUI();
    }

    private void undo() {
        Memento memento = caretaker.undo();
        if (memento != null) {
            originator.restore(memento);
            updateUI();
        }
    }

    private void redo() {
        Memento memento = caretaker.redo();
        if (memento != null) {
            originator.restore(memento);
            updateUI();
        }
    }

    private void updateUI() {
        rect1.setFill(originator.getColor1());
        rect2.setFill(originator.getColor2());
        rect3.setFill(originator.getColor3());
        checkBox.setSelected(originator.isChecked());

        // Update history window
        ListView<String> historyList = (ListView<String>) ((StackPane) Stage.getWindows().filtered(w -> w.getScene().equals("History Window")).get(0).getScene().getRoot()).getChildren().get(0);
        ObservableList<String> historyItems = FXCollections.observableArrayList();
        for (Memento memento : caretaker.undoStack) {
            historyItems.add("Saved at: " + memento.getTimestamp());
        }
        historyList.setItems(historyItems);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
