import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();// 空参构造
        student1.setName(scanner.next());
        Score score1 = new Score(scanner.nextFloat(), scanner.nextFloat());
        student1.setScore(score1);
        System.out.println(student1.toString());
        System.out.println();

        String name2 = scanner.next();
        Score score2 = new Score(scanner.nextFloat(), scanner.nextFloat());// 有参构造
        Student student2 = new Student(name2, score2);
        System.out.println(student2.toString());

    }
}

class Score {
    float experiment;// 实验成绩
    float project;// 项目成绩

    Score() {

    }

    Score(float experiment, float project) {
        this.experiment = experiment;
        this.project = project;
    }

    public float getExperiment() {
        return experiment;
    }

    public void setExperiment(float experiment) {
        this.experiment = experiment;
    }

    public float getProject() {
        return project;
    }

    public void setProject(float project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "实验成绩" + '\t' + experiment + '\n' + "项目成绩" + '\t' + project;
    }// 输出学生成绩信息
}

class Student {
    String name;
    Score score;

    Student() {

    }

    Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生姓名" + name + '\n' + score.toString();// 输出学生姓名
    }
}