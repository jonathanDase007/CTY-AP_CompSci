import java.util.*;
public class ArrayToolsTest2 {

    public static void main(String[] args){
        ArrayToolsTest2();
    }

    //minimum ArrayTool Method
    public static char minimum(char array[]){
        int minimum = 0;
        char min = 'a';
        for (char j: array){
            if ((int) j < minimum){
                minimum = (int) j;
                min = j;
            }
        }
        return min;
    }

    public static int minimum(int array[]){
        int minimum = 10000;
        int min = 0;
        for (int j: array){
            if (j < minimum){
                minimum = j;
                min = j;
                
            }
        }
        return min;
    }

    public static double minimum(double array[]){
        double minimum = 1000;
        double min = 0;
        for (double j: array){
            if (j < minimum){
                minimum =  j;
                min = j;
            }
        }
        return min;
    }

    //maximum ArrayTool Method
    public static char maximum(char array[]){
        int maximum = 0;
        char min = 'a';
        for (char j: array){
            if ((int) j > maximum){
                maximum = (int) j;
                min = j;
            }
        }
        return min;
    }

    public static int maximum(int array[]){
        int maximum = 0;
        int min = 10000;
        for (int j: array){
            if (j > maximum){
                maximum =  j;
                min = j;
            }
        }
        return min;
    }

    public static double maximum(double array[]){
        double maximum = 0;
        double min = 10000;
        for (double j: array){
            if (j > maximum){
                maximum =  j;
                min = j;
            }
        }
        return min;
    }

    //Returns minium Index
   public static int minimumAt(char array[]){
    int minimum = 0;
    char min = 'a';
    int min_index = 0;
    int index = 0;
    for (char j: array){

        if ((int) j < minimum){
            minimum = (int) j;
            min = j;
            min_index = index;
        }
        index ++;
    }
    return min_index;
}

    public static int minimumAt(int array[]){
        int minimum = 1000;
        int index = 0;
        int min_index = 0;
        for (int j: array){
            if (j < minimum){
                minimum =  j;
                min_index = index;
            }
            index++;
        }
        return min_index;
    }

    public static double minimumAt(double array[]){
        double minimum = 10000;
        double min = 0;
        int index = 0;
        int min_index = 0;
        for (double j: array){
           if (j < minimum){
                minimum =  j;
                min = j;
                min_index = index;
            }
            index++;

        }
        return min_index;
    }


    //Returns max Index
    public static int maximumAt(char array[]){
        int minimum = 0;
        char min = 'a';
        int min_index = 0;
        int index = 0;
        for (char j: array){
    
            if ((int) j > minimum){
                minimum = (int) j;
                min = j;
                min_index = index;
            }
            index ++;
        }
        return min_index;
    }
    
        public static int maximumAt(int array[]){
            int minimum = 0;
            int index = 0;
            int min_index = 0;
            for (int j: array){
                if (j > minimum){
                    minimum =  j;
                    min_index = index;
                }
                index++;
            }
            return min_index;
        }
    
        public static double maximumAt(double array[]){
            double minimum = 0;
            double min = 10000;
            int index = 0;
            int min_index = 0;
            for (double j: array){
               if (j > minimum){
                    minimum =  j;
                    min = j;
                    min_index = index;
                }
                index++;
    
            }
            return min_index;
        }
    
    
    //returns average
    public static double average(int array[]){
        int total = 0;
        for(int x: array){
            total += x;
        }
        return total/array.length;
    }

    public static double average(double array[]){
        double total = 0;
        for(double x: array){
            total += x;
        }
        return total/array.length;
    }

    //equals
    public static boolean equals(char a1[], char a2[]){
        return Arrays.equals(a1, a2);
    }
    public static boolean equals(int a1[], int a2[]){
        return Arrays.equals(a1, a2);
    }
    public static boolean equals(double a1[], double a2[]){
        return Arrays.equals(a1, a2);
    }

    //finds index
    public static int find(char a1[], char a){
        int x = Arrays.binarySearch(a1, a);
        if (x >= 0){
            return x;
        }
        return -1;

    }
    public static int find(int a1[], int a){
        int x = Arrays.binarySearch(a1, a);
        if (x >= 0){
            return x;
        }
        return -1;

    }
    public static int find(double a1[], double a){
        int x = Arrays.binarySearch(a1, a);
        if (x >= 0){
            return x;
        }
        return -1;

    }

    //sorts lists
    public static void sort(char a1[]){
        Arrays.sort(a1);
    }

    public static void sort(int a1[]){
        Arrays.sort(a1);
    }

    public static void sort(double a1[]){
        Arrays.sort(a1);
    }

    //test methods
    public static void ArrayToolsTest(){
        char[] testchar = {'a','b','c','d','e','f','g','h','i','j'};
        int [] testint = {1,2,3,4,5,6,7,8,9,10,0};
        double [] testdouble = {1.5, 3.7, 4.2, 9.3, 10.0, 3.7, 4.7, 9.9, 9.7};

        //test char's
        System.out.println(minimum(testchar) == 'a');
        System.out.println(maximum(testchar) == 'j');
        System.out.println(minimumAt(testchar) == 0);
        System.out.println(maximumAt(testchar) == 9);
        System.out.println("-------------" +'\n');

        //test int's
        System.out.println(minimum(testint) == 0);
        System.out.println(maximum(testint) == 10);
        System.out.println(minimumAt(testint)== 10);
        System.out.println(maximumAt(testint) == 9);
        System.out.println(average(testint) == 5);
        System.out.println("-------------" +'\n');

        //Test doubles
        System.out.println(minimum(testdouble) == 1.5);
        System.out.println(maximum(testdouble) == 10.0);
        System.out.println(minimumAt(testdouble) == 0);
        System.out.println(maximumAt(testdouble) == 4);
        System.out.println(average(testdouble) == 6.300000000000001);
        System.out.println("-------------" +'\n');

    }

    //tests last 3 methods
    public static void ArrayToolsTest2(){
        char[] testchar = {'a','b','c','d','e','f','g','h','i','j'};
        char[] testchar2 = {'a','b','c','d','e','f','h','i','j', 'g'};

        int [] testint = {1,2,3,4,5,6,7,8,9,10,0};
        int [] testint2 = {1,2,3,4,5,6,7,8,9,10};

        double [] testdouble = {1.5, 3.7, 4.2, 9.3, 10.0, 3.7, 4.7, 9.9, 9.7};
        double [] testdouble2 = {3.7, 4.2, 9.3, 10.0, 3.7, 4.7, 9.9, 9.7};

        //test for char
        System.out.println(equals(testchar, testchar) == true);
        System.out.println(equals(testchar, testchar2) == false);
        System.out.println(find(testchar, 'a') == 0);
        System.out.println(find(testchar, 'd') == 3);
        sort(testchar);
        for (int i = 0; i < testchar.length; i++){
            System.out.print(testchar[i]);
            System.out.print(", ");
        }
        System.out.println("\n-------------\n");

        //tests for ints
        System.out.println(equals(testint, testint) == true);
        System.out.println(equals(testint, testint2) == false);
        System.out.println(find(testint, 1) == 0);
        System.out.println(find(testint, 3) == 2);
        sort(testint);
        for (int i = 0; i < testint.length; i++){
            System.out.print(testint[i]);
            System.out.print(", ");
        }
        
        System.out.println("\n-------------\n");

        //test for doubles
        System.out.println(equals(testdouble, testdouble) == true);
        System.out.println(equals(testdouble, testdouble2) == false);
        System.out.println(find(testdouble, 1.5) == 0);
        System.out.println(find(testdouble, 9.3) == 3);
        sort(testdouble);
        for (int i = 0; i < testdouble.length; i++){
            System.out.print(testdouble[i]);
            System.out.print(", ");
        }


    }

}
