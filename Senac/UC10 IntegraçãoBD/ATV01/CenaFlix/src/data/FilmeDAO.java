/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.time.LocalDate;
/**
 *
 * @author breno
 */
public class FilmeDAO {

    public String url = "jdbc:mysql://localhost:3306/cenaflix_bd";
    public String user = "root";
    public String password = "";
    Connection conn;
    PreparedStatement ps;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException sqle) {

        }
    }

    public int salvar(Filme filme) {
        int status;
        try {
            ps = conn.prepareStatement("INSERT INTO filmes(nome, datalancamento, categoria) VALUES(?,?,?)");
            ps.setString(1, filme.getNome());
            ps.setDate(2, filme.getData());
            ps.setString(3, filme.getCategoria());

            status = ps.executeUpdate();
            return status;
        } catch (SQLException slqe) {
            System.out.println("Erro ao conectar " + slqe.getMessage());
            return slqe.getErrorCode();
        }
    }

}
