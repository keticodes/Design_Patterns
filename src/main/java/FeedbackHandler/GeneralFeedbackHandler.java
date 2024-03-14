package FeedbackHandler;

public class GeneralFeedbackHandler extends FeedbackHandler{
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == FeedbackType.GENERAL_FEEDBACK;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        // Handle general feedback (e.g., analyze and respond)
        System.out.println("General feedback analyzed: " + message.getContent());
    }
}