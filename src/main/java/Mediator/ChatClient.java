package Mediator;

// ChatClient class
public class ChatClient {
    private String username;
    private ChatMediator mediator;

    public ChatClient(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
    }

    public void send(String message, String recipient) {
        mediator.sendMessage(message, this, recipient);
    }

    public void receive(String message, String sender) {
        System.out.println("[" + sender + " -> " + username + "] " + message);
    }

    public String getUsername() {
        return username;
    }
}

