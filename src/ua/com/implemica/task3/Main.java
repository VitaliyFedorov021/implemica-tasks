package ua.com.implemica.task3;


import static ua.com.implemica.util.Util.calcFactorial;

public class Main {
    public static void main(String[] args) {
        String str = calcFactorial(100).toString();
        System.out.println(sumOfDigits(str));

    }

    /**
     * Calculate sum of digits of number which represented as a String
     *
     * @param str - Number as a String
     * @return Sum of digits
     */
    public static int sumOfDigits(String str) {
        char[] numbers = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(String.valueOf(numbers[i]));
        }
        return sum;
    }
}
