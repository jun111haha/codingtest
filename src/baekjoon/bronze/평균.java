package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] list = new double[scanner.nextInt()];
        double result = 0;

        for(int i=0; i<list.length; i++){
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);
        for(int i=0 ;i<list.length; i++){
            result += ((list[i] / list[list.length - 1]) * 100);
        }

        System.out.println(result / list.length);

    }
}
