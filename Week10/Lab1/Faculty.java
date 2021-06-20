public class Faculty extends Employee{
    private String OfficeHours;
    private String Rank;

    public Faculty(String Name, String Address, String emailAdress, String phoneNumber, Date birthday, double Salary, Date HireDate, String OfficeHours, String Rank){
        super(Name, Address, emailAdress, phoneNumber, birthday, Salary, HireDate);
        this.OfficeHours = OfficeHours;
        this.Rank = Rank;
    }

    public String getOfficeHours() {
        return this.OfficeHours;
    }

    public void setOfficeHours(String OfficeHours) {
        this.OfficeHours = OfficeHours;
    }

    public String getRank() {
        return this.Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public String toString(){
        return "Faculty: " + getName();
    }


}
