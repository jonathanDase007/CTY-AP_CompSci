public class Rectangle {
    private int width;
    private int height;
    private char letter;

    public int getWidth() {return width;}   
    public int getHeight() { return height;}
    public char getLetter() { return letter;}


    public void setWidth(int Width) {
        if(Width <= 0 || Width > 30){
            Error();
        }
        else{
            width = Width;
        }
    }
    public void setHeight(int Height) {
        if(Height <= 0 || Height > 30){
            Error();
        }
        else{
            height = Height;
        }
    }
    public void setLetter(char Letter) {letter = Letter;}

    public void Draw(){
        for(int i = 0; i < width; i++){
            System.out.print(letter);
        }
        System.out.println(' ');

        for(int i = 0; i < height-2; i++){
            for(int j = 0; j < width; j++){
                System.out.print(letter);
            }
            System.out.println(' ');
        }

        for(int i = 0; i < width; i++){
            System.out.print(letter);
        }
        System.out.println(' ');
    }

    public int Area(){ return height*width;}

    public int perimeter(){ return 2*width + 2*(height-2);}

    private void Error(){
        System.out.println("Error with your value");
    } 

}
