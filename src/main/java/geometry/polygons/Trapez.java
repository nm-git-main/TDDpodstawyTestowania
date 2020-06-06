package geometry.polygons;

public class Trapez {
    int baseA;
    int height;
    int baseB;

    public Trapez(int baseA, int baseB, int height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;

    }

    public double getPerimeter() {
        return -1;
    }

    public double getArea() {
        double suma= baseA+baseB;
        double area= suma / 2.0 * height;
        return area;
    }

}
