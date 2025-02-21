public class BankServer implements ATM {
    private BankAcc account;

    public BankServer() {
        this.account = new BankAcc("shruti" , "sveri51" ,10000.0); 
    }
   
  

    @Override

    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public boolean getCash(double amount) {
        return account.withdraw(amount);
    }

    public void depositCash(double amount) {
        account.deposit(amount);
    }
}
