import java.util.Scanner;
public class Task_1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Palindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;


    }

    public static Boolean Palindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
        return s.equals(reverseString(s));
    }
}
