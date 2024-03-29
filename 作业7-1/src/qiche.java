import java.util.Scanner;

public class qiche {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Vehicle ve = new Vehicle();
            ve.setSpeed(sc.nextFloat());
            System.out.println("初始速度是" + ve.getSpeed());
            ve.speedUp(10);
            System.out.println("加速10后的速度是" + ve.getSpeed());
            ve.speedDown(20);
            System.out.println("降速20后的速度是" + ve.getSpeed());
        }

    }
}

class Vehicle {
    private float speed;

    public Vehicle() {

    }

    public Vehicle(float speed) {
        this.speed = speed;

    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void speedUp(float up) {
        if (speed + up >= 240) {
            speed = 240;
        } else {
            speed += up;
        }

    }

    public void speedDown(float down) {
        if (speed - down <= 0) {
            speed = 0;
        } else {
            speed -= down;
        }
    }

}
