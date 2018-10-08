// Jason Tan
public class JtanLib {
    /**
     * This checks if a word is a palindrome. A palindrome is a word that is spelt the same, even when you spell it backwards.
     * For example, race car is spelt race car when you spell it backwards.
     *
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
     * This method gives the date in the order of day first, month second, and year last.
     *
     * @param Date This is the date entered in the order of month first, day second, and year last.
     * @return The inserted date but with the position of date and month swapped so that day comes fist, then month second, and lastly year.
     */

    public static String dateSTR(String Date) {
        String day = Date.substring(3, 5);
        String month = Date.substring(0, 2);
        String year = Date.substring(6);
        String date = day + "-" + month + "-" + year;
        return date;
    }

    /**
     * Given two words, it searches the first word for the first occurrence of the second word. Once it finds it, the method erases it.
     *
     * @param mainStr The word that is checked to see if it contains the sub string, which is the second word.
     * @param subStr  This word is that is checked by the method
     * @return the main string but with the first occurrence of the sub string erased
     */
    public static String cutOut(String mainStr, String subStr) {
        int Cut = mainStr.indexOf(subStr);
        String part1 = mainStr.substring(0, Cut);
        String part2 = mainStr.substring(Cut + subStr.length());
        return (part1 + part2);
    }


    /**
     * Checks if a number is part of the Fibonacci Sequence
     *
     * @param F The number that is checked to see if it's part of the Fibonacci Sequence
     * @return True if the number is a part of the sequence and false if it is not. Also prints out Fibonacci numbers leading up to the number being tested.
     */
    public static boolean isFibonacci(int F) {
        int fib = 1;
        int onnaci = 1;
        while (onnaci < F) {
            int x = fib + onnaci;
            System.out.println(onnaci);
            fib = onnaci;
            onnaci = x;
            if (F == onnaci) {
                return true;
            }
        }
        return false;
    }


    /**
     * Given a number, it sums up all the numbers that lead up to the number provided.
     *
     * @param n The number the method is going to count up to
     * @return Sum of all the digits leading up to the parameter n
     */
    public static int sumUpTo(int n) {
        int x = 0;
        for (int i = 0; i <= n; i++) {
            x += i;
        }
        return x;
    }

    /**
     * Solves the discriminant of a quadratic equation first, and then the quadratic equation in order to find the roots of the equation.
     * @param a first number of the quadratic equation
     * @param b second number of the quadratic equation
     * @param c third and last number of the quadratic equation.
     * @return If the discriminant is positive or 0, it will present the roots of the equation using String. If it is negative, it will return a String explaining that the roots are imaginary and does not exist.
     */
    public static String quadSolver(double a, double b, double c) {
        double q = Math.pow(b, 2) - 4 * a * c;
        if (q > 0) {
            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            return (String.valueOf(r1) + "," + String.valueOf(r2));
        } else
            return ("The discriminant is negative. When it is negative, it means that the quadratic equation has no real roots, and instead have imaginary roots. Imaginary roots are not real and does not exist");
    }
}
