package abstraction;
public abstract class InterestTransactionService {
    double calculateInterest(){
        //Interest Calculation Logic
        return 0.0;
    }
    abstract void TransferInterest(String accountNumber);
    abstract void TransferInterest();
}