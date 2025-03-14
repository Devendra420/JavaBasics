package polymorphism;

public interface AccountTransactionService{

    void deposit(Double amount);

    void withdraw(Double amount);

    void displayHistory();

    double calculateInterest();

    void deposit(Double amount, String sourceOfFund);

    void TransferInterest(String accountNumber);

    void TransferInterest();

    String getAccountNumber();

    void TranserInterest(String accountNumber);
}