import java.util.*;

public class Unit2Lab2 {
    public static void main(String[] args){
        double money;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your money in $: ");
        money = input.nextDouble();

        final double MONEY = money;

        //removes dollars
        int dollarCount = (int) (money / 1);
        money = money % 1;

        //removes quarters
        int quarters = (int) (money / .25);
        money = money % .25;

        //removes dimes
        int dimes = (int) (money / .1);
        money = money % .1;

        //removes nickels
        int nickels = (int) (money / .05);
        money = money % .05;

        //pennies
        int pennies = (int) (money/.01);

        System.out.println("$" + MONEY + " consists of " + dollarCount + " Dollars, " + quarters + " Quarters, " + 
        dimes + " Dimes, " + nickels + " Nickels, " + pennies + " Pennies");


    }
}
