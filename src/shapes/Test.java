package shapes;

interface Area {
    double area();
}

interface Perimeter {
    double perimeter();
}

interface Shape extends Area, Perimeter {
    int countOfEdges();
}

class Rectangle implements Shape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public int countOfEdges() {
        return 0;
    }
}


public class Test {
}
