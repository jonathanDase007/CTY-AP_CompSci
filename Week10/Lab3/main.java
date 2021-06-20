public class main {
    
    public static void main(String[] args){
        Publisher works = new Publisher(15);
        for(int i = 0; i < 3; i++){
            works.register(new Subscriber());
            works.notifySubscribers();
        }


        //Notifications begin
        System.out.println("-------");
        for(int j = 0; j < 4; j++){
            works.register(new Subscriber());
            works.notifySubscribers();
            System.out.println("---");
        }

        


        
    }
    

}
