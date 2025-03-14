package OOP;

public class SavingAccount extends BankAccount{
    private long interestRate;
    private long minBalance;
    public SavingAccount(String accountNumber, long balance, long interestRate,long minBalance)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }
    public void calculateInterest(){
    long principle = super.getBalance();
//    float time = 1/12;
        long interestAmount = principle * interestRate;
        System.out.printf("Calculated Interest: %s%n",interestAmount);
        super.deposit(interestAmount);
    }
    @Override
    public void withdraw(long amount){
         long currentBalance = super.getBalance();
         if(amount>(currentBalance-minBalance)){
            System.out.println("Insufficient amount!");
            return;
        }
         currentBalance = currentBalance-amount;
         super.setBalance(currentBalance);
    }
}
