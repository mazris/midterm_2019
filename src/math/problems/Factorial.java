package math.problems;

import java.util.Scanner;

public class Factorial {

    public static int iTFactorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int RecFact(int n){
        if(n==0) return 1;
        else return n*RecFact((n-1));
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int n=sc.nextInt();
        System.out.println(" the factorial of "+n+" with the iteration method is "+iTFactorial(n));
        System.out.println(" the factorial of "+n+" with the Recursion method is "+RecFact(n));
    }
}
