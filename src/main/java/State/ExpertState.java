package State;


class ExpertState implements CharacterState {
    @Override
    public void train(gameCharacter character) {
        character.increaseExperience(20);
    }

    @Override
    public void meditate(gameCharacter character) {
        character.increaseHealth(5);
    }

    @Override
    public void fight(gameCharacter character) {
        character.decreaseHealth(15);
        character.increaseExperience(30);
    }

    @Override
    public void displayStatus(gameCharacter character) {
        System.out.println("Character: " + character.getName() + ", Level: Expert, Experience Points: "
                + character.getExperiencePoints() + ", Health Points: " + character.getHealthPoints());
    }
}
