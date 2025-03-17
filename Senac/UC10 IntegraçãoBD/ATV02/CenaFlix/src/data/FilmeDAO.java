/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */

/**
 * Classe responsável por acessar e manipular dados da classe "Filme" no Banco
 * de Dados.
 */
public class FilmeDAO {

    PreparedStatement ps; // Objeto para preparar e executar instruções SQL.
    Conexao c = new Conexao(); // Objeto de conexão com o Banco de Dados.

    /**
     * Método para salvar "Filme" cadastrado.
     */
    public int salvar(Filme filme) {
        int status;
        try {
            ps = c.conectar().prepareStatement("INSERT INTO filmes(nome, datalancamento, categoria) VALUES(?,?,?)");
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

    /**
     * Método para editar "Filme" já cadastrado no Banco de Dados.
     */
    public int atualizar(Filme filme) {
        int status;
        String sql = "UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? WHERE id = ?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, filme.getNome());
            ps.setDate(2, filme.getData());
            ps.setString(3, filme.getCategoria());
            ps.setInt(4, filme.getId());
            status = ps.executeUpdate();
            return status;
        } catch (SQLException sqle) {
            return sqle.getErrorCode();
        }
    }

    /**
     * Método para excluir "Filme" do Banco de Dados.
     */
    public boolean excluir(int id) {
        String sql = "DELETE FROM filmes WHERE id = ?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (SQLException sqle) {
            return false;
        }
    }

    /**
     * Método para pesquisar "Filme" no Banco de Dados com ID fornecido.
     */
    public Filme consultar(int id) {
        String sql = "SELECT * FROM filmes WHERE id = ?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Filme filme = new Filme();

            rs.next();
            filme.setId(id);
            filme.setNome(rs.getString("nome"));
            filme.setData(rs.getDate("datalancamento"));
            filme.setCategoria(rs.getString("categoria"));

            return filme;

        } catch (SQLException sqle) {
            return null;
        }
    }

    /**
     * Método do tipo LIST para obter "Filme" no Banco de Dados filtrados por categoria.
     */
    public List<Filme> getFilme(String pesquisa) {
        String sql = "SELECT * FROM filmes WHERE categoria LIKE?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, "%" + pesquisa + "%");
            ResultSet rs = ps.executeQuery();

            List<Filme> lista = new ArrayList<>();
            while (rs.next()) {
                Filme filme = new Filme();

                filme.setId(rs.getInt("id"));
                filme.setNome(rs.getString("nome"));
                filme.setData(rs.getDate("datalancamento"));
                filme.setCategoria(rs.getString("categoria"));
                lista.add(filme);
            }
            return lista;
        } catch (SQLException sqle) {
            return null;
        }
    }

}
