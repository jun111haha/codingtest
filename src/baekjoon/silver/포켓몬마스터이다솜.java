package baekjoon.silver;

import java.util.HashMap;
import java.util.Scanner;

public class 포켓몬마스터이다솜 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        //HashMap 키값이 다른 2개의 형태로 만들어서 도감완성
        for(int i=1; i<=n; i++){
            String s = scanner.next();
            map1.put(i, s);
            map2.put(s, i);
        }

        //입력값에서 숫자면 map1 도감에서 찾고 숫자가 아니면 map2 도감에서 찾는다.
        for(int i=0; i<m; i++){
            String s = scanner.next();
            if(Character.isDigit(s.charAt(0))){
                sb.append(map1.get(Integer.parseInt(s))).append("\n");
            }else{
                sb.append(map2.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
