import java.util.Random;

public class choujiang {
    public static void main(String[] args) throws Exception {

        System.out.println("抽到day1包的是:");
        chouren(3);// day1包
        System.out.println("--------------------------------------------------------");
        System.out.println("抽到咖啡杯的是：");
        chouren(5);// 咖啡杯
        System.out.println("--------------------------------------------------------");
        System.out.println("抽到蜡烛的是：");
        chouren(8);// 蜡烛
        System.out.println("--------------------------------------------------------");
        System.out.println("抽到帆布包的是：");
        chouren(1);// 蜡烛
    }

    public static void chouren(int number) {
        for (int i = 0; i < number; i++) {
            int name;
            Random r = new Random();
            name = r.nextInt(28);// 抽人的随机数
            switch (name) {
                case 0:
                    System.out.println("小明");
                    break;

                case 1:
                    System.out.println("小红");
                    break;

                case 2:
                    System.out.println("小明");
                    break;

                case 3:
                    System.out.println("小红");
                    break;

                case 4:
                    System.out.println("小明");
                    break;

                case 5:
                    System.out.println("小红");
                    break;

                case 6:
                    System.out.println("小明");
                    break;

                case 7:
                    System.out.println("小红");
                    break;

                case 8:
                    System.out.println("小明");

                    break;
                case 9:
                    System.out.println("小红");
                    break;

                case 11:
                    System.out.println("小明");
                    break;

                case 12:
                    System.out.println("小明");
                    break;

                case 14:
                    System.out.println("小明");
                    break;

                case 15:
                    System.out.println("小明");
                    break;

                case 16:
                    System.out.println("小明");
                    break;

                case 17:
                    System.out.println("小明");
                    break;

                case 18:
                    System.out.println("小明");
                    break;

                case 19:
                    System.out.println("小明");
                    break;

                case 20:
                    System.out.println("小明");
                    break;

                case 21:
                    System.out.println("小明");
                    break;

                case 22:
                    System.out.println("小明");
                    break;

                case 23:
                    System.out.println("小明");
                    break;

                case 24:
                    System.out.println("小明");
                    break;

                case 25:
                    System.out.println("小明");
                    break;

                case 26:
                    System.out.println("小明");
                    break;
                case 27:
                    System.out.println("小明");
                    break;
            }

        }

    }
}
