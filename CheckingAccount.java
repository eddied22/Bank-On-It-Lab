import java.util.Scanner;

public class CheckingAccount implements HasMenu {
    private double balance;
    private Scanner scanner = new Scanner(System.in);

    public CheckingAccount() {
        balance = 0.0;
    }

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.start();
    }

    public String menu() {
        return "\nAccount menu\n"
                + "0) quit\n"
                + "1) check balance\n"
                + "2) deposit\n"
                + "3) withdraw\n";
    }

    public void start() {
        int choice;
        do {
            System.out.println(menu());
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> makeDeposit();
                case 3 -> makeWithdrawal();
            }
        } while (choice != 0);
    }

    public double getBalance() {
        return balance;
    }

    public String getBalanceString() {
        return String.format("$%.2f", balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Balance: " + getBalanceString());
    }

    public void makeDeposit() {
        System.out.print("Deposit amount: ");
        double amt = scanner.nextDouble();
        balance += amt;
        System.out.println("New balance: " + getBalanceString());
    }

    public void makeWithdrawal() {
        System.out.print("Withdraw amount: ");
        double amt = scanner.nextDouble();
        balance -= amt;
        System.out.println("New balance: " + getBalanceString());
    }
}