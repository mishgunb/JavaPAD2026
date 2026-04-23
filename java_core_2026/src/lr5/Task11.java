package lr5;

import java.util.*;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Введите значение:");
        int maxValue = scanner.nextInt();

        List<Integer> filteredNumbers = filterBelowValue(numbers, maxValue);

        System.out.println("\nИсходный список: " + numbers);
        System.out.println("Числа меньше " + maxValue + ": " + filteredNumbers);
    }

    public static List<Integer> filterBelowValue(List<Integer> list, int maxValue) {
        return list.stream()
                .filter(x -> x < maxValue)
                .collect(Collectors.toList());
    }
}