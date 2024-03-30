import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMI bmi = new BMI(scanner.next(), scanner.nextInt(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(bmi.toString());
    }

}

class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI() {// 空参构造

    }

    public BMI(String name, int age, double weight, double height) {// 有参构造
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return weight / Math.pow(height, 2);// 计算BMI
    }

    public String getStatus() {// 判断身体状况
        if (getBMI() < 18.5) {
            return "低重";
        } else if (getBMI() >= 18.5 && getBMI() < 25) {
            return "正常";

        } else if (getBMI() >= 25 && getBMI() < 30) {
            return "超重";
        } else {
            return "肥胖";
        }
    }

    @Override
    public String toString() {
        return "姓名" + name + '\n' + "年龄" + age + '\n' + "体重指数" + getBMI() + '\n' + "体重状况" + getStatus();
    }
}
