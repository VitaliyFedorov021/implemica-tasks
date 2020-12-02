package ua.com.implemica.util;

import java.math.BigDecimal;
import java.util.Scanner;

public class Util {
    /**
     * Calculate the factorial of every number and return it as a String
     *
     * @param n - n!
     * @return Result
     */
    public static BigDecimal calcFactorial(int n) {
        BigDecimal factorial = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }

    /**
     * Read line which user input from console and returns it as a String
     *
     * @param message - message which user will see on the console
     * @return String which user entered
     */
    public static String input(String message) {
        Scanner sc = new Scanner(System.in);
        if (message != null) {
            System.out.println(message);
        }
        String str = sc.nextLine();
        return str;
    }
}
