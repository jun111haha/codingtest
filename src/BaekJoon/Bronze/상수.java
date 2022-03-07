package BaekJoon.Bronze;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        x = Integer.parseInt(new StringBuilder().append(x).reverse().toString());
        y = Integer.parseInt(new StringBuilder().append(y).reverse().toString());

        if(x > y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
