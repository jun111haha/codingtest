package baekjoon.silver;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//https://sangbeomkim.tistory.com/45
public class 에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            left.push(str.charAt(i));
        }

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            char ch1 = str1.charAt(0);
            if(ch1 == 'P') {
                String str2 = st.nextToken();
                char ch2 = str2.charAt(0);
                left.push(ch2);
            } else if(ch1 == 'L') {
                if(!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if(ch1 == 'D') {
                if(!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if(ch1 == 'B') {
                if(!left.isEmpty()){
                    left.pop();
                }
            }
        }

        while(!right.isEmpty()) {
            left.push(right.pop());
        }

        for(Character c : left){
            bw.write(c);
        }

        bw.close();//스트림을 닫음
    }
}
