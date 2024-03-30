import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Loan loan1 = new Loan(scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());
        System.out.println(loan1.toString());

    }
}

class Loan {
    private double annualInterestRate;// 年利率
    private int numberOfYears;// 还款年限
    private double loanAmount;// 贷款额

    Loan() {

    }

    Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }// 有参构造

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthInterestRate = annualInterestRate / 1200;// 月利率
        double fenMu = 1 - (1 / (Math.pow(1 + monthInterestRate, numberOfYears * 12)));// 计算公式中的分母
        double monthlyPayment = loanAmount * (monthInterestRate / fenMu);
        return monthlyPayment;// 计算月还款额

    }

    public double getTotalPayment() {
        double monthlyPayment = getMonthlyPayment();
        double totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;// 计算总还款额
    }

    @Override
    public String toString() {
        return "贷款年利率是" + annualInterestRate + '\n' + "贷款总额是" + loanAmount + '\n' + "贷款年限是"
                + numberOfYears + '\n' + "月还款额是" + getMonthlyPayment() + '\n' + "还款总额是" + getTotalPayment();
    }
}
