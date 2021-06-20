public class Person{
    private String name;
    private String address;
    private String emailAdress;
    private String phoneNumber;
    private Date birthday;
    
    public Person(String Name, String Address, String emailAdress, String phoneNumber, Date birthday){
        this.name = Name;
        this.address = Address;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAdress() {
        return this.emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }   

    public String toString() {
        return "Person: " + this.name;
    }

}