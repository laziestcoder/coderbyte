package easy;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/22/21 9:19 AM
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Questions Marks
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,
 * letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers
 * that add up to 10. If so, then your program should return the string true, otherwise it should return the string
 * false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 * <p>
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3
 * question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 * Examples
 * Input: "aa6?9"
 * Output: false
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 */
public class QuestionsMarksSol {

    public static String QuestionsMarks(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        str = str.replaceAll("[a-z]", "");
        Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
        Pattern falseP1 = Pattern.compile("([0-9])([?])([?])([0-9])");
        Pattern falseP2 = Pattern.compile("([0-9])([?])([0-9])");
        Matcher falseMatchP1 = falseP1.matcher(str);
        Matcher falseMatchP2 = falseP2.matcher(str);
        Matcher matchPattern = pattern.matcher(str);
        if (falseMatchP1.find() || falseMatchP2.find()) {
            return "false";
        }
        if (matchPattern.find()) {
            return "true";
        }
        return "false";

    }

    public static String QuestionsMarksTwo(String str) {

        int i = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                int j = i + 1;
                int qCount = 0;
                while (j < str.length()) {
                    if (str.charAt(j) == '?') qCount++;
                    if (Character.isDigit(str.charAt(j))) {
                        int sum = Integer.parseInt(str.charAt(i) + "") + Integer.parseInt(str.charAt(j) + "");
                        if (!(sum == 10 && qCount == 3)) return "false";
                        i = j;
                        break;
                    }
                    j++;
                }
            }
            i++;
        }
        return "true";
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
        System.out.print(QuestionsMarksTwo(s.nextLine()));
    }


}
