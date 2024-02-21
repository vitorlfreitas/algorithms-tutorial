package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = 
                new ArrayList(Arrays.asList(15, 50, 45, 1515, 10, 45, 11));
        
        
        System.out.println(numbers);
        
        selectionSort(numbers);
        
        System.out.println(numbers);
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
    
}
