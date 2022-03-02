package BaekJoon.Bronze;

import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int [] arr = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<a; i++){
            if(arr[i] < b){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
