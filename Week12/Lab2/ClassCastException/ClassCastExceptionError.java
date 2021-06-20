import java.util.*;
public class ClassCastExceptionError {
    public static void main(String[] args){
        cats x = new cats();
        System.out.println((dog)x);
    }
}

