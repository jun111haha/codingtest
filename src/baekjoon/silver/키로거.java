package baekjoon.silver;

import java.io.*;
import java.util.Stack;

/*
두 개의 Stack(key, delete)을 사용하여 풀이하였다. 이유는 두가지이다.
'-' :  keyStack에 가장 최근에 들어간 문자열을 삭제해줘야함. (LIFO)
'<' || '>' : 커서 위치 변경은 삽입 순서가 바뀌는 것이다.
'<'을 할 때 keyStack에 가장 최근에 들어간 문자열을 deleteStack에 저장해준다.
'>'을 할 때는 deleteStack에 있는 문자열을 꺼내준다음 keyStack에 넣어준다.
* */
public class 키로거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String line = br.readLine();
            Stack<Character> pwdStack = new Stack<>();
            Stack<Character> deleteStack = new Stack<>();

            for(int j=0; j<line.length(); j++) {
                char pos = line.charAt(j);
                if(pos == '<') {
                    if(!pwdStack.isEmpty()) {
                        deleteStack.push(pwdStack.pop());
                    }
                }else if(pos == '>') {
                    if(!deleteStack.isEmpty()) {
                        pwdStack.push(deleteStack.pop());
                    }
                }else if(pos == '-') {
                    if(!pwdStack.isEmpty()) {
                        pwdStack.pop();
                    }
                }else {
                    pwdStack.push(line.charAt(j));
                }
            }

            while(!deleteStack.isEmpty()) {
                pwdStack.push(deleteStack.pop());
            }

            for(int k=0; k<pwdStack.size(); k++) {
                bw.write(pwdStack.get(k));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
