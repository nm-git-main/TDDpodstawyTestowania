package calc.arithmetic;


public class Substraction {
    public static double multiNumber(double base, double[] costs) {

        double result = base;
        for (int i = 0; i < costs.length; i++) {
            result -= costs[i];
        }
        return result;
    }
}