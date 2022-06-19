package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) map.put(br.readLine(), 0);

        int cnt = 0;
        for(int i=0; i<m; i++){
            String temp = br.readLine();
            if(map.containsKey(temp)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
