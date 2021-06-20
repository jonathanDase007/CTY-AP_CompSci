public class Car{
    private String Model;
    private String Make;
    private int age;

    public Car(String Model, String Make, int Age){
        this.Model = Model;
        this.Make = Make;
        this.age = Age;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getMake() {
        return this.Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return this.Make + "'s " + this.Model + " is " + this.age + " years old.";
    }


}