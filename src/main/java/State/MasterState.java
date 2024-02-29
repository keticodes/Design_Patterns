package State;

class MasterState implements CharacterState {
    @Override
    public void train(gameCharacter character) {
        System.out.println("Already at Master level.");
    }

    @Override
    public void meditate(gameCharacter character) {
        System.out.println("Already at Master level.");
    }

    @Override
    public void fight(gameCharacter character) {
        System.out.println("Already at Master level.");
    }

    @Override
    public void displayStatus(gameCharacter character) {
        System.out.println("Congratulations! You have reached the Master level.");
    }
}
