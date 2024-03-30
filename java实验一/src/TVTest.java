import java.util.Scanner;

public class TVTest {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();
        tv.turnOn();// 打开电视
        tv.setVoumeLevel(scanner.nextInt());
        tv.setChannel(scanner.nextInt());
        System.out.println("tv的音量和频道为" + tv.getVoumeLevel() + "和" + tv.getChannel());
        tv.channelUp();// 加频道
        tv.voumeDown();// 减音量
        System.out.println("调频道和音量后的音量和频道为" + tv.getVoumeLevel() + "和" + tv.getChannel());
        tv.turnOff();// 关闭电视

    }

}

class TV {
    int channel;// 频道
    int voumeLevel;// 音量
    boolean on;// 电视是否打开

    public TV() {
    }

    public TV(int channel, int voumeLevel, boolean on) {
        this.channel = channel;
        this.voumeLevel = voumeLevel;
        this.on = on;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }

    public int getChannel() {
        return channel;
    }

    public int getVoumeLevel() {
        return voumeLevel;
    }

    public void setVoumeLevel(int newVoumeLevel) {
        this.voumeLevel = newVoumeLevel;
    }

    public void channelUp() {// 调频道
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public void voumeUp() {// 调音量
        this.voumeLevel++;
    }

    public void voumeDown() {
        this.voumeLevel--;
    }

}
