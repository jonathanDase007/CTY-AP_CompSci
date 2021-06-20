import java.util.*;

public class Unit4Lab3B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers and this program will sort them by values");

        //defined variables
        int count = 0;

        System.out.print("Number: ");
        int c  = input.nextInt();
        int smallest = c;
        int largest = c;

        for(int counter = 0; counter < 10; counter ++){
            System.out.print("Number: ");
            int number = input.nextInt();

            if (number > largest){
                largest = number;
            }
            else if (number < smallest){
                smallest = number;
            }
            count = counter;

        }


        System.out.println("You entered: " + count + " numbers and the highest was " + largest + " and the smallest was " 
        + smallest);

    }
    
}
