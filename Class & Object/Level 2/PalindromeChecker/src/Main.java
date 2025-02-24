public class Main {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("hello");
        PalindromeChecker p2 = new PalindromeChecker("racecar");

        System.out.println(p1.isPalindrome());
        System.out.println(p2.isPalindrome());
    }
}