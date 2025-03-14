package polymorphism;

public class BankAccount {

    abstract class Acc {
        protected String accountNumber;
        protected double balance;
        protected double interestRate;

        Acc(String accountNumber ,double balance ){
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        Acc(){

        }

//    public void deposit1(double amount){
//        System.out.println("The balance after deposit is: ");
//        balance = balance + amount;
//        System.out.println(balance);
//
//    }

        double getbalance(){
            return balance;
        }

        void setbalance(double balance){
            this.balance = balance;
        }

        public String getAccountNumber(){
            return this.accountNumber;
        }

        abstract boolean withdraw1(double amount);
        abstract void deposit1(double amount);


    }

}
