import java.util.*;

public class Unit7Lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program takes three words and then sorts them alphabetically");
        System.out.print("Word 1: ");
        String a = input.nextLine();
        System.out.print("Word 2: ");
        String b = input.nextLine();
        System.out.print("Word 3: ");
        String c = input.nextLine();

        String [] words = sortWords(a, b, c);
        System.out.println("Sorted words are: ");
        for(int i = 0; i < 3; i++){
            System.out.printf(words[i] + ", ");
        }
        System.out.println(' ');
       
    }

    public static String [] sortWords(String a, String b, String c){
        String high;
        String low ;
        String medium;

        if(a.compareTo(b) < 0){
            if(a.compareTo(c) < 0){
                if(b.compareTo(c) < 0){
                    high = a;
                    medium = b;
                    low = c;
                }
                else{
                    high = a;
                    medium = c;
                    low = b;
                }
            }
            else{
                high = c;
                medium = a;
                low = b;
            }
        }
        else{
            if(b.compareTo(c) > 0){
                if(a.compareTo(c) > 0){
                    high = b;
                    medium = a;
                    low = c;
                }
                else{
                    high = b;
                    medium = c;
                    low = a;
                }
            }
            else{
                high = c;
                medium = b;
                low = a;

            }

        }
        String [] answer = {high, medium, low};
        
        return answer;
        

    }

    
}
