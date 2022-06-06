package baekjoon.bronze;

import java.util.Scanner;

public class 최소_최대 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] list = new int[scanner.nextInt()];
        for(int i=0; i<list.length; i++){
            list[i] = scanner.nextInt();
        }
        int max = list[0];
        int min = list[0];

        for(int i=0; i<list.length; i++){
        if(max < list[i]) max = list[i];
        if(min > list[i]) min = list[i];

        }
        System.out.println(min);
        System.out.println(max);
    }
}
