package State;

class IntermediateState implements CharacterState {
    @Override
    public void train(gameCharacter character) {
        character.increaseExperience(15);
    }

    @Override
    public void meditate(gameCharacter character) {
        character.increaseHealth(10);
    }

    @Override
    public void fight(gameCharacter character) {
        System.out.println("Cannot fight at Intermediate level.");
    }

    @Override
    public void displayStatus(gameCharacter character) {
        System.out.println("Character: " + character.getName() + ", Level: Intermediate, Experience Points: "
                + character.getExperiencePoints() + ", Health Points: " + character.getHealthPoints());
    }
}