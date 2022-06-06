package baekjoon.bronze;

import java.util.Scanner;

public class 숫자의개수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result = (scanner.nextInt() * scanner.nextInt() * scanner.nextInt());
        String str = Integer.toString(result);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                //char 를 int 형으로 반환
                if ((str.charAt(j) - '0') == i) count++;
            }
            System.out.println(count);
        }
    }
}
