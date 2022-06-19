package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/*
* 시간복잡도 O(N)을 가진다.
우선순위 큐에 숫자를 담는다.
자동으로 오름차순으로 데이터를 정렬
큐의 사이즈가 n이 되면 맨 앞의 숫자(n개의 수 중 가장 작은 숫자)와 새로운 값을 비교한다.
새로운 값이 더 클 경우 데이터를 바꿔준다.
새로운 값이 작을 경우 그대로 유지한다.
* */

public class N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<>();
        StringTokenizer st = null;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                if(queue.size() == n){
                    if(queue.peek() < num){
                        queue.poll();
                        queue.add(num);
                    }
                }else{
                    queue.add(num);
                }
            }
        }
        System.out.println(queue.poll());
    }
}
