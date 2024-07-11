import java.util.List;
import java.util.Arrays;

public class FindElement {
    public static <T> T findElement(List<T> list, T element) {
        return list.stream()
                .filter(e -> e.equals(element))
                .findFirst()
                .orElse(null); // Öğeyi bulamazsa null döner
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        System.out.println(findElement(stringList, "banana")); // Output: banana
        System.out.println(findElement(stringList, "orange")); // Output: null

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(findElement(intList, 3)); // Output: 3
        System.out.println(findElement(intList, 6)); // Output: null
    }
}
