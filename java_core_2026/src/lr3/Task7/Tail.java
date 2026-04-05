package lr3.Task7;

public class Tail {
    public static void main(String[] args) {

        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node2.next = node3;
        node1.next = node2;
        node0.next = node1;

        Node ref = node0;
        System.out.print("Список: ");
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}

