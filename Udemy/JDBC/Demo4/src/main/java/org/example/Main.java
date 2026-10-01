package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.DB;
import DB.DbIntegrityException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "DELETE FROM department "
                            + "WHERE "
                            + "Id = ?"
            );

            ps.setInt(1,2);

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: "+rowsAffected);

        }catch(SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
