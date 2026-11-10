package Java8;
import java.util.*;
import java.util.stream.Collectors;
public class FindDuplicateElements {
    //to find duplicate elements in array using stream api
    public static void main(String[] args) {
        int arr[] = {1,5,2,1,1,9,7,8,9};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("Input Array : "+Arrays.toString(arr));
        System.out.println("Duplicates elements :"+duplicates);
    }

    public static List<Integer> findDuplicates(int[] arr) {
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
