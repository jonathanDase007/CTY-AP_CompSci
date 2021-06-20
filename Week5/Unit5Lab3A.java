public class Unit5Lab3A {
    public static void main(String[] arg){
        System.out.println("1, 2, 3: " + minimum(1, 2, 3));
        System.out.println("4, 6, 10: " + minimum(4, 6, 10));
        System.out.println("0, 21, 30: " + minimum(0, 21, 30));

        System.out.println("1, 2, 3: " + maximum(1, 2, 3));
        System.out.println("4, 6, 10: " + maximum(4, 6, 10));
        System.out.println("0, 21, 30: " + maximum(0, 21, 30));



    }


    public static int minimum(int a, int b, int c){
        int min = 0;
        while(a > 0 && b > 0 && c > 0){
            a--;
            b--;
            c--;
            min ++;
        }
        return min;
    }

    public static int maximum(int a, int b, int c){
        int max = 0;
        while(a > 0 || b > 0 || c > 0){
            a--;
            b--;
            c--;
            max++;
        }
        return max;
    }

}
