import java.util.ArrayList;
import java.util.Scanner;

public class TestShool {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Student stu1 = new Student(scanner.next(), scanner.nextDouble());

            Student stu2 = new Student(scanner.next(), scanner.nextDouble());

            Student stu3 = new Student(scanner.next(), scanner.nextDouble());

            Shool shool = new Shool();

            Student[] students = { stu1, stu2, stu3 };
            ArrayList<Student> stu = new ArrayList<Student>();// 创建ArrayList数组
            stu.add(students[0]);// 将stu1、2、3输入stu Arraylist
            stu.add(students[1]);
            stu.add(students[2]);
            shool.setStu(stu);

            System.out.println("姓名\t\t" + "成绩");

            System.out.println("-------------------------");

            System.out.println(shool.toString());

            System.out.println("所招学生的平均分为" + shool.getAverageScore() + "分");
        }

    }

}

class Student {
    private String name;
    private double score;

    public Student() {

    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

class Shool {
    private String name;
    private ArrayList<Student> stu = new ArrayList<>();

    public Shool() {

    }

    public Shool(String name, ArrayList<Student> stu) {
        this.name = name;
        this.stu = stu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStu() {
        return stu;
    }

    public void setStu(ArrayList<Student> stu) {
        this.stu = stu;
    }

    public double getAverageScore() {
        double sum = 0;
        for (int j = 0; j < stu.size(); j++) {
            sum += stu.get(j).getScore();
        }

        return sum / stu.size();

    }

    @Override
    public String toString() {
        Student s = new Student();// ArrayList<Student>的每个位置存的都是对象所以需要用对象来接收
        String result = "";
        for (int i = 0; i < stu.size(); i++) {
            s = stu.get(i);
            result += s.getName() + "\t" + s.getScore() + "\n";
        }
        return result;

    }
}