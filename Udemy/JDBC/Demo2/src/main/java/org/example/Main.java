package org.example;
import DB.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            // Objeto de conexão com BD
            conn = DB.getConnection();

            // Criação do comando SQl INSERT
            ps = conn.prepareStatement(
                    "INSERT INTO seller"
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS // Retorna Id gerado no bd
            );

            ps.setString(1,"Carl Purple");
            ps.setString(2,"carl@gmail.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            ps.setDouble(4, 3000.0);
            ps.setInt(5, 4);

            int rowsAffected = ps.executeUpdate();

            //Lógica do RETURN_GENERATED_KEYS
            if(rowsAffected > 0){
                ResultSet rs = ps.getGeneratedKeys();

                //Pode ter mais de um valor caso fez mais de um INSERT
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! id = " + id);
                }
            }else{
                System.out.println("No rown affected!");
            }
            //System.out.println("Done! rows affected: " + rowsAffected);
        }catch(SQLException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

    }
}
