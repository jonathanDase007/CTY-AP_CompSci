public class RectangleTest {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setHeight(5);
        r.setWidth(5);
        r.setLetter('*');
        r.Draw();

        

        Rectangle j = new Rectangle();
        j.setHeight(7);
        j.setWidth(15);
        j.setLetter('a');
        j.Draw();

        System.out.println("---------");
        System.out.println("Rectangle r has an area of: " + r.Area());
        System.out.println("Rectangle r has an perimiter of: " + r.perimeter() + "\n\n");

        
        System.out.println("Rectangle j has an area of: " + j.Area());
        System.out.println("Rectangle j has an perimeter of: " + j.perimeter());


    }
}
