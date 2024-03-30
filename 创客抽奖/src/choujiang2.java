import java.util.Random;

public class choujiang2 {
    public static void main(String[] args) {
        System.out.println("抽到  day1包  的是：");
        int x = 0;
        String nameArray[] = new String[] { "张宝清", "1,", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
        for (int i = 0; i < 3; i++) {
            x = getName(nameArray);
            gaishuzu(x, nameArray);
            while (true) {
                if (nameArray[x] == null) {
                    x = getName(nameArray);

                } else if (nameArray[x] != null) {
                    break;
                }

            }
            System.out.println(nameArray[x]);
        }
        System.out.println("------------------------------------------------");
        System.out.println("抽到  咖啡杯  的是：");
        for (int i = 0; i < 5; i++) {
            x = getName(nameArray);
            gaishuzu(x, nameArray);
            while (true) {
                if (nameArray[x] == null) {
                    x = getName(nameArray);

                } else if (nameArray[x] != null) {
                    break;
                }

            }
            System.out.println(nameArray[x]);
        }
        System.out.println("------------------------------------------------");
        System.out.println("抽到  蜡烛  的是：");
        for (int i = 0; i < 8; i++) {
            x = getName(nameArray);
            gaishuzu(x, nameArray);
            while (true) {
                if (nameArray[x] == null) {
                    x = getName(nameArray);

                } else if (nameArray[x] != null) {
                    break;
                }

            }
            System.out.println(nameArray[x]);
        }
        System.out.println("------------------------------------------------");
        System.out.println("抽到  帆布包  的是：");

        for (int i = 0; i < 1; i++) {
            x = getName(nameArray);
            gaishuzu(x, nameArray);
            while (true) {
                if (nameArray[x] == null) {
                    x = getName(nameArray);

                } else if (nameArray[x] != null) {
                    break;
                }

            }
            System.out.println(nameArray[x]);
        }

        System.out.println("------------------------------------------------");
        System.out.println("恭喜以上同学！！！");

    }

    public static int getName(String[] nameArray) {

        Random r = new Random();
        int x = r.nextInt(nameArray.length);
        // System.out.println(nameArray[x]);
        return x;

    }

    public static String[] gaishuzu(int x, String[] nameArray) {
        for (int i = x; i < nameArray.length - 1; i++) {
            nameArray[i] = nameArray[i + 1];
        }
        nameArray[nameArray.length - 1] = null;
        return nameArray;

    }
}

// nameArray[0] = "张宝清";
// nameArray[1] = "刘雷";
// nameArray[2] = "熊宇浩";
// nameArray[3] = "刘思麟";
// nameArray[4] = "唐琮杰";
// nameArray[5] = "袁伟琪";
// nameArray[6] = "郑天宇";
// nameArray[7] = "王炳午";
// nameArray[8] = "刘宇阳";
// nameArray[9] = "栾振翰";
// nameArray[10] = "武睿鸿";
// nameArray[11] = "高思雨";
// nameArray[12] = "代玮晗";
// nameArray[13] = "马永超";
// nameArray[14] = "吴想";
// nameArray[15] = "刘广兴";
// nameArray[16] = "沈佳欣";
// nameArray[17] = "张瀚文";
// nameArray[18] = "赵子豪";
// nameArray[19] = "邓婷";
// nameArray[20] = "张翔铭";
// nameArray[21] = "陈京鹏";
// nameArray[22] = "赵静怡";
// nameArray[23] = "张巍海";
// nameArray[24] = "黄屿澍";
// nameArray[25] = "杜鹏宇";
// nameArray[26] = "周晓倩";
// nameArray[27] = "李柄霏";
// nameArray[28] = "龚智鹏";
// nameArray[29] = "王鹤鹏";
// nameArray[30] = "王元均";
// nameArray[31] = "罗成瑞鑫";
// nameArray[32] = "李佳豪";
