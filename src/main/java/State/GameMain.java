package State;

public class GameMain {
    public static void main(String[] args) {
        gameCharacter character = new gameCharacter("Player1");

        while (!(character.currentState instanceof MasterState)) {
            character.displayStatus();
            System.out.println("Choose action:");
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");

            // Simulating user input, you can implement this according to your actual input mechanism
            int choice = (int) (Math.random() * 3) + 1;
            switch (choice) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
    }
}
