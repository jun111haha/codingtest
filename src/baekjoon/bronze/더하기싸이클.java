package baekjoon.bronze;

import java.util.Scanner;

public class 더하기싸이클 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy = n;
        int i = 0;

        while(true) {
            int left = copy / 10;
            int right = copy % 10;
            copy = right * 10 + (left + right) % 10;
            i++;
            if(n == copy) {
                break;
            }
        }

        System.out.println(i);
    }
}
