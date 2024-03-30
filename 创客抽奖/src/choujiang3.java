import java.util.Random;

public class choujiang3 {
    public static void main(String[] args) {
        String nameArray[] = new String[] { "熊宇浩", "赵子豪", "邓婷", "栾振翰", "唐琮杰", "代玮晗", "吴想", "刘广兴" };
        Random r = new Random();
        System.out.println("------------------------------------------------");
        System.out.println("                 " + nameArray[r.nextInt(nameArray.length)]);
        System.out.println("------------------------------------------------");

    }
}