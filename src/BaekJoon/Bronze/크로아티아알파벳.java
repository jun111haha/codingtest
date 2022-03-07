package BaekJoon.Bronze;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String st = scanner.nextLine();

        for(int i=0; i<list.length; i++){
            if(st.contains(list[i]))
                st = st.replace(list[i], "!");
        }
        System.out.println(st.length());
    }
}
