package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
/*
* 18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0
* */
class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y){
        this.x  = x;
        this.y  = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.y == o.y){
            return this.x - o.x;
        }
            return this.y - o.y;
    }
}


public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!priorityQueue.isEmpty()){
                    System.out.println(priorityQueue.poll().x);
                }else{
                    System.out.println(0);
                }
            }else{
                priorityQueue.add(new Point(num , Math.abs(num)));
            }
        }

    }
}
