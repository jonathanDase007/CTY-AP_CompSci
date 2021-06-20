public class myClass
{
     private int x = 10;
     private int y = 10;
     
     public static void myMethod( int x, int y )
     {
          x += y;
          y *= x;
          System.out.println( x + "\t" + y );
     }
}
