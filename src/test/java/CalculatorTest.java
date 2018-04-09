import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
/*
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }
*/
    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    /////////////////
    @org.junit.Test
    public void testSum() throws Exception {
        assertEquals(12, calculator.sum(5,7));
    }

   /* @org.junit.Test
    public void testSum1() throws Exception {
        assertEquals(100000000, calculator.sum(900000000,100000000));
    }*/

    @org.junit.Test
    public void testSum2() throws Exception {
        assertEquals(-11, calculator.sum(-7,-4));
    }

    @org.junit.Test
    public void testSubtraction() throws Exception {
        assertEquals(3, calculator.subtraction(10,7));
    }

    @org.junit.Test
    public void testSubtraction1() throws Exception {
        assertEquals(-5, calculator.subtraction(-8,-3));
    }

  /*  @org.junit.Test
    public void testSubtraction2() throws Exception {
        assertEquals(3, calculator.subtraction(10,500000000));
    }*/

    @org.junit.Test
    public void testMultiple() throws Exception {
        assertEquals(15, calculator.multiple(5,3));
    }

    @org.junit.Test
    public void testMultiple1() throws Exception {
        assertEquals(900000000, calculator.multiple(10,900000000));
    }

    @org.junit.Test
    public void testMultiple2() throws Exception {
        assertEquals(-630000000, calculator.multiple(-7,900000000));
    }

    @org.junit.Test
    public void testMultiple3() throws Exception {
        assertEquals(0, calculator.multiple(6,0));
    }

    @org.junit.Test
    public void testDivide() throws Exception {
        assertEquals(20, calculator.divide(100,5));
    }

    @org.junit.Test
    public void testDivide1() throws Exception {
        assertEquals(-2, calculator.divide(-8,4));
    }

    @org.junit.Test
    public void getDivide2() throws Exception {
        assertEquals(2, calculator.divide(-10,-5));
    }

    @org.junit.Test
            (expected=java.lang.IllegalArgumentException.class)
    public void testDivideByZero() throws Exception {
        assertEquals("Number can not be divide by 0!", calculator.divide(5,0));
    }

    @org.junit.Test
    public void testMod() throws Exception {
        assertEquals(1, calculator.mod(82,9));
    }

    @org.junit.Test
    public void testDifferentType() {
        double result = calculator.differentType(6, 6.5);
        assertTrue(result == 12.5);
    }


    @org.junit.Test
    public void testExponent() throws Exception {
        double result = calculator.exponent(4, 2);
        assertTrue(result == 16);
    }

    @org.junit.Test
    public void testSqrt() throws Exception {
        double result = calculator.sqrt(49);
        assertTrue(result == 7);
    }

    @org.junit.Test
    public void testLog10() throws Exception {
        double result = calculator.log10(10);
        assertTrue(result == 1);
    }

    @org.junit.Test
    public void testLn() throws Exception {
        double result = calculator.ln(1);
        assertTrue(result == 0);
    }

    @org.junit.Test
    public void testSin() throws Exception {
        double result = calculator.sin(90);
        assertTrue(result == 1);
    }

    @org.junit.Test
    public void testCos() throws Exception {
        double result = calculator.cos(180);
        assertTrue(result == -1);
    }


    @org.junit.Test
    public void testThree() throws Exception {
        assertEquals(23, calculator.threeNum(5,6,3));
    }

    @org.junit.Test
    public void testT1() throws Exception {
        double result = calculator.threet(20,6,2);
        assertTrue(result == 13.416407864998739);
    }


}