package dbcon;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DBConMain {
    private static String dbUrl = "jdbc:mysql://localhost:3306/Banking_System";
    private static String dbUsername = "root";
    private static String dbPassword = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number");
        String account_no = scanner.nextLine();
        try {
            try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
                String insertQuery = """
                        insert into transaction_history(account_id, is_deposit, amount, operation_message,date_time)
                        VALUE(????);
                        """;
                LocalDateTime localDateTime = LocalDateTime.now();
                try(PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)){
                    preparedStatement.setInt(1,1);
                    preparedStatement.setBoolean(2,true);
                    preparedStatement.setString(3,"Debit Message");
                    preparedStatement.setDouble(4,500.0);
                    preparedStatement.setString(5, localDateTime.toString());
                    var updatedRows = preparedStatement.executeUpdate();
                    System.out.println(updatedRows);



                }
//                try (PreparedStatement preparedStatement = connection.prepareStatement("select * from Account where account_number = ? and balance > ?")) {
//                    preparedStatement.setString(1,account_no);
//                    preparedStatement.setDouble(2,0.0);
//                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                        while (resultSet.next()) {
//                            System.out.println(resultSet.getInt("id"));
//                            System.out.println(resultSet.getInt("account_number"));
//                            System.out.println(resultSet.getDouble("balance"));
//                        }
//                    }
//                }
            }
        }
        catch (SQLException e) {
            System.out.println("Failed to Connect to Database.");
            System.out.println(e.getMessage());
        }}}

