package arc;
import java.util.Scanner;

public class Circle {
    private double radius;
    private double diameter = 2 * this.radius;
    private double circumference = 2 * 3.14 * this.radius;
    private double area = this.radius * this.radius * 3.14;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void initialize() {
        Scanner scan = new Scanner(System.in);
        this.radius = scan.nextDouble();
    }

    public void printCircleData() {
        // Use radius variable to write a formula of circle's diameter, circumference, and area.
        System.out.println("Diameter of the circle: " + this.diameter);
        System.out.println("Circumference of the circle: " + this.circumference);
        System.out.println("area of the circle: " + this.area);
    }
}