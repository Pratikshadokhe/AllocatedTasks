import java.util.Scanner;

public class NumberGuissingGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int maxAttempt = 5;

        // Generate random number
        int secretNum = (int) (Math.random()*(max - min + 1) + min);

        Scanner sc = new Scanner(System.in);

        // Game play
        int attempt = 1;
        for(attempt = 1 ; attempt <= maxAttempt ; attempt++){
            System.err.println("Attempt "+attempt+" Enter guessed number: ");
            int guessNum = sc.nextInt();

            if (guessNum == secretNum) {
                System.out.println("Congratulations! Your guess is right.");
                break;
            }
            else if (guessNum < secretNum) {
                System.out.println("Your guessed number is low");
            }
            else {
                System.out.println("Your guessed number is high");
            }
        }
        // Game over
        if (attempt == maxAttempt + 1) {
            System.out.println("Well Played!");
            System.out.println("You ran out of attempts. The number was "+secretNum);
        }
    }
}
