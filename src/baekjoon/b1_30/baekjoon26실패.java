package baekjoon.b1_30;

import java.util.Scanner;

public class baekjoon26실패 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for (int j = I-1; j < J; j++) {
                arr[j] = K;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
