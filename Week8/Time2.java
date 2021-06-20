public class Time2 {
    private int seconds;
    
    public Time2(){
         this.seconds = 0;
    }

    public Time2(int hour){
        this(hour, 0, 0);
    }

    public Time2(int hours, int minute){
        this(hours, minute, 0);
    }

    public Time2(Time2 time){
        this.seconds = time.seconds;
    }


    //constructor
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minutre must be 0-59");
        }

        if(second < 0 || second >=60){
            throw new IllegalArgumentException("seconds must be 0-59");
        }

        this.seconds = 3600*hour + 60*minute + second;
    }

    public void setHour(int hour){
        int time = seconds%3600;

        time += hour*3600;
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.seconds = time;
    }

    public void setMinutes(int minutes){
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        int timeMinutes = this.seconds%3600;
        int HourCount = this.seconds/3600;

        int timeSeconds = timeMinutes%60;

        this.seconds = HourCount*3600 + minutes*60 + timeSeconds;

    }
    public void setSeconds(int second){
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        int timeHours = this.seconds%3600;
        int hourCount = this.seconds/3600;

        int timeMinutes = timeHours/60;

        this.seconds = hourCount*3600 + timeMinutes*60 + second;
    }

    public int getHour() { return this.seconds/3600;}
    public int getMinute() { return (this.seconds%3600)/60;}
    public int getSecond() { return (this.seconds%3600)%60;}

    public String toUniversalString() {
        return String.format(
           "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
     } 

     public String toString() {
        return String.format("%d:%02d:%02d %s", 
           ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
           getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
     } 


}
