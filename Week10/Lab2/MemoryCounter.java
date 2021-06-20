public class MemoryCounter extends Counter{
    private int [] memory;
    private int index;

    public MemoryCounter(){
        super();
        this.memory = new int[100];
        this.index = 0;
    }

    public void memorize(){
        memory[index] = getCount();
        index++;
        reset();

    }

    public void disMemory(){
        System.out.print("memorized vals: ");
        for(int val: memory){
            if(val != 0){
                System.out.print(val + ", ");
            } 
        }
        System.out.println(' ');
    }

    public void resetMem(){
        memory = new int[100];
        index = 0;
    }
}
