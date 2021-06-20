public class Date{
    private int year;
    private int month;
    private int day;

    public Date(){
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int year, int month, int day){
        if(month <= 12 && day <=31){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new IllegalArgumentException ("Dates were incoorect");
        }
    }

    public void setDate(int year, int month, int day){
        if(month <= 12 && day <=31){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new IllegalArgumentException ("Dates were incoorect");
        }
    }

    public void setYear(int year){ this.year = year;}

    public void setMonth(int month) {
        if (month <= 12){
            this.month = month;
        }
        else{
            throw new IllegalArgumentException ("Dates were incoorect");
        }
    }

    public void setDay(int day){
        if (day <= 31){
            this.day = day;
        }
        else{
            throw new IllegalArgumentException ("Dates were incoorect");
        }
    }

    public int getYear() {return this.year;}
    public int getMonth() {return this.month;}
    public int getDay() {return this.day;}

    public String toUniversalString() {
        return String.format(
           "%02d/%02d/%02d", getMonth(), getDay(), getYear());
    }

    public String toString() {
        return toUniversalString();
    }
  
}
