package calculator4;

public class CalculatorImpl implements Calculator<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator<Integer> calculator = new CalculatorImpl();
        System.out.println(calculator.add(3, 2));
    }
}
