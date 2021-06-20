import java.util.*;

public class CounterConsoleMenu {
    private Counter counter;
    private int choice;
    private boolean quit;
    private boolean pass;

    public CounterConsoleMenu() {this.counter = new Counter(); quit = false; pass = true;}

    public void DisChoice(){
        System.out.println("Your choices are below");
        System.out.println("1: Increment");
        System.out.println("2: Decriment");
        System.out.println("3: reset");
        System.out.println("4: Quit");
        System.out.println("----------");
    }

    public void GetChoice(){
        Scanner input = new Scanner(System.in);
        this.choice = input.nextInt();
    }

    public void Increment(){
        switch(this.choice){
            case 1:
                counter.add();
                System.out.println("enters");
                pass = true;
                break;
            case 2:
                counter.subtract();
                pass = true;
                break;
            case 3:
                counter.reset();
                pass = true;
                break;
            case 4:
                quit = true;
                pass = true;
                break;
            default:
                System.out.println("error with input");
                pass = false;
                break;
        }

    }

    public boolean getQuit() {return this.quit;}
    public boolean getPass() {return this.pass;}

    public void DisplayInput(){
        System.out.println("----------");
        System.out.println("Current Count: " + counter);
        System.out.println("----------");
    }

    public void run(){
        while(getQuit()){
            DisChoice();
            GetChoice();
            if(getQuit()){
                break;
            }


            Increment();
            DisplayInput();
        }
    }
}
