package Mediator;

import java.util.ArrayList;
import java.util.List;

// ChatMediator class
public class ChatMediator {
    private List<ChatClient> clients = new ArrayList<>();

    public void addClient(ChatClient client) {
        clients.add(client);
    }

    public void sendMessage(String message, ChatClient sender, String recipient) {
        for (ChatClient client : clients) {
            if (client.getUsername().equals(recipient)) {
                client.receive(message, sender.getUsername());
            }
        }
    }
}
