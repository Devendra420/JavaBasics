package OOP;

public class AccountKoMain {
    public static void main(String[] args){
        CurrentAccount currentAccount= new CurrentAccount("234567890",11,12323);
            currentAccount.checkBalance();
            StudentAccount studentAccount = new StudentAccount("1212",10000,0,0);
            studentAccount.withdraw(1000);
            studentAccount.checkBalance();

        }
}
