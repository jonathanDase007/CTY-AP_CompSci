import java.util.Scanner;
public class Unit5Lab3B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the test scores for each student");

        for(int i = 1;  i < 4; i++){
            System.out.println("Student: " + i);
            System.out.print("  Score 1: ");
            int s1 = input.nextInt();
            System.out.print("  Score 2: ");
            int s2 = input.nextInt();
            System.out.print("  Score 3: ");
            int s3 = input.nextInt();
            System.out.print("  Score 4: ");
            int s4 = input.nextInt();
    
            float average = (s1 + s2 + s3 + s4)/4;
    
            System.out.println("The min score was " + minimum(s1, s2, s3, s4));
            System.out.println("The max score was " + maximum(s1, s2, s3, s4));
            System.out.println("The Average was " + average);
    
            System.out.println("The student recieved a letter grade of " + grade(Math.round(average)));
            System.out.println("\n");
    }
}


    public static int minimum(int a, int b, int c, int d){
        int min = 0;
        while(a > 0 && b > 0 && c > 0 && d > 0){
            a--;
            b--;
            c--;
            d--;
            min ++;
        }
        return min;
    }

    public static char grade(int a){
        if (a > 89){
            return 'A';
        }
        else if (a > 79){
            return 'B';
        }
        else if (a > 69){
            return 'C';
        }
        else if (a > 64){
            return 'D';
        }
        else{
            return 'F';
        }

    }

    public static int maximum(int a, int b, int c, int d){
        int max = 0;
        while(a > 0 || b > 0 || c > 0 || d > 0){
            a--;
            b--;
            c--;
            d--;
            max++;
        }
        return max;
    }

}
