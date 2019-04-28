package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static Map<String,Integer> duplicate(String st){
        st=st.toLowerCase();
        String str[]= st.split(" ");
        for(int i=0;i<str.length;i++){
            str[i]= str[i].replace(".","");

        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> temp = new ArrayList<String>();
        int count;
        for(int i=0;i<str.length;i++){
            count = 1;
            if(!temp.contains(str[i])) {
                for (int j = 0; j < str.length; j++) {
                    if (i != j && (str[i].equals(str[j]))) count++;
                }

                map.put(str[i], count);
                temp.add(str[i]);
            }


        }
        return map;
    }
    public static double average(Map<String,Integer> map){
        int sum=0; int count=0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            sum+=entry.getValue()*entry.getKey().length();
            count=entry.getValue();
        }
        return sum/count;

    }
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String,Integer> map =duplicate(st);
        System.out.print(map);
        System.out.print("average "+average(map));

    }

}
