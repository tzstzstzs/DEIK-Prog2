package calculator3;

public class CalculatorImpl extends Calculator {

    @Override
    public void add(int value) {
        this.result += value;
    }

    @Override
    public void multiply(int value) {
        this.result *= value;
    }

    @Override
    public void divide(int value) {
        this.result /= value;
    }

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.add(3);
        calculator.multiply(5);
        System.out.println(calculator.result);
    }
}
