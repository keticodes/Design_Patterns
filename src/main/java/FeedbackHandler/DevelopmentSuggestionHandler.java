package FeedbackHandler;

public class DevelopmentSuggestionHandler extends FeedbackHandler{
    @Override
    protected boolean canHandle(FeedbackMessage message) {
        return message.getType() == FeedbackType.DEVELOPMENT_SUGGESTION;
    }

    @Override
    protected void handle(FeedbackMessage message) {
        // Handle development suggestion (e.g., log and prioritize)
        System.out.println("Development suggestion logged: " + message.getContent());
    }
}


