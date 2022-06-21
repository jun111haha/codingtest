package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 줄세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            linkedList.add(num , i + 1);
        }

        for(int i=0; i<n; i++){
            System.out.print(linkedList.pollLast() + " ");
        }
    }
}
