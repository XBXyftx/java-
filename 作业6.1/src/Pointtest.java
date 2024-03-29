import java.util.Scanner;

public class Pointtest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x2, y2;
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        Point p1 = new Point(3, 4);
        Point p2 = new Point(x2, y2);
        System.out.println("p1距离原点的距离wei" + p1.getDistanceToBase());
        System.out.println("p2距离原点的距离wei" + p2.getDistanceToBase());
    }
}

class Point {
    double x = 0;
    double y = 0;

    Point() {

    }

    Point(double xx, double yy) {
        x = xx;
        y = yy;
    }

    double getDistanceToBase() {
        return Math.sqrt(x * x + y * y);

    }

}
