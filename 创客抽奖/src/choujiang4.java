import java.util.ArrayList;
import java.util.Random;

public class choujiang4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("熊宇浩");
        list1.add("赵子豪");
        list1.add("邓婷");
        list1.add("栾振翰");
        list1.add("唐琮杰");
        list1.add("代玮晗");
        list1.add("吴想");
        list1.add("刘广兴");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Day1包");
        list2.add("Day1包");
        list2.add("Day1包");
        list2.add("咖啡杯");
        list2.add("咖啡杯");
        list2.add("咖啡杯");
        list2.add("咖啡杯");
        list2.add("咖啡杯");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("香薰蜡烛");
        list2.add("帆布包");
        list2.add("跳绳");

        Random r = new Random();
        int number = list1.size();
        for (int i = 0; i < number; i++) {
            int k = r.nextInt(list1.size());
            int f = r.nextInt(list2.size());
            System.out.println("恭喜" + list1.get(k) + "同学获得了" + list2.get(f) + "奖品！！！");
            System.out.println("------------------------------------------------");
            list1.remove(k);
            list2.remove(f);
        }
    }

}
