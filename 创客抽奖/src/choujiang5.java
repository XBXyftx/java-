import java.util.ArrayList;
import java.util.Random;

public class choujiang5 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList<String>();
        names.add("赵子豪");
        names.add("袁伟琪");
        names.add("唐琮杰");
        names.add("刘雷");
        names.add("武睿鸿");
        names.add("王炳午");
        names.add("刘宇阳");
        names.add("马永超");
        names.add("王鹤鹏");
        names.add("吴天烁");
        names.add("栾振翰");
        names.add("代玮晗");
        names.add("吴想");
        // names.add("14");
        // names.add("15");
        // names.add("16");
        // names.add("17");
        // names.add("18");
        // names.add("19");
        // names.add("20");

        ArrayList<String> gifts = new ArrayList<String>();
        gifts.add("咖啡杯");
        gifts.add("咖啡杯");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("香薰蜡烛");
        gifts.add("跳绳");
        gifts.add("跳绳");// 11

        Random r = new Random();
        int number = names.size() <= gifts.size() ? names.size() : gifts.size();
        for (int i = 0; i < number; i++) {
            int n = r.nextInt(names.size());
            int g = r.nextInt(gifts.size());
            System.out.println("恭喜  " + names.get(n) + "  同学获得了  " + gifts.get(g) + "  奖品！！！");
            System.out.println("---------------------------------------------------------------------");
            names.remove(n);
            gifts.remove(g);
        }
    }

}
