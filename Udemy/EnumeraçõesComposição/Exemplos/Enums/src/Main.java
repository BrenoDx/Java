import entidades.Produto;
import entidades.enums.Status;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Produto p = new Produto(1, new Date(), Status.AGUARDANDO);

    System.out.println(p);
}
