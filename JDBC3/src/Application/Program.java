package Application;

import DB.DB;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DB.getConnection();
//            preparedStatement = connection.prepareStatement(
//                    "INSERT INTO seller "
//                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
//                    + "VALUES "
//                    + "(?, ?, ?, ?, ?)",
//                    Statement.RETURN_GENERATED_KEYS);
//
//            preparedStatement.setString(1, "Carl Purple");
//            preparedStatement.setString(2, "carl@gmail.com");
//            preparedStatement.setObject(3, LocalDate.parse("22/04/1985", dateTimeFormatter));
//            preparedStatement.setDouble(4, 3000.0);
//            preparedStatement.setInt(5, 4);

            preparedStatement = connection.prepareStatement(
                    "insert into department (Name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id =  " + id);
                }
            }
            else {
                System.out.println("No row affected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
