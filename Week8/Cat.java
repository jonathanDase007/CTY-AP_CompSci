public class Cat{
    private String breed;
    private int age;
    private double weight;
    private char sex;
    private String name;

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public char getSex(){
        return sex;
    }

    public String getName(){
        return name;
    }


    public void setBreed(String name){
        breed = name;
    }

    public void setAge(int Age){
        age = Age;
    }

    public void setWeight(double Weight){
        weight = Weight;
    }

    public void setSex(char Sex){
        sex = Sex;
    }

    public void setName(String Name){
        name = Name;
    }

    public String eat(){
        return "Munch, Munch, Munch";
    }

    public String meow(){
        return "Meeeeeooww";
    }
}