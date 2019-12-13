package com.company;

import java.sql.*;

public class Register {
    public String registerReturn() {
        //String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
        //        + " values (?, ?, ?, ?, ?)";



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login", "root", "2000300");
            Statement stmt2 = con2.createStatement();
            ResultSet rs2 = stmt2.executeQuery("select * from users where users.usersName like '" + loginUsername + "'");

            if (rs2.next()) {
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
