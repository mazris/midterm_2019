package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        Random random= new Random();
        //add
        for(int i =0 ; i<20 ;i++){

            arraylist.add(random.nextInt(100));
        }

        //peek
        System.out.println("first element "+arraylist.get(0));
        System.out.println("dernier element "+arraylist.get(arraylist.size()-1));
        //remove the first element
        arraylist.remove(0);
        //Iterator
         Iterator<Integer> it = arraylist.iterator();
         while (it.hasNext()){
         System.out.print(it.next()+",");
         }
         System.out.println(" ");
         //For each
        for(Integer i : arraylist){
            System.out.print(i+",");
        }

    }

}
