package easy;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 12/22/21 9:09 AM
 */

import java.util.Scanner;

/**
 * First Factorial
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
 * For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will
 * be between 1 and 18 and the input will always be an integer.
 * Examples
 * Input: 4
 * Output: 24
 * Input: 8
 * Output: 40320
 */
public class FirstFactorialSol {

    public static int FirstFactorial(int num) {
        // code goes here
        if (num == 1 || num == 0) return 1;
        return FirstFactorial(num - 1) * num;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(FirstFactorial(s.nextLine()));
        System.out.print(FirstFactorial(8));
    }

}