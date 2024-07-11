// Generic sınıf tanımı
public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    // Generic alanı ekrana yazdıran metod
    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Farklı tipler için generic sınıfın kullanımı
        GenericClass<String> stringInstance = new GenericClass<>("Hello, World!");
        stringInstance.printValue();

        GenericClass<Integer> integerInstance = new GenericClass<>(123);
        integerInstance.printValue();

        GenericClass<Double> doubleInstance = new GenericClass<>(456.78);
        doubleInstance.printValue();
    }
}
