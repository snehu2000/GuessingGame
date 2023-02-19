


import java.util.Random;
import java.util.Scanner;

public class GuessingGame
 {

  public static void main(String[] args) 
  {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int randomNumber = rand.nextInt(100) + 1;
    System.out.println("Random number is " + randomNumber);
    int tryCount = 0;
    while(true)
     {
         System.out.println(" \n\t Enter your guess (1-100):");
         int playerGuess = scanner.nextInt();
      
      tryCount++;
        if (playerGuess == randomNumber) 
      {
          System.out.println("\n\t Correct! You Win!");
          System.out.println(" \n\t It took you " + tryCount + " tries");

        break;

      }
      else if(randomNumber > playerGuess) 
      {
         System.out.println("\n\t   Number is higher");
         System.out.println("\n\t   Guess again.... ");

      }
      else 
      {
         System.out.println("\n\t  Number is lower");
         System.out.println("\n\t  Guess again.... ");

      }
    }

    scanner.close();
  }
}