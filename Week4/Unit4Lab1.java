import java.util.*;
public class Unit4Lab1{
    public static void main(String[] args){
        //sets range

        //informs of program and figures out #of guesses
        Scanner input = new Scanner(System.in);
        System.out.println("This program asks you to guess a special number between 1 and a number of your choice");

        while(true){
            System.out.print("Please enter the number of tries you want to have: ");
            int trials = input.nextInt();

            //Gets range of input
            System.out.print("Please enter your range for guessing: ");
            int N = input.nextInt();

            //gets guesses and guess counts
            int guesscount = 0;
            int answer = (int) (N * Math.random()) + 1;
            int guess = (5 == answer) ? 3: 5;

            //adds space
            System.out.print("\n" + "\n");

            //goes through code testing if answer is correct
            while (guesscount < trials && guess != answer){
                System.out.print("Please enter your guess ");
                guess = input.nextInt();

                if (guess == answer){
                    System.out.println("You guessed the correct answer. The number is: " + guess);
                }
                else if (guess < answer){
                    System.out.println("The number " + guess + " is too small");
                }
                else{
                    System.out.println("The number " + guess + " is too high");
                }
                guesscount++;
            }
            if (guess != answer){
                System.out.println("You ran out of trials, better luck next time.");
            }
            System.out.print("Do you want to try again? Enter 1 for yes and any number for no: ");
            int again = input.nextInt();
            if (again != 1){
                break;
            }
            
    }




    }
}