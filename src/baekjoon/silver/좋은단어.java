package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
3
ABAB
AABB
ABBA
Stack 으로 구현 ABAB 로 예를 들면 A 를 먼저 Stack 에 푸쉬
다음입력 B와 peek() 메서드를 활용해서 같으면 A pop() 처리. 이과정 반복
stack 이 비어있으면 cnt++ 처리 stack 은 초기화작업.
* */
public class 좋은단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                if(!stack.isEmpty() && str.charAt(j) == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(str.charAt(j));
                }
            }
            if(stack.size() == 0){
                cnt++;
            }
            //최초 for문 한번돌면 스택초기화
            stack.clear();
        }
        System.out.println(cnt);
    }
}
