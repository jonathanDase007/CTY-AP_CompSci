import java.util.*;

public class NullPointExceptionCatch {
    public static void main(String[] args){
        String paul = null;
        try{
            System.out.println(paul.charAt(0));
        } catch(NullPointerException e){
            System.out.println("This eception is thrown when an object of null is refers to. This incluces");
            System.out.println("1. Calling a instanc method of an object of type null");
            System.out.println("2. Accessing or modyfiying an object of type null");
            System.out.println("3. Taking the length of a null array");
            System.out.println("4. Accessing or modifying the slots of null");
            System.out.println("5. Throwing null like a throwable");
        }
        
    }
}
