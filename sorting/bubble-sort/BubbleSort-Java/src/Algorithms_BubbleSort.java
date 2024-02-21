
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms_BubbleSort {

    public static void main(String[] args) {
        
        // Create a new unsorted list
        List<Integer> numbers = new 
        ArrayList(Arrays.asList(2, 50, 41, 12, 81, 1, 6));
        
        // Displaying the unsorted list
        System.out.println("Unsorted Numbers: " + numbers);
        
        // Sorting the numbers
        bubbleSort(numbers);
        
        // Displaying the sorted numbers 
        System.out.println("Sorted Numbers: " + numbers);
        
    }
    public  static List<Integer> bubbleSort(List<Integer> arr) {
        
        
        for (int i = arr.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                
                if (arr.get(j) > arr.get(j+1)) {
                    
                    int temp = arr.get(j);
                    
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);                    
                }
            }
        }
        
        return arr;
    }
}
