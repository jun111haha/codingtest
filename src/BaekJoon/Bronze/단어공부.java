package BaekJoon.Bronze;

import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[26];
        String x = scanner.next().toUpperCase();

        //반복문을 돌면서 해당 문자가 어떤 문자냐에 따라 해당 배열 원소를 증가시켜주어야 한다.
        for(int i=0; i< x.length(); i++){
            int num = x.charAt(i) - 'A';
            arr[num]++;
        }

        int max = 0;
        char answer = '?';
        //저장된 arr 배열에서 max값을 찾아 많이 증감된 알파벳을 찾는다.
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i+'A');
            } else if (max == arr[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
