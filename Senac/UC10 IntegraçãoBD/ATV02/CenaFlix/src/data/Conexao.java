/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author breno
 */

/**
 * Classe responsável por conectar e desconectar ao banco de dados.
 */
public class Conexao {

    Connection conn;
    private String url = "jdbc:mysql://localhost:3306/cenaflix_bd";
    private String user = "root";
    private String password = "";

    /**
     * Método para conectar ao Driver e o Banco de Dados.
     */
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

    /**
     * Método para desconectar o Banco de Dados.
     */
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException e) {

        }
    }
}
