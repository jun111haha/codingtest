package baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class 비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String [] input2 = br.readLine().split(" ");
            map.put(input2[0], input2[1]);
        }

        for(int i=0; i<M; i++){
            bw.write(map.get(br.readLine()));
            bw.newLine();
        }

        bw.close();
    }
}
