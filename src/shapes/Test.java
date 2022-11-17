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


public class Test {
}
