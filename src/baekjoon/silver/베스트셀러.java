package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String , Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
            }
        }

        PriorityQueue<String> q = new PriorityQueue<>();
        for(String str : map.keySet()){
            if(max == map.get(str)){
                q.add(str);
            }
        }

        System.out.println(q.poll());
    }
}
