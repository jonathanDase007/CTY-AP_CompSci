import java.util.*;

public class StringCount{
    public static void main(String[] args){

        int charecters = 0;
        int words = 0;
        boolean skip = true;
        for(String x : args){
            if (skip){
                skip = false;
            }
            else{
                charecters += x.length();
                words++;
            } 
        }
        
        
        if(args[0].equals("-cw")){
            System.out.println("The total number of charecters is: " + charecters);
            System.out.println("The total number of words is: " + words);
        } 
        else if(args[0].equals("-c")){
            System.out.println("The total number of charecters is: " + charecters);
        }
        else if(args[0].equals("-w")){
            System.out.println("The total number of words is: " + words);
        }
        else{
            System.out.println("Not Working");
        }
    }
}