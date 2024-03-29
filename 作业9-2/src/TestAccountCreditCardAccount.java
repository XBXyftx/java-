import java.util.Scanner;

public class TestAccountCreditCardAccount {

        public static void main(String[] args) {

                try (Scanner input = new Scanner(System.in)) {
                        CreditCardAccount creaditAccount = new CreditCardAccount(1, 2, 2);

                        System.out.println("--------信用卡账户的初始信息---------\n" + creaditAccount.toString());

                        creaditAccount.depoit(input.nextDouble());

                        System.out.println("--------信用卡账户存款后的信息--------\n" + creaditAccount.toString());

                        creaditAccount.withDraw(input.nextDouble());

                        System.out.println("--------信用卡账户取款后的信息--------\n" + creaditAccount.toString());

                        System.out.println("\n*********************************************\n");

                        SavingsCard savingsCard = new SavingsCard(2, 2);

                        System.out.println("--------储蓄卡账户的初始信息---------\n" + savingsCard.toString());

                        savingsCard.depoit(input.nextDouble());

                        System.out.println("--------储蓄卡账户存款后的信息--------\n" + savingsCard.toString());

                        savingsCard.withDraw(input.nextDouble());

                        System.out.println("--------储蓄卡账户取款后的信息--------\n" + savingsCard.toString());
                }

        }

}

class Account {
        protected int id;
        protected double balance;

        public Account() {

        }

        public Account(int id, double balance) {
                this.id = id;
                this.balance = balance;
        }

        public void depoit(double money) {
                this.balance += money;
        }

        public void withDraw(double money) {
                this.balance -= money;
        }

        @Override
        public String toString() {
                return "Account [id=" + id + ", balance=" + balance + "]";
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
}

class CreditCardAccount extends Account {
        private double creditCardLimit = 5000;

        public CreditCardAccount() {
                super();
        }

        public CreditCardAccount(int id, double balance, double creditCardLimit) {
                super(id, balance);
                this.creditCardLimit = creditCardLimit;
        }

        public void withDraw(double money) {
                if (money > balance + creditCardLimit) {
                        System.out.println("余额不足");
                } else {
                        super.withDraw(money);
                }

        }

        public double getCreditCardLimit() {
                return creditCardLimit;
        }

        public void setCreditCardLimit(double creditCardLimit) {
                this.creditCardLimit = creditCardLimit;
        }

        @Override
        public String toString() {
                return "账户 1 余额" + balance + " " + " 额度 " + " " + creditCardLimit;
        }
}

class SavingsCard extends Account {
        public SavingsCard() {
                super();
        }

        public SavingsCard(int id, double balance) {
                super(id, balance);
        }

        public void withDraw(double money) {
                if (money > balance) {
                        System.out.println("余额不足");
                } else {
                        super.withDraw(money);
                }
        }

        @Override
        public String toString() {
                return "账户 2 余额" + balance;
        }

}