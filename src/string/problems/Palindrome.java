package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrom(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str))return true;
        else return false;
    }
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a word");
        String str=sc.next();
        if(isPalindrom(str))System.out.print("palindrom");
        else System.out.print("not palindrom");

    }
}
