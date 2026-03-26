    public void adminStart() {
        int choice;

        do {
            admin.menu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    fullCustomerReport();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    applyInterest();
                    break;
            }

        } while (choice != 0);
    }