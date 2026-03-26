    public void saveCustomers() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("customers.dat"));
            out.writeObject(customers);
            out.close();
        } catch (Exception e) {
            System.out.println("Error saving.");
        }
    }

    public void loadCustomers() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("customers.dat"));
            customers = (CustomerList) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println("No data found, loading sample.");
            loadSampleCustomers();
        }
    }
}
public class User implements Serializable
public class Customer extends User implements Serializable
public class CheckingAccount implements Serializable
public class SavingsAccount extends CheckingAccount implements Serializable