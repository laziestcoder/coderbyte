package easy;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/22/21 9:09 AM
 */

import java.util.Scanner;

/**
 * First Reverse
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders" then your program should
 * return the string sredoC dna dlroW olleH.
 * Examples
 * Input: "coderbyte"
 * Output: etybredoc
 * Input: "I Love Code"
 * Output: edoC evoL I
 */
public class FirstReverseSol {

    public static String FirstReverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
