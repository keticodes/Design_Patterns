package FeedbackHandler;


    class CompensationClaimHandler extends FeedbackHandler {
        @Override
        protected boolean canHandle(FeedbackMessage message) {
            return message.getType() == FeedbackType.COMPENSATION_CLAIM;
        }

        @Override
        protected void handle(FeedbackMessage message) {
            // Handle compensation claim (e.g., review and approve/reject)
            System.out.println("Compensation claim handled: " + message.getContent());
        }
    }


