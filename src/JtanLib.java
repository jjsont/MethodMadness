public class JtanLib {
    public static boolean isPalindrome(String str1) {
        String reverse = "";
        for (int i = str1.length(); i != 0; i--) {
            reverse = reverse + str1.substring(i - 1, i);
        }
        if (reverse.equals(str1)) {
            return true;
        } else return false;

    }
}
    public static String dateSTR( String date) {

    }



