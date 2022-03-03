package BaekJoon.Bronze;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int x;
        String y;

        for(int i=0; i<testCase; i++){

            x = scanner.nextInt();
            y = scanner.next();

            for(int j=0; j<y.length(); j++){
                for(int k=0; k<x; k++){
                    System.out.print(y.charAt(j));
                }
            }
            System.out.println();

        }

    }
}
