public class Counter{
    private int counts;

    public Counter(){ this.counts = 0;}

    public void add(){ this.counts++;}
    public void subtract() {this.counts--;}
    public void reset() { this.counts = 0;}

    public int getCount(){
        return counts;
    }

    public String toString() {
        return String.valueOf(this.counts);
    }

}