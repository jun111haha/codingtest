package baekjoon.bronze;

import java.util.Scanner;
/*
* 테스트케이스 선언하고 값을받아 저장한다.
* 성적합 저장하는 double 형 sum 선언
* 성적을 입력하여 저장한다.
* 평균을 넘는 학생 비율을 찾는다. 결과값을 소수 3자리까지 출력.
* */
public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] list;
        int testCase = scanner.nextInt();


        for(int i=0; i<testCase; i++){

            int n = scanner.nextInt();
            list = new int[n];
            double sum = 0;

            for(int j=0; j<n; j++){
                int grade = scanner.nextInt();
                list[j] = grade;
                sum += grade;
            }

            double avg = (sum / n );
            double count = 0;

            for(int z=0; z<n; z++){
                if(list[z] > avg) count++;
            }

            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
