package baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            Map<String , Integer> map = new HashMap<>();

            for(int j=0; j<m; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int cnt = 1;
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                cnt = cnt * (entry.getValue() + 1);
            }
            sb.append(cnt -1 + "\n");
        }
        System.out.println(sb);
    }
}
