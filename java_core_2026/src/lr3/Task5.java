package lr3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Audi");
        map.put(1, "Mercedes");
        map.put(2, "BMW");
        map.put(3, "Volkswagen");
        map.put(4, "Tesla");
        map.put(5, "Ford");
        map.put(6, "Chevrolet");
        map.put(7, "Volvo");
        map.put(8, "Mazda");
        map.put(9, "Kia");
        map.put(10, "Lamborghini");

        System.out.println("\nСтроки с ключом > 5:");
        map.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nСтроки с ключом 0:");
        String zeroValues = map.entrySet().stream()
                .filter(entry -> entry.getKey() == 0)
                .map(Map.Entry::getValue)
                .collect(Collectors.joining(", "));
        System.out.println(zeroValues);

        int product = map.entrySet().stream()
                .filter(entry -> entry.getValue().length() > 5)
                .mapToInt(Map.Entry::getKey)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Произведение ключей, где длина строки > 5: " + product);
    }
}