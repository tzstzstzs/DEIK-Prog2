package calculator2;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        System.out.println(calculator.add(3,2));
    }
}
