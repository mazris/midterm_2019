package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        algo.printSortedArray(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        //List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        //printValue(numbers);
        int n = num.length;
        randomize(num, n);

        //Insertion Sort
        algo.insertionSort(num);
        algo.printSortedArray(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
        //printValue(numbers);
        //By following above, Continue for rest of the Sorting Algorithm....
        //BubbleSort Sort
        randomize(num,n);
        algo.bubbleSort(num);
       algo.printSortedArray(num);
        long bubbleSortExecutionTime=algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
       // connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
        //printValue(numbers);

        //MergeSort
        randomize(num,n);
        algo.mergeSort(num,0,num.length-1);
         algo.printSortedArray(num);
        long mergeSortExecutionTime=algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in merge Sort take: " + mergeSortExecutionTime + " milli sec");
       // connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
        //printValue(numbers);
        //QuickSort
        randomize(num,n);
        algo.quickSort(num,0,num.length-1);
        algo.printSortedArray(num);
        long quickSortExecutionTime=algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in quick Sort take: " + quickSortExecutionTime + " milli sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
        //printValue(numbers);
        //heap Sort
        randomize(num,n);
        algo.heapSort(num);
         algo.printSortedArray(num);
        long heapSortExecutionTime=algo.executionTime;
       System.out.println("Total Execution Time of " + num.length + " numbers in heap Sort take: " + heapSortExecutionTime + " milli sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
        //printValue(numbers);
        //bucket Sort
        randomize(num,n);
        algo.bucketSort(num);

       algo.printSortedArray(num);
        long bucketSortExecutionTime=algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in bucket Sort take: " + bucketSortExecutionTime + " milli sec");
       // connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
        //printValue(numbers);
        //shell Sort
        randomize(num,n);
        algo.shellSort(num);
        algo.printSortedArray(num);
        long shellSortExecutionTime=algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
       // connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
        //numbers = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
        //printValue(numbers);


        //Come to conclusion about which Sorting Algo is better in given data set.
        //After examining time execution for every sorting algo we notice that they take all
        //about the same time beside the bucket sort which take longer so it is defenitly not
        //the best one . i would say the best one is the quick sorting because it devide the array into
        //2 sides so it takes less time to do the sorting . the selection and bubble for example they compare
        //one by one so they take more time
        //The Best Sorting Algorithm is QUICK SORT

    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
