package baekjoon.silver;

import java.util.Scanner;

public class 국회의원선거 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();

        int result = 0;
        while(true){
            //돌 때 마다 득표수 많은 사람 찾아야함
            int maxPerson =0;
            for(int i=0; i<n; i++){
                if(arr[i] >= arr[maxPerson])
                    maxPerson = i;
            }
            if(maxPerson ==0){
                break;
            }

            arr[0]++;
            arr[maxPerson]--;
            result++;
        }
        System.out.println(result);
    }
}
