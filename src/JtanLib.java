import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

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


    public static String dateSTR(String Date) {
        String day = Date.substring(3,5);
        String month =Date.substring(0,2);
        String year = Date.substring(6);
        String date =  day + "-" + month + "-" + year;
        return date;
    }


    public static String cutOut(String mainSTR, String subSTR) {
        int Cut = mainSTR.indexOf(subSTR);
        String part1 = mainSTR.substring(0, Cut);
        String part2 = mainSTR.substring(Cut +subSTR.length());
        return (part1 + part2);
    }
}
