package lr5.timus;

import java.util.Scanner;

public class Task1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double R = scanner.nextDouble();
        double[][] points = new double[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        double perimeter = 0.0;
        for (int i = 0; i < N; i++) {
            int next = (i + 1) % N;
            double dx = points[next][0] - points[i][0];
            double dy = points[next][1] - points[i][1];
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }

        double totalLength = perimeter + 2 * Math.PI * R;
        String result = String.format("%.2f", totalLength).replace(',', '.');
        System.out.println(result);
    }
}