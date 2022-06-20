package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        st = new StringTokenizer(br.readLine());
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int i=0; i<n; i++) {
            hashSet1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            hashSet2.add(Integer.valueOf(st.nextToken()));
        }

        int cnt = 0;
        for(int i : hashSet1){
            if(!hashSet2.contains(i)){
                cnt++;
            }
        }

        for(int i : hashSet2){
            if(!hashSet1.contains(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
