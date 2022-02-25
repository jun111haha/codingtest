package LeetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    public static int romanToInt(String s) {
      Map<Character, Integer> paramMap = new HashMap<>();
      paramMap.put('I', 1);
      paramMap.put('V', 5);
      paramMap.put('X', 10);
      paramMap.put('L', 50);
      paramMap.put('C', 100);
      paramMap.put('D', 500);
      paramMap.put('M', 1000);

      int len = s.length();
      int result = paramMap.get(s.charAt(len - 1));

        // 바로 뒤에 나오는 숫자보다 작으면 숫자를 빼야함
        for(int i= len - 2 ; i>=0; i--){
            if(paramMap.get(s.charAt(i)) >= paramMap.get(s.charAt( i + 1 )))
                result += paramMap.get(s.charAt(i));
            else
                result -= paramMap.get(s.charAt(i));
        }

        return result;
    }


    public static void main(String[] args) {

        romanToInt("MCMXCIV");
    }
}
