public class IllegalArgumentExceptionCatch {
    public static void main(String[] args){
        try{
            if(true){
                dog2 x = new dog2(3, 1);
            }  
            else{
                dog2 x = new dog2(1);
            }
        } catch (IllegalArgumentException e){
            System.out.println("This error happens when arguments are given that are not allowed to be");
        }
    }
}
