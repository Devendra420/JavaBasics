package polymorphism;

public class NewCheck {
    void deposit(Double amount){
        System.out.println("FIRST DEPOSIT!!");
    }

    void withdraw(Double amount){
        System.out.println("FIRST WITHDRAW!!");
    }
    void deposit(Double amount, String sourceOfFund){
        System.out.println("SECOND DEPOSIT!!");
    }

}
