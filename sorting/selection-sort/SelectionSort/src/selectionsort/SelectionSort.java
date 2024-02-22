package selectionsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {
    
    public static void main(String[] args) {
        
//        List<Integer> smallList = new ArrayList();
//        smallList.addAll(addNumbers(100));
//        recordsTimeComplexity(smallList);
//        // Nanoseconds: 762100
//        // Miliseconds: 0.0
//        
//        List<Integer> mediumList = new ArrayList();
//        mediumList.addAll(addNumbers(1_000));
//        recordsTimeComplexity(mediumList);

        List<Integer> largeList = new ArrayList();
        largeList.addAll(addNumbers(1_000_000));
        recordsTimeComplexity(largeList);

        // Do you want to explode your pc?
//        List<Integer> massiveList = new ArrayList();
//        massiveList.addAll(addNumbers(1_000_000_000));
//        recordsTimeComplexity(massiveList);
//        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

        
        
        
    }

    private static void selectionSort(List<Integer> numbers) {
        
        int listSize = numbers.size();
        
        for (int i = 0; i < listSize - 1; i++) {
            
            int min = numbers.get(i);
            int index = i;
            
            for (int j = i + 1; j < listSize; j++) {
                if (numbers.get(j) < min) {
                    min = numbers.get(j);
                    index = j;
                }
            }
            
            swap(numbers, i, index);
        }
    }

    private static void swap(List<Integer> list, int index, int indexOfMin) {
        int temp = list.get(index);
        list.set(index, list.get(indexOfMin));
        list.set(indexOfMin, temp);
    }
    
    private static List<Integer> addNumbers (int quantity) {
        
        List<Integer> list = new ArrayList();
        Random random = new Random();
        
        for (int i = 0; i < quantity; i++) {
            list.add(random.nextInt(100));
        }
        
        return list;
    }

    private static void recordsTimeComplexity(List list) {
        
        // Record the start time in nanoseconds
        long start = System.nanoTime();
        
        // Sort the list
        selectionSort(list);
        
        // Record the end time in nanoseconds
        long end = System.nanoTime();
        
        // Converts in miliseconds
        long nanoseconds =  end - start;
        double miliseconds = nanoseconds / 1_000_000;

        System.out.println("Nanoseconds: " + nanoseconds);
        System.out.println("Miliseconds: " + miliseconds);
    }

}


