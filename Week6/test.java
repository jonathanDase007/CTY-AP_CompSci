public class test {
    public static void main(String[] args){
        int [][] myArray = { {2, 7, 8, 6}, {1, 4, 9, 0}, {5, 1, 4, 3} };
        manipulate( myArray, 1 );
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j <myArray[i].length; j++){
                System.out.print(myArray[i][j]);
                System.out.print(' ');
            }
            System.out.print("\n");
        }

        
        
    }

    public static void changeArray( int[] p, int v ){
        p[ v ] = 12;
        v = 5;
    }

    public static void manipulate( int [][] matrix, int row )
{
     int cols = matrix[0].length;
     for( int c = 0; c < cols; c++ )
          matrix[row][c] = row;
}

}
