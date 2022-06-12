package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            Long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        for(Map.Entry<Long, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
            }
        }

        PriorityQueue<Long> q = new PriorityQueue<>();
        for(Long key : map.keySet()){
            if(max == map.get(key)){
                q.add(key);
            }
        }
        System.out.println(q.poll());
    }
}
