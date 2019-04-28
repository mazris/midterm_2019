package datastructure;

import java.io.*;
import java.util.*;

public class DataReader {
    public static void Read_File(String path) {
        String a;
        String text = null;
        FileReader file_Reader = null;
        Stack<String> stack = new Stack<String>();
        List<String> linkedList = new LinkedList<>();
        try {
            file_Reader = new FileReader(path);
            BufferedReader buffered = new BufferedReader(file_Reader);

            while ((a = buffered.readLine()) != null) {
                String[] str=a.split(" ");
                for(String s: str){
                    linkedList.add(s);
                }
                for(String s: str){
                    //push
                    stack.push(s);
                }

            }

            ListIterator<String> it = linkedList.listIterator();
            while(it.hasNext()){
                System.out.print(it.next()+". ");
            }
            System.out.println(" ");
            //stack methods
            System.out.println("element on the top of the list is "+stack.peek());
            System.out.println("value of index 2 is"+stack.get(2));
            stack.pop();
            Iterator its= stack.iterator();
            while (its.hasNext()){
                System.out.print(its.next()+". ");
            }


            buffered.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
        Read_File(textFile);



    }

}
