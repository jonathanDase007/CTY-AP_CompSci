public class Student extends Person{
    private String ClassStatus;

    public Student(String Name, String Address, String emailAdress, String phoneNumber, Date birthday, String classStatus){
        super(Name, Address, emailAdress, phoneNumber, birthday);
        this.ClassStatus = ClassStatus;
    }

    public String toString(){
        return "Student: " + getName(); 
    }

    public String getClassStatus() {
        return this.ClassStatus;
    }

    public void setClassStatus(String ClassStatus) {
        this.ClassStatus = ClassStatus;
    }

}
