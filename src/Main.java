import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // main game loop - keep playing until user decides to quit
        System.out.print("Welcome to Hilo! ");
         do {
            playGame();
        } while (keepPlaying());
         System.out.println("Thanks for playing!");
    }
    public static String getGuess() {
        Scanner input = new Scanner(System.in);
        String guess = "";

        // keep asking for guesses until format is correct
        while (!guess.equals("h") && !guess.equals("l")) {
            System.out.print("Will the next card be higher or lower? (h/l) >> ");
            guess = input.nextLine();
            if (!guess.equals("h") && !guess.equals("l"))
                System.out.println("Invalid guess, please try again.");
        }
        return guess;
    }
    public static void playGame() {
        // create a deck and draw a card
        Deck deck = new Deck();
        Card firstCard = deck.drawCard();

        System.out.println("The card is " + firstCard.getStringNum() + " of " + firstCard.getStringSuit() + ".");
        String guess = getGuess();
        Card secondCard = deck.drawCard();

        // evaluate if guess was correct
        if ((guess.equals("h") && secondCard.isGreaterThan(firstCard)) || guess.equals("l") && firstCard.isGreaterThan(secondCard))
            System.out.print("Correct! ");
        else
            System.out.print("Incorrect. ");
        System.out.println("The card is " + secondCard.getStringNum() + " of " + secondCard.getStringSuit() + ".");
    }
    public static boolean keepPlaying() {
        Scanner input = new Scanner(System.in);

        String response = "";

        while (!response.equals("y") && !response.equals("n")) {
            System.out.print("Keep playing? (y/n) >> ");
            response = input.nextLine();
            if (!response.equals("y") && !response.equals("n"))
                System.out.println("Invalid response, please try again.");
        }
        if (response.equals("y"))
            return true;
        else
            return false;
    }
}