package org.example;

import DB.DB;
import DB.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            // Criando obj de conexão com BD
            conn = DB.getConection();

            // Criação do comando SQL
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM department");

            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", "+ rs.getString("Name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeConnection();
            DB.closeStatement(st);
            DB.closeResultSet(rs);

        }
    }
}
