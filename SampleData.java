    public void loadSampleCustomers() {
        Customer a = new Customer("Alice", "1111");
        a.getChecking().deposit(1000);
        a.getSavings().deposit(1000);

        Customer b = new Customer("Bob", "2222");
        Customer c = new Customer("Cindy", "3333");

        customers.add(a);
        customers.add(b);
        customers.add(c);
    }