public class Cube implements Shape, SolidShape, ManageShape{
    private double radius;

    public Cube(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return area() + volume();
    }

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }
}
