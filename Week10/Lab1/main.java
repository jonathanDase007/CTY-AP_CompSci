public class main {
    public static void main(String[] args){
        Person will = new Person("Will", "13 South rd", "will@cty.edu", "16542345432", new Date(1937, 5, 9));
        Person ben = new Employee("Ben", "9 West Rd.", "ben@cty.edu", "123454365432", new Date(1999, 1, 3), 120000, new Date(2019, 4, 2));
        Person john = new Student("john", "1 main town rd.", "john@cty.edu", "19176904444", new Date(1975, 3, 5), "freshman");
        Person Isac = new Faculty("Isac", "12 weslian rd", "Isac@cty.edu", "12703450923", new Date(2000, 4, 17), 53000, new Date(2020, 5, 12), "Tuesday 9-5", "instructor");
        Person sam = new Staff("sam", "123 Park av", "sam@cty.edu", "19082346449", new Date(1932, 4, 4), 129000, new Date(1952, 1, 13), "Dean");


        Person[] people = {will, ben, john, Isac, sam};

        for(Person person: people){
            System.out.println(person);
        }



    }
}
