import java.io.Serializable;
import java.util.Scanner;

public abstract class User implements HasMenu, Serializable {
    protected String userName;
    protected String pin;

    public boolean login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("User name: ");
        String u = sc.nextLine();

        System.out.print("PIN: ");
        String p = sc.nextLine();

        return login(u, p);
    }

    public boolean login(String u, String p) {
        if (u.equals(userName) && p.equals(pin)) {
            System.out.println("Login Successful\n");
            return true;
        }
        System.out.println("Login Failed\n");
        return false;
    }

    public void setUserName(String u) {
        userName = u;
    }

    public String getUserName() {
        return userName;
    }

    public void setPIN(String p) {
        pin = p;
    }

    public String getPIN() {
        return pin;
    }

    public abstract String getReport();
}