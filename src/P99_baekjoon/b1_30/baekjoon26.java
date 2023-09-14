package P99_baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt() -1;
            int end = sc.nextInt() -1;
            int value = sc.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j] += value;
            }
        }

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
