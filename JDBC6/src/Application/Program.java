package Application;

import DB.DB;
import DB.DBIntegrityException;
import DB.DbException;

import java.sql.*;

public class Program {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false);

            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error");
//            }

            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("Rows one:  " + rows1);
            System.out.println("Rows two:  " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by:  " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by:  " + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
