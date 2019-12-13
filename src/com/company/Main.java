package com.company;

import java.util.Scanner;

public class Main {

    public void mainMethod(Scanner sc){
        String loginReg;
        System.out.println("Chcete se prihlasit nebo zaregistrovat?");
        loginReg = sc.nextLine();
        if (loginReg.equalsIgnoreCase("login")) {
            Login lg = new Login();
            lg.loginReturn();
        } else if (loginReg.equalsIgnoreCase("register")) {
            Register rg = new Register();
            System.out.println(rg.registerReturn());
        } else {
            System.out.println("Zadali jste spatnou volbu");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Main mm = new Main();
        mm.mainMethod(sc);
    }
}
