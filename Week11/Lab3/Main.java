import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<Pets>();

        System.out.println("Please enter the data for 6 pets, first 3 are dogs, last 3 are cats");
        for(int i = 0; i < 6; i++){
            String name = " ";
            if(i ==0 ){
                System.out.print("Name: " );
                name = input.nextLine();
            }
            else{
                System.out.print("Name: " );
                input.nextLine();
                name = input.nextLine();     
            }
            

            System.out.print("Weight: ");
            double weight = input.nextDouble();

            System.out.print("Age: ");
            int age = input.nextInt();

            System.out.println("--------");

            if(i < 3){
                pets.add(new Cat(weight, age, name));
            }
            else{
                pets.add(new Dog(weight, age, name));
            }

        }

        System.out.println("----------");
        System.out.println("Pets entered");
        for(Pets j : pets){
            System.out.println(j);
        }

        System.out.println("----------");
        System.out.println("the average weight is: " + calculateAverage(pets));

    }

    
    public static double calculateAverage(ArrayList<Pets> list){
        double weights = 0;

        for(Pets pet: list){
            weights+= pet.getWeight();
        }
        return weights/list.size();
    }


}
