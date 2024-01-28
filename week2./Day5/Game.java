import java.util.Random;
import java.util.Scanner;

public class Game {
    private int random_number;
    private int user_input;
    private int no_of_guesses;

    public Game(int lowerLimit, int upperLimit) {
        Random rand = new Random();
        this.random_number = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        this.user_input = 0;
        this.no_of_guesses = 0;
    }

    public int getNoOfGuesses() {
        return no_of_guesses;
    }

    public void setNoOfGuesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter your guess: ");
                this.user_input = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        }
    }

    public boolean isCorrectNumber() {
        this.no_of_guesses++;
        return this.user_input == this.random_number;
    }

    public static void main(String[] args) {
        Game game = new Game(1, 100);

        System.out.println("Welcome to Guess the Number Game!");

        while (true) {
            game.takeUserInput();

            if (game.isCorrectNumber()) {
                System.out.println("Congratulations! You guessed the number in " + game.getNoOfGuesses() + " guesses.");
                break;
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        }
    }
}
