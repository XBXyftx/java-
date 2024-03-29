import java.util.Scanner;

public class Circletest {
    public static void main(String[] args) throws Exception {
        Circle[] circles = new Circle[3];
        circles = createCircleArray();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < circles.length; i++) {
                circles[i].setRadius(scanner.nextDouble());
            }
        }
        printCircleArray(circles);
        double sum = sum(circles);
        System.out.println("总面积为" + sum);

    }

    public static Circle[] createCircleArray() {
        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
        return circles;

    }

    public static double sum(Circle[] circles) {
        double sum = 0;
        for (int i = 0; i < circles.length; i++) {
            sum += circles[i].getArea();
        }
        return sum;

    }

    public static void printCircleArray(Circle[] circles) {
        System.out.println("半径 面积");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getRadius() + " " + circles[i].getArea());

        }
        System.out.println();

    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double speed) {
        radius = speed;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
