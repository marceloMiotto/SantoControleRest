package br.com.santocontrole.database.connectionHelper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConHelper {

    public ConHelper(){};

    public Connection getConnection() {

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/sc", "postgres",
                    "p0stgr3s");
            System.out.println("Connected "+connection);

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }

        return connection;

    }
}
