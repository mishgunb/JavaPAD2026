package lr3.Task6;

import java.util.LinkedList;

public class ClassLinkedList {
    public static void main(String[] args) {
        int N = 100;
        LinkedList<Integer> circle = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
        }

        System.out.println("Остался человек с номером: " + circle.getFirst());
    }
}