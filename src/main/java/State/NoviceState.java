package State;


class NoviceState implements CharacterState {
    @Override
    public void train(gameCharacter character) {
        character.increaseExperience(10);
    }

    @Override
    public void meditate(gameCharacter character) {
        System.out.println("Cannot meditate at Novice level.");
    }

    @Override
    public void fight(gameCharacter character) {
        System.out.println("Cannot fight at Novice level.");
    }

    @Override
    public void displayStatus(gameCharacter character) {
        System.out.println("Character: " + character.getName() + ", Level: Novice, Experience Points: "
                + character.getExperiencePoints() + ", Health Points: " + character.getHealthPoints());
    }
}