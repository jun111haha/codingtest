package baekjoon.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(x," ");

        System.out.println(st.countTokens());
    }
}
