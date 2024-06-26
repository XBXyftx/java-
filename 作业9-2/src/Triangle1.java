import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Triangle triangle = new Triangle(sc.next(), sc.nextBoolean(), sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble());
            System.out.println(triangle.toString());
        }
    }
}

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String a = "";
        if (getFilled() == false) {
            a = "未填充";
        } else {
            a = "填充";
        }
        return "颜色为" + getColor() + '\n' + a;
    }
}

class Triangle extends GeometricObject {
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {

        return super.toString() + '\n' + "三条边" + side1 + side2 + side3 + "\n" + "周长"
                + getPerimeter() + "\n" + "面积" + getArea();
    }

}
