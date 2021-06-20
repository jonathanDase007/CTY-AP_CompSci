public class Publisher{
    private Subscriber[] SubList;
    private int SubMax;
    private int nextIndex;
    private int count;

    public Publisher(int max){
        SubList = new Subscriber[max];
        this.SubMax = max;
        this.nextIndex = 0;
        count = 0;
    }

    public void register(Subscriber s){
        if(nextIndex <  SubMax){
            SubList[nextIndex] = s;
            count++;
            nextIndex++;
        }
        else
            System.out.println("error filled");
    }

    public int count(){ return SubList.length;}

    public void notifySubscribers(){
        if (count > 3){
            int rounds = 0;
            for(Subscriber s: SubList){
                if(s != null && rounds < 3){
                    s.update();
                    rounds++;
                }
            }
        }
    }
}