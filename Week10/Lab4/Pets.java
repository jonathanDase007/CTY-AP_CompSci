public class Pets{
    private int weight;
    private int age;
    private String name;
    private static int number = 0;

    Pets(int weight, int age, String name){
        number++;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}