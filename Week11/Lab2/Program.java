import java.util.*;

public class Program{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            for(int j = 0;  j < 5; j ++){
                numbers.add(i);
            }
        }
        System.out.println("original");
        for(int k: numbers){
            System.out.print(k + ", ");
        }
        System.out.println(" ");
        System.out.println("-----");
        removeDuplicates(numbers);

        for(int k: numbers){
            System.out.print(k + ", ");
        }
        System.out.println(' ');
    }

    public static void removeDuplicates(ArrayList<Integer> list){

        ArrayList<Integer> Duplicates = new ArrayList<Integer>();
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for(int i = 0; i < list.size(); i++){
            Duplicates.add(list.get(i));
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i == j){
                }
                boolean repeat = true;
                boolean entered = false;
                for(int answer : counts.keySet()){
                    if(repeat){ 
                        if(list.get(i) == answer){
                            int repeats = counts.get(answer);
                            counts.remove(answer);
                            counts.put(answer, repeats);
                            repeat = false;
                            entered = true;
                        }   
                    }
                }
                if(!entered){
                    counts.put(list.get(i), 1);
                }
                    
            }
        }

        list.clear();

        for(int k : counts.keySet()){
            list.add(k);
        }

    }

}