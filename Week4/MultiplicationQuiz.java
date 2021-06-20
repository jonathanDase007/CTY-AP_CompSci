import java.util.*;
public class MultiplicationQuiz{
    public static void main(String[] args){
        //Scanner
        Scanner input = new Scanner(System.in);

        //figures out number of loops
        System.out.print("How many questions do you want? ");
        int rounds = input.nextInt();
        int correct = 0;

        //starts timer
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < rounds; i ++){


            //calculates numbers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
        
            //Prompts question
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();

            if (answer == number1 * number2){
                System.out.println("Correct");
                correct += 1;
            }
            else{
                System.out.println("Wrong.  The correct answer is: " + (number1*number2));
            }
            System.out.println("\n" + "--------------");

        }

        //Calculates time take
        long duration = (System.currentTimeMillis() - startTime)/1000;

        //displays time
        System.out.println("Wow, you had an accuracy of: " + (Math.round(((float) correct/ (float) rounds)* 100.0)/100.0) + 
        " and it took you " + (duration) + "(s)" + "\n\n\n");



    }
}