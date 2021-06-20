import java.util.*;

public class CounterConsoleMenu{
    private MemoryCounter counter;
    private int choice;
    private boolean quit;
    private boolean pass;


    public CounterConsoleMenu() {
        this.counter = new MemoryCounter();
        quit = false;
        pass = true;
    }


    public void DisChoice(){
        System.out.println("Your choices are below");
        System.out.println("1: Increment");
        System.out.println("2: Decriment");
        System.out.println("3: reset");
        System.out.println("4: Add Mem");
        System.out.println("5: dis Mem");
        System.out.println("6: clear memory");
        System.out.println("7: Quit");
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
                counter.memorize();
                pass = true;
                break;
            case 5:
                counter.disMemory();
                pass = true;
                break;
            case 6:
                counter.disMemory();
                pass = true;
                break;
            case 7:
                counter.resetMem();
                pass = true;
                quit = true;
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

    
}
