public class JtanLib {
    public static boolean isPalindrome(String str1)
    {
        String reverse= "";
        for (int i = str1.length() -1; i == 0; i--) {
            reverse = reverse + str1.substring(str1.length() - i - 1, str1.length() - 1);
        }
        if (reverse.equals(str1)) return true;
        else return false;
    }
}