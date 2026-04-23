package lr5;

import java.util.*;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();
        List<String> strings = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        System.out.println("Введите длину строки:");
        int stringLength = scanner.nextInt();

        List<String> filteredStrings = filterByLength(strings, stringLength + 1);


        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиной больше " + stringLength + ": " + filteredStrings);
    }

    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() >= minLength)
                .collect(Collectors.toList());
    }
}