import javax.swing.*;

public class DateExercises {
    public static void main(String[] args){

        int year = gather("Enter the Year: ");
        int month = gather("Enter the Month: ");
        int day = gather("Enter the Day: ");


        Date dates = new Date(year, month, day);

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"The Date is: " + dates);

        System.out.println("finished");


    }

    public static int gather(String name){
        JFrame f = new JFrame();
        String time = JOptionPane.showInputDialog(f, name);
        return Integer.parseInt(time);
    }


}
