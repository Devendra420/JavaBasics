package polymorphism;

public class PolyMain {
    public static void main(String[] args){
        AccountTransactionService accountTransactionService = new SavingAccount("12131",1000.0,12.0);
        accountTransactionService.calculateInterest();
        accountTransactionService.deposit(10000.0);
    }
}
