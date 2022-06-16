package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 암기왕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Z = Integer.parseInt(br.readLine());
        for(int z=0; z<Z; z++){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            //HashSet : 중복을 자동으로 제거, 저장순서 유지X
            HashSet<Integer> hashSet = new HashSet<>();
            for(int i=0; i<N; i++){
                hashSet.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                if(hashSet.contains(num)){
                    sb.append("1\n");
                }else{
                    sb.append("0\n");
                }
            }
        }
        System.out.println(sb);
    }
}
