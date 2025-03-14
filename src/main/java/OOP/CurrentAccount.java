package OOP;

public class CurrentAccount extends BankAccount{
    private long overdraftAmount;
    public CurrentAccount (String accountNumber, long balance, long overdraftAmount)
    {
        super(accountNumber, balance);
        this.overdraftAmount = overdraftAmount;
    }
    @Override
    public void withdraw(long amount){
        long currentBalance = super.getBalance();
        if(amount>(currentBalance+overdraftAmount)){
            System.out.println("Not Enough Balance.");
            return;
        }
        currentBalance = currentBalance - amount;
        super.setBalance(currentBalance);
    }
}
