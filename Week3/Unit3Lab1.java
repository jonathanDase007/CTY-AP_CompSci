import java.util.*;

public class Unit3Lab1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Length of first side: ");
        float l1 = input.nextFloat();

        System.out.print("Length of second side: ");
        float l2 = input.nextFloat();

        System.out.print("Length of third side: ");
        float l3 = input.nextFloat();


        if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2) && (l1 > 0) && (l2 > 0) && (l3  >0)){
            if ((l1 == l2) && (l2 == l3)){
                System.out.println("You have an Equilateral Triangle");
                System.out.printf("Values: " + l1 + ", " + l2 + ", " + l3 + "\n");
            }

            else if ((l1 == l2) || (l2 == l3) || (l1 == l3)){
                System.out.println("You have an Isosceles Triangle");
                System.out.printf("Values: " + l1 + ", " + l2 + ", " + l3 + "\n");
            }

            else{
                System.out.println("You have an scalene Triangle");
                System.out.printf("Values: " + l1 + ", " + l2 + ", " + l3 + "\n");
            }

        }
        else{
            System.out.println("The values entered do not make a valid triangle");
            System.out.printf("Values: " + l1 + ", " + l2 + ", " + l3 + "\n");
        }


    }
}