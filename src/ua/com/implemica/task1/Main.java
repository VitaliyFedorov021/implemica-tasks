package ua.com.implemica.task1;

import java.math.BigDecimal;


import static ua.com.implemica.util.Util.calcFactorial;
import static ua.com.implemica.util.Util.input;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(input("Enter the number of brackets"));
        //Parse result to double in order to round it
        double d = Double.parseDouble(calcRightSequences(n).toString());
        int res = (int) Math.round(d);
        System.out.println(res);

    }

    /**
     * Returns the Catalan number which is representing amount of right sequences
     *
     * @param n amount of pairs of brackets
     * @return Catalan number
     */
    public static BigDecimal calcRightSequences(int n) {
        BigDecimal bigDecimal = calcFactorial(2 * n).divide((calcFactorial(n).multiply(calcFactorial((2 * n) - n))));
        String str = Double.toString(1. / (1. + (double) n));
        BigDecimal result = bigDecimal.multiply(new BigDecimal(str));
        return result;
    }

}

