package baekjoon.silver;

import java.util.LinkedList;
import java.util.Scanner;

public class 회전하는큐 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> deque = new LinkedList<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i=1; i<=n; i++) deque.offer(i);

        int [] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = scanner.nextInt();

        int cnt = 0;
        for(int i=0; i<m; i++){
            int targetIdx = deque.indexOf(arr[i]);
            int halfIdx;

            /*
             *  만약 현재 덱의 원소가 짝수 개라면 중간 지점을
             *  현재 덱의 절반 크기에서 -1 감소시킨다.
             *
             *  {1, 2, 3, 4} 일 때, 2를 중간지점으로 하면
             *  인덱스는 1이기 때문
             */
            if(deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2 - 1;
            }
            else {
                halfIdx = deque.size() / 2;
            }

            // 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
            if(targetIdx <= halfIdx){
                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
                for(int j=0; j<targetIdx; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
                // 중간 지점보다 원소의 위치가 뒤에 있는 경우
            }else{
                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
                for(int j=0; j< deque.size() - targetIdx; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);
    }
}
