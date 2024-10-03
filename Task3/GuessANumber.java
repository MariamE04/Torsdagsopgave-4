import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();

    }

    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object  	 

        if (scanner.hasNextInt()) {             // use hasNextDouble to check if input is numeric,
            int guess = scanner.nextInt();

            if(guess == rnd_number) {   // Compare it with the random number
                System.out.println("Congratulations! You guessed the right number:" + rnd_number); 

            // if so...
            // Read user input

             } else if (guess < rnd_number) {
                System.out.println("Your guess is too low. Try again.");
                makeAGuess(); // Recursive call to try again

            } else {
                System.out.println("Your guess is too high. Try again.");
                makeAGuess(); // Recursive call to try again
            }

        } else {
            // If input was not numeric, show an error message
            System.out.println("That's not a valid number. Please enter a numeric value.");
            scanner.next(); // Clear invalid input
            makeAGuess(); // Recursive call to try again
        }
    }
}   

        
    
