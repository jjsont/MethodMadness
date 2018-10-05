import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
// Jason Tan
public class JtanLib {
    /**
     * This checks if a word is a palindrome. A palindrome is a word that is spelt the same, even when you spell it backwards. For example, racecar is spelt racecar when you spell it backwards.
     * @param str1 This is the word which the program checks to see if it is a palindrome.
     * @return A boolean value of true if the word checked is a palindrome or a boolean value of false if the word isn't a palindrome.
     */
    public static boolean isPalindrome(String str1) {
        String reverse = "";
        for (int i = str1.length(); i != 0; i--) {
            reverse = reverse + str1.substring(i - 1, i);
        }
        if (reverse.equals(str1)) {
            return true;
        } else return false;

    }

    /**
     * This program gives the date in the order of day first, month second, and year last.
     * @param Date This is the date entered in the order of month first, day second, and year last.
     * @return The inserted date but with the position of date and month swapped so that day comes fist, then month second, and lastly year.
     */

    public static String dateSTR(String Date) {
        String day = Date.substring(3,5);
        String month =Date.substring(0,2);
        String year = Date.substring(6);
        String date =  day + "-" + month + "-" + year;
        return date;
    }

    /**
     *
     * @param mainSTR
     * @param subSTR
     * @return
     */
    public static String cutOut(String mainSTR, String subSTR) {
        int Cut = mainSTR.indexOf(subSTR);
        String part1 = mainSTR.substring(0, Cut);
        String part2 = mainSTR.substring(Cut + subSTR.length());
        return (part1 + part2);
    }




    public static boolean isFibonacci(int F) {
        int fib= 1;
        int onnaci= 1;
        while (onnaci < F) {
            int x= fib + onnaci;
            System.out.println(onnaci);
            fib=onnaci;
            onnaci=x;
            if(F == onnaci) {
                return true;
            }
        }
        return false;
    }




    public static int sumUpTo(int n) {
        int x= 0;
        for (int i= 0; i <= n; i++) {
            x += i;
        }
        return x;
    }







}
