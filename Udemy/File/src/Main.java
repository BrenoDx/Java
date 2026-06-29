import entidades.Produto;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Caminho do arquivo");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    try(BufferedReader sb = new BufferedReader(new FileReader(path))){
        String linha = sb.readLine();

        String nome = linha.split(",")[0];
        String strValor = linha.split(",")[1];
        String strQtd = linha.split(",")[2];

        Produto p = new Produto(nome, parseDouble(strValor), parseInt(strQtd));
    } catch (IOException e) {
        e.printStackTrace();
    }

}
