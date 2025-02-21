import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAcc user = new BankAcc();
        boolean isAuthenticated = user.login(); 

        if (!isAuthenticated) {
            System.out.println("... Try again after 3 hours.");
            return; 
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nBanking Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + user.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    user.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    user.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Now, You are Logout... Thank you");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
