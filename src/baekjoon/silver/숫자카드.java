package baekjoon.silver;

import java.util.*;

/*
* 이분탐색으로 풀이
* */
public class 숫자카드 {
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);

        m= scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int result = BinarySearch(scanner.nextInt());
            if(result != -1){
                sb.append(1 + " ");
            }else{
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);
    }

    public static int BinarySearch(int num){
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right){
            mid = (left + right) / 2;
            if(arr[mid] < num){
                left = mid + 1;
            }else if(arr[mid] > num){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
