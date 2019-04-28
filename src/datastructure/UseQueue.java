package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<Integer> q = new LinkedList<>();
        // add 20 elements to our queue
        for (int i=0; i<20; i++)
            q.add(i);
        //peek
        int first= q.peek();
        System.out.println("head of our queue  is :" + first);
        //remove the head of the queue
        int removed = q.remove();
        System.out.println("removed element is : " + removed);
        //pool is like remove the difference is that when the queue is empty remove
        //throws an exception but poll returns a the value null
        System.out.println("removed element using poll : "+q.poll());
        for(Integer i : q){
            System.out.print(i+"--");
        }
        System.out.println(" ");
        //Iterator
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ,");
        }


    }

}
