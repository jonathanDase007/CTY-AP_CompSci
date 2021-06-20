public class Unit5Lab2{
    public static void main(String[] args){
        for(int i = 1; i <13; i ++){
            printMonthCalendar(i, 2021);
        }
        
    }
//prints the whole calendar
public static void printMonthCalendar(int m, int y){
    printMonthHeader(m, y);
    printMonthBody(m, y);
}

//prints header
    public static void printMonthHeader(int m, int y){
        String name = getMonthName(m);
        System.out.printf("        " + name + "   " + y);
        System.out.printf("\n" + "---------------------------");

        System.out.print('\n' + "Sun Mon Tue Wed Thu Fri Sat ");
    }

//print months days
    public static void printMonthBody(int m, int y){
        int dayCount = getNumDaysInMonth(m, y);
        int start_day = getStartDay(m, 1, y);
        int start = 0;
        int number = 1;


        System.out.println("  ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 7; j++){
                if (start < start_day){
                    System.out.print("    ");
                }
                else if (number < 10){
                    System.out.print(number + "   ");
                    number += 1;
                }
                else{
                    System.out.print(number + "  ");
                    number += 1;
                }
                start += 1;

                if (number > dayCount){
                    break;
                }
            }
            System.out.println(' ');
        }    
    }
//Returns month by name
    public static String getMonthName(int m){
        switch(m){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

        }
        return "No";
  }

//figures out start day
    public static int getStartDay(int m, int d, int y){
     /*
  The method getStartDay() implements Zeller's Algorithm for determining the day of the
  week the first day of a month is. The method adjusts Zeller's numbering scheme
  for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
  that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
  
  Pre-Conditions: The month value, m,  is 1-12
                        The day value, d, is 1-31, or 1-28, 1-29 for February
                        The year value, y, is the full year (e.g., 2012)
                  
 Post-Conditions: A value of 1-7 is returned, representing the first day of the month
                        1 = Monday, ..., 7 = Sunday
  */
    // Adjust month number & year to fit Zeller's numbering system
    if ( m < 3 ) 
    {
      m = m + 12;
      y = y - 1;
    }
    int k = y % 100;      // Calculate year within century
    int j = y / 100;      // Calculate century term
    int h = 0;            // Day number of first day in month 'm'
    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
    return dayNum;
  }

//figures out number of days
    public static int getNumDaysInMonth(int m, int y){
    switch(m){
        case 1:
            return 31;
        case 2:
            if (isLeapYear(y)){
                return 29;
            }
            return 28;
        case 3:
            return 31;
        case 4:
            return 30;
        case 5:
            return 31;
        case 6:
            return 30;
        case 7:
            return 31;
        case 8:
            return 31;
        case 9:
            return 30;
        case 10:
            return 31;
        case 11:
            return 30;
        case 12:
            return 31;
        }
        return 0;
        
    }

//Figures out if it is a leap year
    public static boolean isLeapYear(int y){

      if (y%4 == 0){
        return true;
      }
      return false;
      
  }

}