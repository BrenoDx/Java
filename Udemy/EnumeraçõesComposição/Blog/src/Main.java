import entidades.Comentarios;
import entidades.Post;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    String titulo = "Japão";
    String conteudo = "Em tokyo";
    String titulo2 = "França";
    String conteudo2 = "Em Paris";

    Comentarios c1 = new Comentarios("Boa viagem");
    Comentarios c2 = new Comentarios("Lugar lindo!");
    Comentarios c3 = new Comentarios("Boa noite");


    Post post = new Post(sdf.parse("21/06/2018 13:05:44"), titulo, conteudo, 12);
    post.adicionar_comentarios(c1);
    post.adicionar_comentarios(c2);

    Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),titulo2, conteudo2, 12);
    post2.adicionar_comentarios(c3);
    post2.adicionar_comentarios(c2);

    System.out.println(post);
    System.out.println(post2);
}
