package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(titulo + "\n");
        sb.append(curtidas);
        sb.append(" Likes - ");
        sb.append(sdf.format(data) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Cometários:\n");

        for (Comentarios c : comentarios){
            sb.append(c.getTexto() + "\n");
        }

        return sb.toString();
    }
}
