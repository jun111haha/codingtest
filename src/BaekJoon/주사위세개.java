package BaekJoon;

import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int result =0;

        if(s1 == s2 && s1 == s3 && s2 == s3){
            result +=10000 + s1 * 1000;
        }else if(s1 == s2 || s1 == s3) {
            result += 1000 + s1 * 100;
        }else  if(s2 == s3){
            result += 1000 + s2 * 100;
        }else{
            result += (Math.max(s1, Math.max(s2, s3))*100);
        }

        System.out.println(result);
    }
}
