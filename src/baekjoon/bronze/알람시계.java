package baekjoon.bronze;
import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if( m < 45){
            h--;
            m = 60 - (45 - m);
            if(h < 0){
                h = 23;
            }
            System.out.println(h + " " + m);
        }else{
            System.out.println(h + " " + (m - 45));
        }
    }
}
