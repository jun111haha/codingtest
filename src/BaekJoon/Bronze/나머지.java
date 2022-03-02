package BaekJoon.Bronze;

import java.util.Scanner;

/*
문제
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

boolean 으로 판단, 42로 나눈 나머지값을 list 에 저장 이중 for 문을 돌려서 if문으로 중복값이 있으면 true 로 반환후 break
그 후 if문을 통해서 중복값이 없으면 count++ 처리.
* */
public class 나머지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] list = new int[10];
        int count = 0;
        boolean check;

        for(int i=0; i<list.length; i++){
            list[i] = scanner.nextInt() % 42;
        }

        for(int i=0; i<list.length; i++){
            check = false;
            for(int j= i+1; j<list.length; j++){
                if(list[i] == list[j]){
                    check = true;
                    break;
                }
            }
          if(check == false){
              count++;
          }
        }
        System.out.println(count);
    }
}
