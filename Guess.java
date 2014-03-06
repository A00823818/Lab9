import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {
        
        int numToGuess;     //Number the user ties to guess
        int guess;          //The user's guess
        String readiness;
        String yes = "y";
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        numToGuess = generator.nextInt(10) + 1;
        
        System.out.println("I will think of a number (1 to 10) " +
        "and you have to guess what it is.");
        System.out.print("Are you ready (y/n)? ");
        readiness = scan.next();
        
        if(readiness.equalsIgnoreCase(yes)){
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            
            //variables of the guesses
            int totalGuess = 0;
            int lowGuess = 0;
            int highGuess = 0;
            
            while (numToGuess != guess){
                if(guess < numToGuess){
                    System.out.println("Too Low.");
                    System.out.print("You are wrong, try again: ");
                    guess = scan.nextInt();
                    
                    //counts the low guesses
                    lowGuess++;
                    
                }
                else{
                    System.out.println("Too High");
                    System.out.print("You are wrong, try again: ");
                    guess = scan.nextInt();
                    
                    //counts the high guesses
                    highGuess++;
                }
                
                //counts how many times the user have guessed
                totalGuess++;
            }
            //prints out the total count of guess(es) and congratulation speech
            System.out.println();
            System.out.println("Congratulations, You have guessed right!");
            System.out.println();
            System.out.println("You have guesssed: " + totalGuess + " time(s).");
            System.out.println("The number of too low guesses: " +
                    lowGuess + " time(s)");
            System.out.println("The number of too high guesses: " +
                    highGuess + " time(s)");
        }
        else{
            System.out.println("Thank you for your honesty, Goodbye.");
        }
        
        scan.close();
    }

}
