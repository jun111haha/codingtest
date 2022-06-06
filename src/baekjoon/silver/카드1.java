package baekjoon.silver;

import java.util.*;

public class 카드1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++)
            queue.offer(i);

        while (!queue.isEmpty()){
            for(int i=0; i<n; i++){
                list.add(queue.poll());
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        for(int x : list){
            System.out.print(x + " ");
        }
    }
}
