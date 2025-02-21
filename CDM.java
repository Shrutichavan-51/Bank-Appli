import java.util.Scanner;

public class CDM {
    private BankServer bankServer;

    public CDM(BankServer bankServer) {
        this.bankServer = bankServer;
    }

    public void depositCash() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");

        double amount = sc.nextDouble();
        bankServer.depositCash(amount);

        System.out.println("Successfully deposited: " + amount);
        System.out.println("Your Updated Balance: " + bankServer.getBalance());
    }
}
