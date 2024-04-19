package Mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// ChatApp class
public class ChatApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();

        ChatClient client1 = new ChatClient("User1", mediator);
        ChatClient client2 = new ChatClient("User2", mediator);
        ChatClient client3 = new ChatClient("User3", mediator);

        mediator.addClient(client1);
        mediator.addClient(client2);
        mediator.addClient(client3);

        ChatClientController controller1 = new ChatClientController(client1);
        ChatClientController controller2 = new ChatClientController(client2);
        ChatClientController controller3 = new ChatClientController(client3);

        Scene scene1 = new Scene(controller1.getView(), 300, 200);
        Scene scene2 = new Scene(controller2.getView(), 300, 200);
        Scene scene3 = new Scene(controller3.getView(), 300, 200);

        Stage stage1 = new Stage();
        stage1.setScene(scene1);
        stage1.setTitle(client1.getUsername());
        stage1.show();

        Stage stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.setTitle(client2.getUsername());
        stage2.show();

        Stage stage3 = new Stage();
        stage3.setScene(scene3);
        stage3.setTitle(client3.getUsername());
        stage3.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
