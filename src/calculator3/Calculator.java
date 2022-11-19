package calculator3;

public abstract class Calculator {
    protected int result;

    public abstract void add(int value);

    public void subtract(int value) {
        add(-value);
    }

    public abstract void multiply(int value);

    public abstract void divide(int value);
}
