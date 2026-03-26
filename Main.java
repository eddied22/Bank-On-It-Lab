import java.util.Scanner;
import java.io.*;

public class Bank implements HasMenu {

    private Admin admin;
    private CustomerList customers;
    private Scanner input;

    public Bank() {
        admin = new Admin();
        customers = new CustomerList();
        input = new Scanner(System.in);


        loadCustomers();
        start();
        saveCustomers();
    }

    @Override
    public void menu() {
        System.out.println("\nBank Menu");
        System.out.println("0) Exit system");
        System.out.println("1) Login as admin");
        System.out.println("2) Login as customer");
        System.out.print("\nAction: ");
    }

    @Override
    public void start() {
        int choice;

        do {
            menu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    if (admin.login()) {
                        adminStart();
                    } else {
                        System.out.println("Invalid admin login.");
                    }
                    break;

                case 2:
                    customerLogin();
                    break;
            }

        } while (choice != 0);
    }