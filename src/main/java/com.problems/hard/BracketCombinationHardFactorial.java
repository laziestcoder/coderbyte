package hard;

import java.util.Scanner;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/21/21 1:26 PM
 */

/***
 * Bracket Combinations
 * Have the function BracketCombinations(num) read num which will be an integer greater than or equal to zero,
 * and return the number of valid combinations that can be formed with num pairs of parentheses. For example,
 * if the input is 3, then the possible combinations of 3 pairs of parenthesis,
 * namely: ()()(), are ()()(), ()(()), (())(), ((())), and (()()). There are 5 total combinations when the
 * input is 3, so your program should return 5.
 * Examples
 * Input: 3
 * Output: 5
 * Input: 2
 * Output: 2
 * */
class BracketCombinationHardFactorial {

    public static long BracketCombinations(int edges) {

        return factorial(edges * 2) / (factorial(edges) * factorial(edges + 1));

    }

    public static long factorial(int N) {
        long multi = 1;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketCombinations(Integer.parseInt(s.nextLine())));
    }

}