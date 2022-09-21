public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(2.6, 8.45);
        System.out.printf("Area rectangle: %.2f\n", areaCalculator.calculate(rectangle));

        Circle circle = new Circle(3.987);
        System.out.printf("Circle rectangle: %.2f\n", areaCalculator.calculate(circle));
    }
}
