package polymorphism;

import cframework.DBManager;
import cframework.TransactionHistory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SavingAccount implements AccountTransactionService, InterestTransactionService, Serializable {

    private String accountNumber;
    private Double balance;
    private Double interestRate;
    private List<TransactionHistory> transactionHistories;
    private DBManager dbManager;

    public SavingAccount(String accountNumber, Double balance, Double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        transactionHistories = new ArrayList<>();
        dbManager = new DBManager();
    }

    @Override
    public void deposit(Double amount) {
        String updateQuery = """
				update accouts set balance = balance + ? where account_number = ?
				""";
        try {
            try (Connection connection = dbManager.getConnection()) {
                try(PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)){
                    preparedStatement.setDouble(1,amount);
                    preparedStatement.setString(2,this.accountNumber);
                    int updatedRows = preparedStatement.executeUpdate();
                    System.out.printf("Updated %s Rows%n",updatedRows);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        balance = this.balance + amount;
    }

    @Override
    public void withdraw(Double amount) {
        try{
            try (Connection connection = dbManager.getConnection()) {
                try(PreparedStatement preparedStatement = connection.prepareStatement("select * from accouts where account_number = ?")){
                    preparedStatement.setString(1,accountNumber);
                    try(ResultSet resultSet = preparedStatement.executeQuery()){
                        if(resultSet.next()) {
                            Double balance = resultSet.getDouble("balance");
                            if (balance >= amount) {
                                String withDrawQuery = """
								update accouts set balance = balance - ? where account_number = ?
								""";
                                try(PreparedStatement updateBalanceStatement = connection.prepareStatement(withDrawQuery)){
                                    updateBalanceStatement.setDouble(1,amount);
                                    updateBalanceStatement.setString(2,this.accountNumber);
                                    int updatedRows = updateBalanceStatement.executeUpdate();
                                    System.out.printf("Updated %s Rows%n",updatedRows);
                                }
                                balance = balance - amount;
                            } else {
                                System.out.println("You don't have sufficient balance.");
                            }
                        }
                    }
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("You don't have sufficient balance.");
        }
    }

    @Override
    public void deposit(Double amount, String sourceOfFund) {
        this.deposit(amount);
        //Handle source of fund as required.
        System.out.printf("Customer got the money from %s%n", sourceOfFund);
    }

    @Override
    public void TransferInterest(String accountNumber) {

    }

    @Override
    public void TransferInterest() {

    }

    @Override
    public void displayHistory() {
        System.out.println("AMOUNT               TYPE                Message");
        for (int i = 0; i < transactionHistories.size(); i++) {

            TransactionHistory history = transactionHistories.get(i);
            System.out.printf("%s               %s                %s%n", history.getAmount(), history.isDeposit() ? "Deposit" : "Credit", history.getOperationMessage());
        }
    }

    @Override
    public double calculateInterest() {
        double time = 1 / 12;
        double interest = time * interestRate * balance;
        return interest;
    }

    @Override
    public void processInterest(SavingAccount account) {
        double interest = this.calculateInterest();
        account.deposit(interest);
    }

    @Override
    public void processInterest() {
        double interest = this.calculateInterest();
        this.deposit(interest);
    }


    public void displayBalance() {
        System.out.printf("Your Available Balance is : Rs. %s%n", balance);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void TranserInterest(String accountNumber) {

    }

    public boolean writeTransactionHistory(TransactionHistory transactionHistory) {
        transactionHistories.add(transactionHistory);
        return true;
    }
}