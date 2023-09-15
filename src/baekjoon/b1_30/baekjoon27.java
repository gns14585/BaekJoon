package baekjoon.b1_30;

import java.util.HashSet;
import java.util.Scanner;

public class baekjoon27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int I = sc.nextInt();
            s.add(I % 42);
        }
        System.out.println(s.size());
    }
}
