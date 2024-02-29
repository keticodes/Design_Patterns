package State;

public interface CharacterState {
    void train(gameCharacter character);
    void meditate(gameCharacter character);
    void fight(gameCharacter character);
    void displayStatus(gameCharacter character);
}
