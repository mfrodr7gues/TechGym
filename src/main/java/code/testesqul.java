package code;

import java.sql.*;

public class testesqul {
    public static void main(String[] args) {

        try {
            Connection connetion = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/teste",
                    "root",
                    "Loueiz");

            Statement statement = connetion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("idusu"));
                System.out.println("Nome: " + resultSet.getString("nome"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Senha: " + resultSet.getString("senha"));
                System.out.println("-----------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
