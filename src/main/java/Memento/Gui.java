package Memento;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Gui extends Application {

    // Existing code...

    public void start(Stage stage) {
        // Existing code...

        // Button to open history window
        Button historyButton = new Button("View History");
        historyButton.setOnAction(event -> {
            showHistoryWindow();
        });

        // Add the history button to the VBox
        vBox.getChildren().add(historyButton);

        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);

        // Existing code...
    }

    private void showHistoryWindow() {
        Stage historyStage = new Stage();
        historyStage.initModality(Modality.APPLICATION_MODAL);
        historyStage.setTitle("History");

        ListView<String> historyList = new ListView<>();
        for (IMemento memento : controller.getHistory()) {
            // Add metadata about the state to the history list
            historyList.getItems().add(memento.getMetadata());
        }

        historyList.setOnMouseClicked(event -> {
            // Restore selected state when clicked
            int selectedIndex = historyList.getSelectionModel().getSelectedIndex();
            controller.restoreState(selectedIndex);
            historyStage.close();
        });

        Scene historyScene = new Scene(historyList, 200, 300);
        historyStage.setScene(historyScene);
        historyStage.show();
    }

    public void updateGui() {
        // Existing code...
    }
}
