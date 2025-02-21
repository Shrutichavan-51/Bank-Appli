import java.util.Scanner;

public class BankAcc {
    private String username;
    private String password;
    private double balance;

    // Constructor to initialize account details
    public BankAcc(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Default constructor (if needed)
    public BankAcc() {
        this.username = "shruti"; 
        this.password = "sveri51";
        this.balance = 10000; 
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

         // Display the welcome messag
        System.out.println("Welcome");
        System.out.println("-------------------------------------------------------------");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();

            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();
           System.out.println("-------------------------------------------------------------");

            if (this.username.equals(inputUser) && this.password.equals(inputPass)) {
                System.out.println("Login successful! Accessing your account...");
                return true;
            } else {
                attempts++;
                if(!this.username.equals(inputUser)){
                    System.out.println("Incorrect USERNAME ! Attempts left: " + (MAX_ATTEMPTS - attempts));
               }
               else{
                   System.out.println("Incorrect PASSWORD ! Attempts left: " + (MAX_ATTEMPTS - attempts));
                    }
            }
        }

        System.out.println("Too many failed login attempts! Access denied for 3 hours.");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        return true;
    }
}
