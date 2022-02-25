package LeetCode.easy;
public class longestCommonPrefix {

    /*
    * Input: strs = ["flower","flow","flight"]
    * Output: "fl"
    * 배열에서 첫번째 항목을 가져와서
    * while 문을 돌려서 두번째 배열부터 일치할때까지 subString 으로 잘라준다.
    * */
    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        int i = 1;
        while (i< strs.length){
            while (strs[i].indexOf(first) != 0)
                first = first.substring(0, first.length() - 1);
            i++;
        }

        return first;
    }

    public static void main(String[] args) {

        String [] str = {"flower","flow","flight"};
        String test = longestCommonPrefix(str);

    }
}
