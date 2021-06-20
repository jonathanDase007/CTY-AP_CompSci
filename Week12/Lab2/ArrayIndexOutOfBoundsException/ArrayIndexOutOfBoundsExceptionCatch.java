public class ArrayIndexOutOfBoundsExceptionCatch {
    public static void main(String[] args){
        char[] x = {'a','b','c','d','e'};
        try{
            System.out.println(x[7]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This error happens when an array is indexed out of its length-1");
        }
        

    }
}
