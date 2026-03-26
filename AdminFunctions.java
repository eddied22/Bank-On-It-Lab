    public void fullCustomerReport() {
        System.out.println("\nFull customer report");
        for (Customer c : customers) {
            System.out.println(c.getReport());
        }
    }

    public void addUser() {
        System.out.println("\nAdd User");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("PIN: ");
        String pin = input.nextLine();

        Customer c = new Customer(name, pin);
        customers.add(c);
    }

    public void applyInterest() {
        System.out.println("\nApply interest");
        for (Customer c : customers) {
            double newBalance = c.getSavings().calcInterest();
            System.out.println("New balance: $" + String.format("%.2f", newBalance));
        }
    }