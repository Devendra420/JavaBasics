package abstraction;

public abstract class AccountTransactionService {

    abstract void deposit(Double amount);

    abstract void withdraw(Double amount);

    abstract double calculateInterest();

    abstract void deposit(Double amount, String sourceOfFund);

    abstract void TransferInterest(String accountNumber);

    public abstract void TransferInterest();
}