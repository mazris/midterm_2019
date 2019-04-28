package math.problems;

import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Integer> fibonacci(int n){
        int a =0; int b=1;
        ArrayList<Integer> array = new ArrayList<Integer>();
        int c=a+b;;
        array.add(a); array.add(b); array.add(c);
        for(int i=3;i<=n;i++ ){
            a=b;
            b=c;
            c=a+b;
            array.add(c);


        }
        return array;
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         ArrayList<Integer> array=new ArrayList<Integer>();
        array= fibonacci(5);
        System.out.print(array);

    }
}
