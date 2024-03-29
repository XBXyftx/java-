import java.util.Scanner;

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

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return name + "\t" + score;
    }
}

class Shool {
    private String name;
    private Student[] students;

    public Shool() {
    }

    public Shool(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getAverageScore() {
        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        return totalScore / students.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class TestShool {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Student stu1 = new Student(scanner.next(), scanner.nextDouble());
            Student stu2 = new Student(scanner.next(), scanner.nextDouble());
            Student stu3 = new Student(scanner.next(), scanner.nextDouble());

            Shool shool = new Shool();
            Student[] students = { stu1, stu2, stu3 };

            shool.setStudents(students);

            System.out.println("姓名\t\t" + "成绩");
            System.out.println("-------------------------");
            System.out.println(shool.toString());

            double averageScore = shool.getAverageScore();
            System.out.println("所招学生的平均分为" + averageScore + "分");
        }
    }
}