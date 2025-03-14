package abstraction;
public class CurrentAccount extends AccountTransactionService {
    private Double balance;
    private String accountNumber;
    private Double overdraftAmount;

    public CurrentAccount(String accountNumber, Double balance, Double overdraftAmount) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public void deposit(Double amount) {
        balance = this.balance + amount;
    }

    @Override
    public void withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Amount!");
        } else {

            balance = balance - amount;
        }
    }

    @Override
    public double calculateInterest() {

        return 0;
    }

    @Override
    public void deposit(Double amount, String sourceOfFund) {
        this.deposit(amount);
        System.out.printf("User may get the money from %s%n", sourceOfFund);

    }

    @Override
    public void TransferInterest(String accountNumber) {

    }

    @Override
    public void TransferInterest() {

    }

}