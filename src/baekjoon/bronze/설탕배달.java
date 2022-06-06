package baekjoon.bronze;

import java.util.Scanner;

/*
* 5로 나누어지면 바로 출력
* 아니면 -3 하고 cnt 증감
* -3 음수? -1 출력
* */
public class 설탕배달 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cnt = 0;

        while(true){
            if(x%5==0){
                cnt += x/5;
                System.out.println(cnt);
                break;
            }else{
                x -= 3;
                cnt++;
            }

            if(x <0){
                System.out.println(-1);
                break;
            }
        }
    }
}
