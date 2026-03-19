public class SavingsAccount extends CheckingAccount {
    private double interestRate;

    public SavingsAccount() {
        super();
        interestRate = 0.01;
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.start();
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void calcInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}