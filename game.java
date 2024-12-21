import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
  public static void main(String[] args){
    startGame();
  }

  public static void startGame(){
    Random random=new Random();
    int numberToGuess=random.nextInt(100)+1;
    int attempts=0;
    int playerGuess=0;
    Scanner sc=new Scanner(System.in);

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between 1 and 100.Try to guess it.");

    While(playerGuess!=numberToGuess)
    {
      System.out.print("Enter your guess:");
      try{
        playerGuess=Integer.parseInt(sc.nextLine());
        attempts++;

        if(playerGuess<numberToGuess){
          System.out.println("Too low! Try again.");
        }else if(playerGuess>numberToGuess){
          System.out.println("Too high! Try again.");
        }else{
          System.out.println("Congratulations! You've guessed the number in "+ attempts + " attempts.");
        }
      }
      catch(NumberFormatException e){
        System.out.println("Please enter a valid integer.");
      }
    }

    System.out.println("Do you want to play again?(yes/no): ");
    String playAgain=sc.nextLine().toLowerCase();
    if(playAgain.equal("yes")){
      startGame();
    }
    else{
      System.out.println("Thanks for playing! Goodbye.");
    }
  }
}
          
  
