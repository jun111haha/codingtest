package baekjoon.bronze;

import java.util.Scanner;
/*
* 1시간은 60분이기에 C분에 60을 나눠서 나온 몫과 나머지를 각 시, 분애 합산
* 분이 60분이상이면 h시에 1시간 추가 후 m분에서 60분 뺴기
* 하루는 24시간이기에 h시가 24 이상이면 h에서 24 빼기
* */
public class 오븐시계 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int m2 = scanner.nextInt();

        h += m2 / 60;
        m += m2 % 60;

        if(m >= 60){
            h++;
            m -= 60;
        }

        if(h >= 24){
            h -= 24;
        }
            System.out.println(h + " " + m);
    }
}
