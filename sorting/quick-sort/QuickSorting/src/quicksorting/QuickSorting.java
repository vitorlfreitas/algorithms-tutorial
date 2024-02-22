package quicksorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSorting {
    
    public static void main(String[] args) {
        
        // Uncomment and run the code and compare them
        
        System.out.println("Array with 10,000 elements");
        List<Integer> smallList = new ArrayList<>();
        smallList.addAll(addNumbers(10000));
        recordsTimeComplexity(smallList);
        
//        System.out.println("Array with 1,000,000 elements");
//        List<Integer> mediumList = new ArrayList<>();
//        mediumList.addAll(addNumbers(100_000));
//        recordsTimeComplexity(mediumList);
 
//        System.out.println("Array with 1,000,000 elements");
//        List<Integer> largeList = new ArrayList<>();
//        largeList.addAll(addNumbers(1_000_000_000));
//        recordsTimeComplexity(largeList);
    
    }

    // QuickSort method
    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            // Partition the array into 2 halves
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int indexSmallerElement = low - 1;
        
        for (int i = low; i < high; i++) {
            if (list.get(i) <= pivot) {
                indexSmallerElement++;
                // Swap list[i] and list[indexSmallerElement]
                int temp = list.get(i);
                list.set(i, list.get(indexSmallerElement));
                list.set(indexSmallerElement, temp);
            }
        }
        
        // Swap list[indexSmallerElement + 1] and list[high] (or pivot)
        int temp = list.get(indexSmallerElement + 1);
        list.set(indexSmallerElement + 1, list.get(high));
        list.set(high, temp);
        
        return indexSmallerElement + 1;
    }
    
    private static List<Integer> addNumbers(int quantity) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < quantity; i++) {
            list.add(random.nextInt(100));
        }
        
        return list;
    }

    private static void recordsTimeComplexity(List<Integer> list) {
        // Record the start time in nanoseconds
        long start = System.nanoTime();
        
        // Sort the list
        quickSort(list, 0, list.size() - 1);
        
        // Record the end time in nanoseconds
        long end = System.nanoTime();
        
        // Converts in miliseconds
        long nanoseconds =  end - start;
        double milliseconds = nanoseconds / 1_000_000.0;
        System.out.println();
        checkIfListIsSorted(list);
        System.out.println("Nanoseconds: " + nanoseconds);
        System.out.println("Milliseconds: " + milliseconds);
    }
    private static boolean isSorted(List<Integer> list) {
        
        for (int i = 0; i < list.size() - 1; i++) {
            int element = list.get(i);
            int nextElement = list.get(i + 1);
            
            if (element > nextElement) {
                return false;
            }
        }
        return true;
    }
    
    private static void checkIfListIsSorted(List<Integer> list) {
        if (isSorted(list)) 
            System.out.println("List is Sorted");
        else
            System.out.println("List is not sorted");
    }
}
