package OOP;

public class BankAccount{
    private String accountNumber;
    private double balance;

public  BankAccount(String accountNumber, long balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
}
public void checkBalance(){
    System.out.printf("New Balance: %s%n", balance);
}

public void deposit(long amount){
    balance = balance+amount;
}
public void withdraw(long amount){
    if(balance < amount){
        System.out.println("Not Enough Balance.");
        return;
    }
    balance = balance-amount;
}
public long getBalance(){
    return (long) balance;
}
protected void setBalance(long balance){
    this.balance = balance;
}

}