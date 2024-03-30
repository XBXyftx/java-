import java.util.Scanner;

public class StarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int color = scanner.nextInt();
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        Position pos = new Position(row, column);// 创建位置对象
        Star star = new Star(color, pos);// 创建star对象

        System.out.println(star.toString());
    }

}

class Position {
    private static int row;
    private static int column;

    public Position() {// 有参构造

    }

    public Position(int row, int column) {// 无参构造
        this.row = row;
        this.column = column;
    }

    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        Position.row = row;
    }

    public static int getColumn() {
        return column;
    }

    public static void setColumn(int column) {
        Position.column = column;
    }

    @Override
    public String toString() {// 输出位置信息
        return "行" + '\t' + getRow() + '\n' + "列" + '\t' + getColumn();
    }

}

class Star {
    static private int Red = 0;
    static private int Blue = 1;
    static private int Yellow = 2;
    static private int Green = 3;
    private int type;
    private Position position;

    public Star() {

    }

    public Star(int type, Position position) {
        this.type = type;
        this.position = position;
    }

    public String getType() {
        if (type == 0) {
            return "红色";
        } else if (type == 1) {
            return "蓝色";
        } else if (type == 2) {
            return "黄色";
        } else {
            return "绿色";
        }

    }

    public void setType(int type) {
        this.type = type;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "颜色" + '\t' + getType() + '\n' + position.toString();// 输出颜色信息
    }

}
