public class Main {

    public static void main(String[] аrgs){

        Calculator calculator = new Calculator();
        System.out.println("Result sum: " + calculator.sum(6, 2));
        System.out.println("Result subtraction: " + calculator.subtraction(10, 6));
        System.out.println("Result multiple: " + calculator.multiple(5, 3));
        System.out.println("Result divide: " + calculator.divide(21, 3));
        System.out.println("Result mod: " + calculator.mod(82, 9));
        System.out.println("Result exponent: " + calculator.exponent(3, 2));
        System.out.println("Result sqrt: " + calculator.sqrt(49));
        System.out.println("Result log: " + calculator.log10(10));
        System.out.println("Result ln: " + calculator.ln(1));
        System.out.println("Result sin: " + calculator.sin(90));
        System.out.println("Result cos: " + calculator.cos(180));

        System.out.println("Result threeNum: " + calculator.threeNum(5,6, 3));
        System.out.println("Result threeNum1: " + calculator.threeNum1(20,6, 2));
        System.out.println("Result threeNum2: " + calculator.threeNum2(3,3, 2));
    }
}
