// Write a program that allows the user to guess a random number from 1 to 50. Use a while loop to repeat until the user guesses correctly. For each guess, use a conditional statement to provide hints like "Your number is higher" or "Your number is lower."
import java.util.Scanner;
import java.util.Random;
public class Exercise1_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(50)+1;
        int guess = 0;
        System.out.println("We will play the Number guessing game!");
        while(guess!= targetNumber){
            System.out.print("Enter your guess( number from 1 to 50):");guess=sc.nextInt();
            if(guess<targetNumber){
                System.out.println("Your number is lower. Try again.");
            }else if(guess>targetNumber){
                System.out.println("Your number is higher. Try again.");
            }else{
                System.out.println("It's correct. You guessed the correct number: " + targetNumber);
            }
        }
        
    }
    
}
