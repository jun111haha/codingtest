package leetcode.easy;

public class LengthofLastWord {
    public static void main(String[] args) {
        String str = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(str));

    }
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();
    }
}
