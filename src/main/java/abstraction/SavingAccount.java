package abstraction;

public class SavingAccount extends AccountTransactionService {
    private double balance;
    private String accountNumber;
    private double interestRate;
    public SavingAccount(String accountNumber, double balance, double interestRate){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public  void deposit(Double amount) {
        balance = this.balance + amount;
        System.out.println("New balance is "+ balance);
    }

    @Override
    public void withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
        } else {

            balance = balance - amount;
            System.out.println("New balance is "+ balance);
        }
    }

    @Override
    public double calculateInterest() {
        double principal;
        principal = balance;
        double time = (float)1/12 ;
        double interestAmount = (principal*time*interestRate)/100;
        this.deposit(interestAmount);
        return principal;
    }

    @Override
    public void deposit(Double amount, String sourceOfFund) {
        this.deposit(amount);
        System.out.printf("User may get the money from %s%n",sourceOfFund);
    }

    @Override
    public void TransferInterest(String accountNumber) {
        double interest = this.calculateInterest();
    }

    @Override
    public void TransferInterest(){
        double interest = this.calculateInterest();
        this.deposit(interest);
    }

}
