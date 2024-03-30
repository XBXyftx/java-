import java.util.Scanner;

public class Sanweizuobiao {
    public static void main(String[] args) throws Exception {
        double[][] points = new double[6][3];
        points = getArray();
        double result = distance(points[0][0], points[0][1], points[0][2], points[1][0], points[1][1], points[1][2]);
        double temp = 0;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                temp = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
                if (temp < result) {
                    p1 = i;
                    p2 = j;
                    result = temp;
                }

            }
        }
        System.out.println("最近的两个点是 " + "(" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ")和 ("
                + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");

    }

    public static double[][] getArray() {
        Scanner in = new Scanner(System.in);
        double shurupoint[][] = new double[6][3];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                shurupoint[i][j] = in.nextDouble();

            }
        }
        return shurupoint;
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
    }
}
