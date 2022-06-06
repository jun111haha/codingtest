package baekjoon.silver;
import java.io.*;
import java.util.*;

public class 회사에있는사람 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String name = scanner.next();
            String state = scanner.next();
            if(state.equals("enter")){
                map.put(name, state);
            }else{
                map.remove(name);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for(String x : list){
            System.out.println(x);
        }
    }
}
