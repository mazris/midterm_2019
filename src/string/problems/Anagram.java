package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String s1, String s2) {
        //convert String to an array of chars toCharArray()
        char[] charFromString1 = s1.toCharArray();
        char[] charFromString2 = s2.toCharArray();
        //sort an array
        Arrays.sort(charFromString1);
        Arrays.sort(charFromString2);
        //equals verify if two arrays are equals
        if (Arrays.equals(charFromString1, charFromString2)) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String s1 = sc.nextLine();
        System.out.println("Please enter the second  word");
        String s2 = sc.nextLine();
        if (anagram(s1, s2)) System.out.println("the words " + s1 + " and " + s2 + " are Anadram");
        else System.out.println("the words " + s1 + " and " + s2 + " are not Anadram");

    }
}
