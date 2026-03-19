import java.util.Scanner;

public class Customer extends User {
    private CheckingAccount checking;
    private SavingsAccount savings;
    private Scanner scanner = new Scanner(System.in);

    public Customer() {
        this("Alice", "0000"); // default user
    }

    public Customer(String u, String p) {
        userName = u;
        pin = p;
        checking = new CheckingAccount();
        savings = new SavingsAccount();
    }

    public static void main(String[] args) {
        Customer c = new Customer();

        if (c.login()) {
            c.start();
        }
    }

    public String menu() {
        return "\nCustomer Menu\n"
                + "0) Exit\n"
                + "1) Checking\n"
                + "2) Savings\n"
                + "3) Change PIN\n";
    }

    public void start() {
        int choice;
        do {
            System.out.println(menu());
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checking.start();
                case 2 -> savings.start();
                case 3 -> changePin();
            }
        } while (choice != 0);
    }

    public void changePin() {
        System.out.print("Enter new PIN: ");
        pin = scanner.next();
        System.out.println("PIN updated.");
    }

    public String getReport() {
        return "User: " + userName +
                "\nChecking: " + checking.getBalanceString() +
                "\nSavings: " + savings.getBalanceString();
    }
}