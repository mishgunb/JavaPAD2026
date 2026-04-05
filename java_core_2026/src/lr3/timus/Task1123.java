package lr3.timus;

import java.util.*;

public class Task1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();
        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            a[n - 1 - i] = a[i];
        }

        if (new String(a).compareTo(s) < 0) {
            int i = (n - 1) / 2;
            while (i >= 0 && a[i] == '9') {
                a[i] = '0';
                i--;
            }
            if (i >= 0) {
                a[i]++;
                for (int j = 0; j < n / 2; j++) {
                    a[n - 1 - j] = a[j];
                }
            }
        }

        System.out.println(new String(a));
    }
}