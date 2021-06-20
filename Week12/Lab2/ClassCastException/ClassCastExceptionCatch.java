public class ClassCastExceptionCatch{
    public static void main(String[] args){
        cats x = new cats();
        try{
            System.out.println((dog)x);
        }catch(ClassCastException e){
            System.out.println("Thrown when object can not bee casted to anouther class");
        }
        
    }
}