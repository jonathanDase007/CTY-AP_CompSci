public class CreateCats {
    public static void main(String[] args) {
        //Builds Cat 1
        Cat catOne = new Cat();
        catOne.setName("Bison");
        catOne.setBreed("British");
        catOne.setAge(5);
        catOne.setWeight(9.34);
        catOne.setSex('f');

        //builds Cat 2
        Cat catTwo = new Cat();
        catTwo.setName("Bangal");
        catTwo.setBreed("German");
        catTwo.setAge(14);
        catTwo.setWeight(12.34);
        catTwo.setSex('m');

        //Displays Them
        DisAttributes(catOne);
        DisAttributes(catTwo);

        //Change Cat1
        catOne.setName("Alexandeer");
        catOne.setAge(6);

        //Change cat2
        catTwo.setAge(15);
        catTwo.setWeight(11.2);

        //Display Them
        DisAttributes(catOne);
        DisAttributes(catTwo);

        //Meowing
        System.out.println(catTwo.meow());


    }

    public static void DisAttributes(Cat a){
        System.out.println("Name: " + a.getName());
        System.out.println("Breed: " + a.getBreed());
        System.out.println("Age " + a.getAge());
        System.out.println("Weight: " + a.getWeight());
        System.out.println("Sex: " + a.getSex());
        System.out.println("----------");
    }
}
