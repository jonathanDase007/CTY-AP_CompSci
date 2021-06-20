import java.util.*;
public class Unit5Lab1 {
    public static void main(String[] args){
        System.out.println("This program can calculate banking statments");

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number entered below to choose what you want");
            System.out.println("1: Future Value of a Single Sum");
            System.out.println("2: Present Value of a Single Sum");
            System.out.println("3: Future Value of an Annuity");
            System.out.println("4: Exit Program");
            int choice = input.nextInt();
            
            if (choice == 1){
                //gathers letters
                System.out.print("Please enter your amount deposited: ");
                double p = input.nextDouble();
                System.out.print("Please enter the number of years you intened to keep the money in the account: ");
                double n = input.nextDouble();
                System.out.print("please enter your banks intrest as a decimal value: ");
                double j = input.nextDouble();

                System.out.println("If you deposit " + p + " for " + n + " years at " + j + " intrest " +
                "then you will get $" + (float) Math.round(FutureValSum(p, n, j)*100) / 100);
            }
            else if (choice ==2){
                System.out.print("Please enter your goal amount of money: ");
                double f = input.nextDouble();
                System.out.print("Please enter the number of years you intened to keep the money in the account: ");
                double n = input.nextDouble();
                System.out.print("please enter your banks intrest as a decimal value: ");
                double j = input.nextDouble();
                System.out.println("If you deposit " + (float) Math.round(PresentVal(f, n, j)*100)/ 100 + " for " + n + " years at " + j + " intrest " +
                "then you will get $" + f);
            }
            else if (choice ==3){
                System.out.print("How much money will you deposit monthly: ");
                double A = input.nextDouble();
                System.out.print("Please enter the number of years you intened to keep the money in the account: ");
                double n = input.nextDouble();
                System.out.print("please enter your banks intrest as a decimal value: ");
                double j = input.nextDouble();
                System.out.println("If you deposit " + A + " annually for " + n + " years at " + j + " intrest " +
                "then you will get $" + (float) Math.round(valAnnual(A, n, j)*100)/100);
            }
            else if (choice ==4){
                break;
            }
            else{
                System.out.println("Your input does not work");
            }

            System.out.println("\n" + "\n");

        }
    }

    public static Double FutureValSum (double p, double n, double j){
        double i = j/12;
        return p*Math.pow((1+i), n*12);
    }

    public static Double PresentVal (double f, double n, double j){
        double i = j/12;
        return f/(Math.pow((1+i), n*12));
    }

    public static Double valAnnual (double A, double n, double j){
        double i = j/12;
        return A * (Math.pow((1+i), n*12) - 1)/i;

    }


}
