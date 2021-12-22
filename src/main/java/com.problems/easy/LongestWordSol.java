package easy;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/22/21 9:11 AM
 */

import java.util.Scanner;

/**
 * Longest Word
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the
 * string. If there are two or more words that are the same length, return the first word from the string with that
 * length. Ignore punctuation and assume sen will not be empty. Words may also contain numbers,
 * for example "Hello world123 567"
 * Examples
 * Input: "fun&!! time"
 * Output: time
 * Input: "I love dogs"
 * Output: love
 */
public class LongestWordSol {

    public static String LongestWord(String sen) {
        sen = sen.replaceAll("[^a-zA-Z\s]", "");
        String[] senWords = sen.split(" ");
        String maxStr = "";
        int longS = -1;
        for (String str : senWords) {
            if (longS < str.length()) {
                longS = str.length();
                maxStr = str;
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
