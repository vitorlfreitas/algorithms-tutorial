
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList(Arrays.asList(15, 20,  105, 45, 30, 11, 1, 2, 47, 1550, 111, 4));
        System.out.println(numbers);
        
        InsertionSort obj = new InsertionSort();
        obj.sort(numbers);
        
        System.out.println(numbers);
        
        

    }
    
}
