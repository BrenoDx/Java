package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date data;
    private String titulo;
    private String conteudo;
    private int curtidas;

    private List<Comentarios> comentarios = new ArrayList<>();

    public Post(Date data, String titulo, String conteudo, int curtidas){
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public void adicionar_comentarios(Comentarios comentarios){
        this.comentarios.add(comentarios);
    }

    public void remover_comentarios(Comentarios comentarios){
        this.comentarios.remove(comentarios);
    }
}
