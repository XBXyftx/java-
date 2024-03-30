import java.util.Scanner;

public class TestAccount {

  public static void main(String[] arg) {

    Scanner input = new Scanner(System.in);

    Account a = new Account(input.nextInt(), input.nextDouble());

    System.out.println("账户是" + a.getId() + "\n初始余额是" + a.getBalance());

    a.withDraw(input.nextDouble());// 取款

    a.deposit(input.nextDouble());// 存款

  }

}

class Account {
  private int id = 0;
  private double balance = 0;// 余额

  public Account() {// 空参构造

  }

  public Account(int id, double balance) {// 有参构造
    this.id = id;
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void withDraw(double amount) {// 取款方法
    if (amount > balance) {
      System.out.println("余额不足");

    } else {
      balance -= amount;
      System.out.println("取款后余额是" + balance);
    }

  }

  public void deposit(double amount) {// 存款方法
    balance += amount;
    System.out.println("存款后余额是" + balance);
  }
}