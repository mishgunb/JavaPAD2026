package lr2;

public class Task2 {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;


        int[][] array = new int[rows][cols];

        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}

