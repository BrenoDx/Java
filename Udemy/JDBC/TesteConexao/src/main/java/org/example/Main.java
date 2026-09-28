package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "1234567";

        System.out.println("Conectando ao MySQL com java 25 e Connector 26.7");

        try(Connection conexao = DriverManager.getConnection(url,user,password)){
            if(conexao != null && !conexao.isClosed()){
                System.out.println("Conexão estabelecida!");
                System.out.println("Informações do Driver:" + conexao.getMetaData().getDriverVersion());
            }
        }catch(SQLException e ){
            System.out.println("Falha na conexão com banco de dados. ");
            e.printStackTrace();
        }
    }
}
