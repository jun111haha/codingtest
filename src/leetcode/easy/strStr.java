package leetcode.easy;

public class strStr {
    public static void main(String[] args) {
        String val1 = "hello";
        String val2 = "ll";
        System.out.println(strStr(val1, val2));
    }

    public static int strStr(String haystack, String needle) {
        if(needle == "") return 0;

        return haystack.indexOf(needle);
    }
}
