package medium;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/21/21 2:38 PM
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * Bracket Matcher
 * Have the function BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are
 * correctly matched and each one is accounted for. Otherwise, return 0. For example: if str is "(hello (world))",
 * then the output should be 1, but if str is "((hello (world))" the output should be 0 because the brackets do not
 * correctly match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
 * Examples
 * Input: "(coder)(byte))"
 * Output: 0
 * Input: "(c(oder)) b(yte)"
 * Output: 1
 */
public class BracketMatcher {

    public static String BracketMatcherSol(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty()) return "0";
                else stack.pop();
            }
        }

        return "" + (stack.isEmpty() ? 1 : 0);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcherSol(s.nextLine()));
    }
}
