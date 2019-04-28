package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.print(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String str[]=wordGiven.split(" ");
        int max =0;
        String st="";
        for(int i=0;i<str.length;i++){
            if(max<str[i].length()) {max= str[i].length(); st =str[i];}
        }
        map.put(max,st);

        //implement


        return map;
    }
}
