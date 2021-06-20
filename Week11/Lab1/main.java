import java.util.*;

public class main {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("This program makes you enter cars");
        System.out.print("How many Cars would you like to enter: ");
        int rounds = input.nextInt();

        ArrayList<Car> AllCars = new ArrayList<Car>();


        for(int i = 0;  i < rounds; i++){
            System.out.println("-----------");
            System.out.print("The Make of the Car: ");
            input.nextLine();
            String Make = input.nextLine();

            System.out.print("The Model of the Car: ");
            String Model = input.nextLine();

            System.out.print("Age of Car: ");
            int age = input.nextInt();

            AllCars.add(new Car(Model, Make, age));
        }

        ArrayList<Car> Under = new ArrayList<Car>();
        ArrayList<Car> Over = new ArrayList<Car>();


        for(int i = 0; i <  rounds; i++){
            if (AllCars.get(i).getAge() < 2010){
                Under.add(AllCars.get(i));
            }
            else{
                Over.add(AllCars.get(i));
            }
        }

        System.out.println("-----------");
        System.out.println("The Cars you entered");
        for(int i = 0; i < rounds; i++){
            System.out.println(AllCars.get(i));
        }

        System.out.println("-----------");
        System.out.println("The Cars under 2010 you entered");
        for(int i = 0; i < Under.size(); i++){
            System.out.println(Under.get(i));
        }

        System.out.println("-----------");
        System.out.println("The Cars over 2010 you entered");
        for(int i = 0; i < Over.size(); i++){
            System.out.println(Over.get(i));
        }


    }
}
