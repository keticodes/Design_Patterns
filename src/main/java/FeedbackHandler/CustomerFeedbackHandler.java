package FeedbackHandler;

public class CustomerFeedbackHandler {
    public static void main(String[] args) {
        // Create the chain of responsibility
        FeedbackHandler compensationHandler = new CompensationClaimHandler();
        FeedbackHandler contactHandler = new ContactRequestHandler();
        FeedbackHandler developmentHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalHandler = new GeneralFeedbackHandler();

        // Chain the handlers together
        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);

        // Generate and handle various types of feedback
        FeedbackMessage claim = new FeedbackMessage(FeedbackType.COMPENSATION_CLAIM, "Claim content", "sender@example.com");
        FeedbackMessage contact = new FeedbackMessage(FeedbackType.CONTACT_REQUEST, "Contact content", "sender@example.com");
        FeedbackMessage suggestion = new FeedbackMessage(FeedbackType.DEVELOPMENT_SUGGESTION, "Suggestion content", "sender@example.com");
        FeedbackMessage feedback = new FeedbackMessage(FeedbackType.GENERAL_FEEDBACK, "Feedback content", "sender@example.com");

        // Send feedback through the chain of responsibility
        compensationHandler.handleFeedback(claim);
        compensationHandler.handleFeedback(contact);
        compensationHandler.handleFeedback(suggestion);
        compensationHandler.handleFeedback(feedback);
    }
}
