package BaekJoon.Silver;

import java.util.*;

public class 요세푸스문제0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);

        int cnt =0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()){
            cnt++;
            if(cnt % m == 0){
                sb.append(queue.poll()).append(", ");
                cnt = 0;
            }else{
                queue.offer(queue.poll());
            }
        }
        sb.setLength(sb.length()-2);
        sb.append(">");
        System.out.println(sb);
    }
}
