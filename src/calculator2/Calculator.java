package calculator2;

public interface Calculator {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return add(a, -b);
    };

    int multiply(int a, int b);

    int divide(int a, int b);
}
