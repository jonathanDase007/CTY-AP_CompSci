public class Employee extends Person{
    private double Salary;
    private Date HireDate;

    public Employee(String Name, String Address, String emailAdress, String phoneNumber, Date birthday, double Salary, Date HireDate){
        super(Name, Address, emailAdress, phoneNumber, birthday);
        this.Salary = Salary;
        this.HireDate = HireDate;
    }


    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public Date getHireDate() {
        return this.HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public String toString(){
        return "employee: " + getName();
    }
    
}
