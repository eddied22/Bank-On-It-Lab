    public void customerLogin() {
        System.out.print("\nUser name: ");
        String name = input.nextLine();

        System.out.print("PIN: ");
        String pin = input.nextLine();

        for (Customer c : customers) {
            if (c.login(name, pin)) {
                c.start();
                return;
            }
        }

        System.out.println("Login failed.");
    }