public class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0){
            throw new IllegalArgumentException("Number can not be divide by 0!");
        }
        return num1 / num2;
    }

    public int mod(int num1, int num2) {
        return num1 % num2;
    }

    public double differentTypeSum(double num1, double num2) {
        return num1 + num2;
    }

    public double differentTypeSub(double num1, double num2) {
        return num1 - num2;
    }

    public double differentTypeMultiple(double num1, double num2) {
        return num1 * num2;
    }

    public double differentTypeDivide(double num1, double num2) {
        return num1 / num2;
    }

    public double exponent (double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double sqrt (double num1) {
        return Math.sqrt(num1);
    }

    public double log10 (double num1) {
        return Math.log10(num1);
    }

    public double ln (double num1) {
        return Math.log(num1);
    }

    public double sin (double num1) {
        return Math.sin(Math.toRadians(num1));
    }

    public double cos (double num1) {
        return Math.cos(Math.toRadians(num1));
    }

    public int threeNum (int num1, int num2, int num3) {
        return num1 + num2 * num3;
    }

    public double threeNum1 (double num1, int num2, int num3) {
        return sqrt(num1) * num2 / num3;
    }

    public double threeNum2 (double num1, int num2, int num3) {
        return exponent(num1, num2) * num3;
    }


}
