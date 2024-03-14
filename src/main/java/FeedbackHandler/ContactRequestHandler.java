package FeedbackHandler;

public class ContactRequestHandler extends FeedbackHandler{
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == FeedbackType.CONTACT_REQUEST;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        // Handle contact request (e.g., forward to appropriate department)
        System.out.println("Contact request forwarded: " + message.getContent());
    }
}


