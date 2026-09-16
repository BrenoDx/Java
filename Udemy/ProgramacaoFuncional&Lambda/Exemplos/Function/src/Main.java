import entidades.Produto;
import util.UpperCaseName;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    List<Produto> list = new ArrayList<>();

    list.add(new Produto("Tv", 900.00));
    list.add(new Produto("Mouse", 50.00));
    list.add(new Produto("Tablet", 350.50));
    list.add(new Produto("HD Case", 80.90));

    //List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); Implementação de Interface

    //List<String> nomes = list.stream().map(Produto::staticUpperCaseNome).collect(Collectors.toList()); Método estático
    List<String> nomes = list.stream().map(Produto::noStaticUpperCaseNome).collect(Collectors.toList());// Método não estático
    nomes.forEach(System.out::println);
}
