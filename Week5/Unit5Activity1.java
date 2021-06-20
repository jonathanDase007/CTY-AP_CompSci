import java.util.*;

public class Unit5Activity1{
    public static void main(String[] args){
        //Solves the radians problems
        Scanner input = new Scanner(System.in);
        System.out.println("This program turns your number into radians and then finds the cos, tan, and sin of that");
        System.out.print("Enter you number of degrees: ");
        double degrees = input.nextDouble();
        double radians = Math.toRadians(degrees);

        System.out.println("Degrees " + degrees);
        System.out.println("Radians: " + radians);
        System.out.println("Sin of angle: " + Math.sin(radians));
        System.out.println("Tan of angle: " + Math.tan(radians));
        System.out.println("Cos of angle: " + Math.cos(radians));

        //Creating random list
        for (int i = 0; i<20; i++){
            double number = (Math.random()*5);
            System.out.print((int) number + "  ");
        }
        System.out.print("\n");

        //The sequences were not the same because it randomly chooses a number
        //No order to it

        //Random CLass
        Random random = new Random();
        random.setSeed(0);

        int six = 0;
        int ten = 0;
        int tenfour = 0;
        int oneeight = 0;
        int twotwo = 0;

        for(int c = 0; c<100; c++){
            int b  = random.nextInt(5);
            if (b ==0){
                six += 1;
            }
            else if (b == 1){
                ten += 1;
            }
            else if (b == 2){
                tenfour += 1;
            }
            else if (b == 3){
                oneeight += 1;
            }
            else if (b == 4){
                twotwo += 1;
            }
            else{
                System.out.print("Failure");
            }
        }

        System.out.println("6 occured: " + six + " times");
        System.out.println("10 occured: " + ten + " times");
        System.out.println("14 occured: " + tenfour + " times");
        System.out.println("18 occured: " + oneeight + " times");
        System.out.println("22 occured: " + twotwo + " times");


        //Rounding problem
        System.out.println("this program takes two values, divides them and then rounds them ");
        System.out.println("Please enter your two values");
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();
        double val = x/y;

        for (int i = 1; i <= 3; i ++){
            double rounded = Math.floor(val * Math.pow(10, i) + .5)/Math.pow(10, i);
            System.out.println("x/y rounded to " + i + " decimal points is: " + rounded);

        }
        

        




    }
}