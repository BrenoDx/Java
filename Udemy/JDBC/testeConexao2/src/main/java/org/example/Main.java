package org.example;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Connection conn = DB.getConnection();
        System.out.println("Conexão realizada!");
        DB.closeConnection();
    }
}
