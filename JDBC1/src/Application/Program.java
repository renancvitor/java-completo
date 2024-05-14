package Application;

import java.sql.Connection;

import DB.DB;

public class Program {

    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
