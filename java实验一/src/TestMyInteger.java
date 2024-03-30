import java.util.Scanner;

public class TestMyInteger {

    public static void main(String[] a) {

        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        String str = input.next();

        MyInteger myInteger = new MyInteger(value);

        System.out.println();

        System.out.println(myInteger.getValue() + "为奇数----> " + myInteger.isOdd());

        System.out.println(myInteger.getValue() + "为偶数----> " + myInteger.isEven());

        System.out.println(myInteger.getValue() + "为素数----> " + myInteger.isPrime());

        System.out.println();

        value = MyInteger.parseInt(str);

        System.out.println(value + "为奇数----> " + MyInteger.isOdd(value));

        System.out.println(value + "为偶数----> " + MyInteger.isEven(value));

        System.out.println(value + "为素数----> " + MyInteger.isPrime(value));

    }

}

class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {// 判断是否是偶数
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {// 判断是否是奇数
        if (value % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {// 判断是否是素数
        if (value <= 1) {
            return false;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static int parseInt(String numString) {// 字符串转换int
        int str = Integer.parseInt(numString);
        return str;

    }

    public static boolean isEven(int num) {// 静态偶数
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int num) {// 静态奇数
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int num) {// 静态素数
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}