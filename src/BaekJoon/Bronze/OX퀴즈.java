package BaekJoon.Bronze;

import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] list = new String[scanner.nextInt()];

        for(int i=0; i<list.length; i++){
            list[i] = scanner.next();
        }

        for(int i=0; i<list.length; i++){
            int count = 0;
            int sum   = 0;
           for(int j=0; j<list[i].length(); j++){
               if(list[i].charAt(j) == 'O'){
                   count++;
               }else{
                   count = 0;
               }
               sum += count;
           }
            System.out.println(sum);
        }
    }
}
