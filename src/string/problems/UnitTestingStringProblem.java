package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingStringProblem {
    public static void testAnagram(){
        assertEquals(true,Anagram.anagram("mary","army"));
    }
    public static void testLargestWord(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10,"biological");
        assertEquals(map,DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine"));
    }
    public static void testDuplicate(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java",2);map.put("is",2); map.put("has",1);
        assertEquals(map,DuplicateWord.duplicate("java is java is has"));
        assertEquals(15.0,DuplicateWord.average(map));
    }
    public static void testPalindrom(){
        assertEquals(true,Palindrome.isPalindrom("mom"));
    }
   public static void testPermutaion(){
       ArrayList<String> s= new ArrayList<String>();
       ArrayList<String> s2= new ArrayList<String>();
       s.add("ABC"); s.add("ACB"); s.add("BAC"); s.add("BCA"); s.add("CAB"); s.add("CBA");
       assertEquals(s,Permutation.permute(s2,"","ABC"));
   }
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        testAnagram();
        testLargestWord();
        testDuplicate();
        testPalindrom();
        testPermutaion();

    }

}
