public class MemoryCounterTest {
    public static void main(String[] args){
        CounterConsoleMenu counter = new CounterConsoleMenu();
        while(!counter.getQuit()){
            do{
                counter.DisChoice();
                counter.GetChoice();
                counter.Increment();
                if(counter.getQuit()){
                    break;
                }
            } while(!counter.getPass());
            counter.DisplayInput();
        }
    }
}