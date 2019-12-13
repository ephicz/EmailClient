package com.company;

import java.util.Scanner;
import java.sql.*;

public class Login {
    Scanner sc = new Scanner(System.in, "Windows-1250");
    public void loginReturn() {
        String loginUsername;
        System.out.println("Zadejte jmeno");
        loginUsername = sc.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login", "root", "2000300");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users where users.usersName like '" + loginUsername + "'");

            if (rs.next()) {
                String loginPass;
                String inputPass;
                System.out.println("Zadejte heslo");
                inputPass = sc.nextLine();
                loginPass = rs.getString(4);


                if (loginPass.equals(inputPass)) {
                    System.out.println("Spravne heslo, prihlasuji");
                } else {
                    //System.out.println(inputPass + " neni vase heslo. " + loginPass + " je vase heslo.");
                    System.out.println("Vase jmeno nebo heslo je spatne");
                    loginReturn();
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
