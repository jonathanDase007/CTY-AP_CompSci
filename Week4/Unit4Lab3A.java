import java.util.*;
public class Unit4Lab3A {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers and this program will sort them by values");

        //defined variables
        int counter = 0;
        int smallest;
        int largest;

        System.out.print("Number: ");
        int c  = input.nextInt();
        smallest = c;
        largest = c;


        while (counter < 10 ){
            System.out.print("Number: ");
            int number = input.nextInt();

            if (number > largest){
                largest = number;
            }
            else if (number < smallest){
                smallest = number;
            }
            counter ++;
        }

        System.out.println("You entered: " + counter + " numbers and the highest was " + largest + " and the smallest was " 
        + smallest);



        

    }
}
