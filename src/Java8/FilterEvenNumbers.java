package Java8;
import java.util.*;
import java.util.stream.Collectors;
public class FilterEvenNumbers {
    // filter even numbers using stream api
    static void main(String[] args) {
        int arr[] = {10,15,20,30};

        List<Integer> evenNumbers = Arrays.stream(arr).filter(num -> num % 2==0).boxed().collect(Collectors.toList());
        System.out.println("Inputed array: " + Arrays.toString(arr));
        System.out.println("Even numbers"+evenNumbers);
    }

}
