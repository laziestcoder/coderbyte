package medium;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/21/21 1:55 PM
 */

import java.util.Scanner;

/**
 * Min Window Substring
 * Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr, which will contain only
 * two strings, the first parameter being the string N and the second parameter being a string K of some characters,
 * and your goal is to determine the smallest substring of N that contains all the characters in K. For example: if
 * strArr is ["aaabaaddae", "aed"] then the smallest substring of N that contains the characters a, e, and d is
 * "dae" located at the end of the string. So for this example your program should return the string dae.
 * <p>
 * Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest substring of N that contains all the
 * characters in K is "aabd" which is located at the beginning of the string. Both parameters will be strings ranging
 * in length from 1 to 50 characters and all of K's characters will exist somewhere in the string N. Both strings will
 * only contain lowercase alphabetic characters.
 * Examples
 * Input: new String[] {"ahffaksfajeeubsne", "jefaa"}
 * Output: aksfaje
 * Input: new String[] {"aaffhkksemckelloe", "fhea"}
 * Output: affhkkse
 */
public class MinWindowSubstring {

    public static String MinWindowSubstring(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];
        int min = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < N.length(); i++) {
            StringBuilder match = new StringBuilder(K);
            for (int j = i; j < N.length(); j++) {
                if (match.toString().contains(String.valueOf(N.charAt(j)))) {
                    int index = match.indexOf(String.valueOf(N.charAt(j)));
                    match.replace(index, index + 1, "");
                }

                if (match.length() == 0) {
                    if (j - i < min) {
                        min = j - i;
                        result = N.substring(i, j + 1);
                    }
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(MinWindowSubstring(new String[]{s.nextLine()}));
        System.out.print(MinWindowSubstring(new String[]{"aaffhkksemckelloe", "fhea"}));
    }

}
