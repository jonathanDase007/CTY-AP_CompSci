import java.util.*;

public class Unit6Lab1{
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("This asks you to enter numbers and counts their occurenc");
        System.out.print("Please enter the amount of numbers you want to enter ");
        int count = input.nextInt();

        int [] numbers = new int[count];
        int [] passed = new int[count];

        for(int i = 0; i < count; i++){
            System.out.print((i+1) + " Please enter a number: ");
            numbers[i] = input.nextInt();
        }

        for(int j = 0; j < count; j++){
            int frequency = 0;
            boolean inList = false;
            for(int temp = j; temp < count; temp++){
                if (numbers[j] == numbers[temp]){
                    frequency++;
                }
            }
            for(int b: passed){
                if (b == numbers[j]){
                    inList = true;
                }
            }
            if (!inList){
                System.out.println(numbers[j] + " occurs " + frequency + " times.");
            }
            passed[j] = numbers[j];
            
        }


    }

}