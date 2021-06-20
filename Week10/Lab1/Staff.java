public class Staff extends Employee{
    private String jobTitle;

    public Staff(String Name, String Address, String emailAdress, String phoneNumber, Date birthday, double Salary, Date HireDate, String JobTitle){
        super(Name, Address, emailAdress, phoneNumber, birthday, Salary, HireDate);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return "Staff: " + getName();
    }

}
