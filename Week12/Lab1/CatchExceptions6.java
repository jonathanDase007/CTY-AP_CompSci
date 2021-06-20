import java.util.*;

class CatchExceptions6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers to be divided");
        System.out.print("Number 1: ");
        int x = input.nextInt();
        int y;
        int j = 1;

        //preconditions y: int; x: int
        //postcondition will return x/y
        boolean correct = false;
        do{
            System.out.print("Number 2: ");
            y = input.nextInt();
            try{
                j = divide(x, y);
                correct = false;
            } catch (ArithmeticException e){
                System.out.println("Your input did not work. Please reenter");
                correct = true;
            }
            

        }
        while(correct);

        System.out.printf(x + "/" + y + " = " + j +"\n");
    }

    public static int divide(int x, int y){
        int result = x/y;
        return result;
    }
}