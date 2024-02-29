package Template_Method;

import java.util.Random;

public class PingPongGame extends Game {
    private int[] playerScores;
    private int maxScore;
    private int currentPlayer;

    @Override
    public void initializeGame(int numberOfPlayers) {
        playerScores = new int[numberOfPlayers];
        maxScore = 10;
        currentPlayer = 0; // Eka pelaaja aloittaa
        System.out.println("Ping Pong Game Initialized. Max Score: " + maxScore);
    }

    @Override
    public boolean endOfGame() {
        for (int score : playerScores) {
            if (score >= maxScore) {
                return true; // Player who reaches the Max Score first wins the game
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) { //Simulating the game and the player is the one who is currently playing the game.
        Random random = new Random();
        int score = random.nextInt(3); // Randomly generate a score between 0 and 2
        playerScores[player] += score; // Add the score to the player's total
        System.out.println("Player " + (player + 1) + " scored " + score + " points.");
        currentPlayer = (currentPlayer + 1) % playerScores.length; // Move to the next player
    }

    @Override
    public void displayWinner() {
        // Find the player with the highest score
        int maxScoreIndex = 0;
        for (int i = 1; i < playerScores.length; i++) {
            if (playerScores[i] > playerScores[maxScoreIndex]) {
                maxScoreIndex = i;
            }
        }
        System.out.println("Player " + (maxScoreIndex + 1) + " wins with a score of " + playerScores[maxScoreIndex]);
    }

    public static void main(String[] args) {
        PingPongGame pingPongGame = new PingPongGame();
        pingPongGame.play(2); // Play the game with 2 players
    }
}
