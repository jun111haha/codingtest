package BaekJoon.Bronze;

import java.util.Scanner;

public class 그룹단어체커 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

      for(int i=0; i<n; i++){
          String x = scanner.next();
          boolean [] check = new boolean[26];
          boolean tmp = true;

          for(int j =0; j<x.length(); j++){
              int index = x.charAt(j) - 'a';
              if(check[index]){
                  if(x.charAt(j) != x.charAt(j-1))
                      tmp = false;
                      break;
              }else{
                  check[index] = true;
              }
          }
          if(tmp) cnt++;
      }
        System.out.println(cnt);
    }
}
