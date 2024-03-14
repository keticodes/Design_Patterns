package FeedbackHandler;

abstract class FeedbackHandler {
    private FeedbackHandler nextHandler;

    public void setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleFeedback(FeedbackMessage message) {
        if (canHandle(message)) {
            handle(message);
        } else if (nextHandler != null) {
            nextHandler.handleFeedback(message);
        } else {
            System.out.println("No handler found for the feedback type: " + message.getType());
        }
    }

    protected abstract boolean canHandle(FeedbackMessage message);

    protected abstract void handle(FeedbackMessage message);
}

