public class Subscriber {
    public static int SubscriberCount = 0;
    private int subscriberNumber;
    public Subscriber() { 
        subscriberNumber = SubscriberCount++;
    }

    public void update(){
        System.out.println("Subscriber #: " + this.subscriberNumber + " has been notified");
    }

    public String toString(){
        return subscriberNumber + " ";
    }

}
