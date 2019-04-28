package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println(" ");
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        int temp;
        //implement here
       for(int i=1;i<array.length;i++){
           int j=i-1; temp=array[i];
             while(j>=0 &&array[j]>temp) {
                 array[j+1]=array[j];
                 j--;
             }

            array[j+1]=temp;

       }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int a;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

     public int[] mergeSort(int array[], int l, int r) {
         int[] list = array;
         final long startTime = System.currentTimeMillis();
         if(r>l)
         {
             int m = (l+r)/2;
             mergeSort(array,l,m);
             mergeSort(array,m+1,r);
             merge(array,l,m,r);

         }
         final long endTime = System.currentTimeMillis();
         final long executionTime = endTime - startTime;
         this.executionTime = executionTime;
         return list;

     }
    //used for mergeSort
    public int[] merge(int[] array,int l , int m , int r) {
        int[] list = array;
        //implement here
        //n1 to calculate how many elements from left to medium
        int n1= m-l+1;
        //n2 to calculate how many elements from after medium to right
        int n2= r-m;
        //L will contain elements from left to medium
        int[] L=new int[n1];
        //R will contain elements from after medium to right
        int[] R=new int[n2];
        //k to start from the left of the current devided part
        int k=l;
        for(int i =0 ; i< n1; i++){
            L[i]= array[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]= array[m+1+i];
        }
        int i=0; int j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) {
                array[k]=L[i]; i++;
            }else {
                array[k]=R[j]; j++;
            }
            k++;
        }
        while(i<n1)
        {
            array[k]=L[i]; i++;k++;
        }
        while(j<n2)
        {
            array[k]=R[j]; j++;k++;
        }

       return list;

    }
     //used for quickSort
     public static int partition(int A[], int low , int high){
         int pivot = A[high];
         int i=low-1;
         int temp;
         for(int j=low;j<=high-1;j++){
             if(A[j]<=pivot){
                 i++;
                 temp=A[j];
                 A[j]=A[i];
                 A[i]=temp;
             }
         }
         temp=A[high];
         A[high]=A[i+1];
         A[i+1]=temp;
         return (i+1);

     }
    public int[] quickSort(int[] array,int low , int high) {
        int[] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here
        if(low<high)
        {
            int p = partition(array,low,high);
            // to verify elements before the pivot
            quickSort(array,low,p-1);
            //to verify elements after the pivot
            quickSort(array,p+1,high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //used for heapSort
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2
        int temp;
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {    temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        int n =array.length;
        int temp;
        final long startTime = System.currentTimeMillis();
        //implement here
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            temp=array[0]; array[0]=array[i];array[i]=temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    //used for bucketSort
    private static int[] hash(int[] input) {
        int m = input[0];
        for (int i = 1; i < input.length; i++) {
            if (m < input[i]) { m = input[i];
            }
        } return new int[] {
                m, (int) Math.sqrt(input.length)
        };
    }
    private static int hash(int i, int[] code) {

        return (int) ((double) i / code[0] * (code[1] - 1));
    }




    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        // get hash codes
        final int[] code = hash(array);
        // create and initialize buckets to ArrayList: O(n)
        List[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++) {
            buckets[i] = new ArrayList(); }
        // distribute data into buckets: O(n)
        for (int i : array) {
            buckets[hash(i, code)].add(i);
        }
        // sort each bucket O(n)
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int ndx = 0;
        // merge the buckets: O(n)
        for (int b = 0; b < buckets.length; b++) {
            for (Object v : buckets[b]) {
                array[ndx++] = (int) v;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        int n = array.length;
        final long startTime = System.currentTimeMillis();
        //implement here
        for (int k = n/2; k > 0; k /= 2)
        {

            for (int i = k; i < n; i += 1)
            {

                int temp = array[i];


                int j;
                for (j = i; j >= k && array[j - k] > temp; j -= k)
                    array[j] = array[j - k];


                array[j] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
}
