import java.util.*;

public class Unit4Lab2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many lines of * do you want? ");
        int lines = input.nextInt();

        for (int c = lines; c > 0; c --){
            for (int b = c; b > 0; b--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
