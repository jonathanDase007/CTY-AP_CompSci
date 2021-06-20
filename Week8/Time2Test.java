public class Time2Test {
    public static void main(String[] args){
        Time2 t1 = new Time2(); // 00:00:00          
        Time2 t2 = new Time2(2); // 02:00:00         
        Time2 t3 = new Time2(21, 34); // 21:34:00    
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42 
        Time2 t10 = t5;
        displayTime("t10", t10);       
        Time2 t11 = null;
        Time2 t12 = t11;

        System.out.println(t12.getHour());



  
        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        try {
            Time2 t6 = new Time2(1,3,90);
        }
        catch(IllegalArgumentException e){
            System.out.println("worked");
        }
  
        //Time setting test

        Time2 t7 = new Time2(1, 1, 1);
        t7.setHour(3);
        displayTime("T7", t7);

        Time2 t8 = new Time2(1,1,1);
        t8.setMinutes(30);
        displayTime("T8", t8);

        Time2 t9 = new Time2(1,1,1);
        t9.setSeconds(20);
        displayTime("T9", t9);

    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n",
           header, t.toUniversalString(), t.toString());
        System.out.println("--------");
     } 
}
