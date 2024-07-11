import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class StreamFindElement {
    public static <T> T findElementOrDefault(List<T> list, T element) {
        Optional<T> foundElement = list.stream()
                .filter(e -> e.equals(element))
                .findFirst();
        return foundElement.orElse(null); // Öğeyi bulamazsa null döner
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        System.out.println(findElementOrDefault(stringList, "banana")); // Output: banana
        System.out.println(findElementOrDefault(stringList, "orange")); // Output: null

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(findElementOrDefault(intList, 3)); // Output: 3
        System.out.println(findElementOrDefault(intList, 6)); // Output: null
    }
}
