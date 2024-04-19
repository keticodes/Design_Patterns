package Mediator;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

// ChatClientController class
public class ChatClientController {
    private ChatClient client;
    private TextArea messageArea;
    private TextField messageField;
    private TextField recipientField;
    private Button sendButton;

    public ChatClientController(ChatClient client) {
        this.client = client;
        messageArea = new TextArea();
        messageField = new TextField();
        recipientField = new TextField();
        sendButton = new Button("Send");

        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            String recipient = recipientField.getText();
            client.send(message, recipient);
            messageField.clear();
        });
    }

    public VBox getView() {
        return new VBox(messageArea, recipientField, messageField, sendButton);
    }
}
