import java.util.*;

import javax.swing.InputMap;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many pets do you want to enter: ");
        int length = input.nextInt();

        Pets[] pets = new Pets[length];
        for(int i = 0; i < length; i++){
            System.out.println("Please enter this basic information on your pet");

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            


            System.out.print("Weight: ");
            int weight = input.nextInt();

            System.out.println("One last question is it a cat or dog?");
            System.out.println("1: add a dog");
            System.out.println("2: add a cat");
            System.out.println("----------");
            int choice = input.nextInt();

            if(choice == 1){
                pets[i] = new Dog(weight, age, name);
            }
            else if(choice == 2){
                pets[i] = new Cat(weight, age, name);
            }
        }

        System.out.println("Now we will go over the pets you entered");
        System.out.println("---------");

        for(Pets x: pets){
            System.out.print("Pet named: "  + x.getName() + " weighs " + x.getWeight() + "lbs' and is " + x.getAge() 
            + " years old and makes the noise: ");

            if(x instanceof Cat){
                System.out.println(((Cat) x).Talk());
            }
            else{
                System.out.println(((Dog) x).Talk());
            }
        }




    }
}
