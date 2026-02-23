import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<String> lista = new ArrayList<>();

    public void salvar(String tarefa){
        lista.add(tarefa);
    }

    public void excluir(Integer opcao){
        lista.remove(opcao);
    }

    public void limpar(){
        lista.clear();
    }

    public List<String> listar(){
        return lista;
    }
}
