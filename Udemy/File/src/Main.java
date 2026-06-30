import entidades.Produto;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Caminho do arquivo");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    List<Produto> lista = new ArrayList<>();

    try(BufferedReader sb = new BufferedReader(new FileReader(path))){
        String linha = sb.readLine();

        while(linha != null){
            String nome = linha.split(",")[0];
            String strValor = linha.split(",")[1];
            String strQtd = linha.split(",")[2];

            linha = sb.readLine();
            lista.add(new Produto(nome, parseDouble(strValor), parseInt(strQtd)));
        }
        File caminhoGerar = new File(path.getParent()+"\\sumario.csv");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoGerar, true))){
            for(Produto p: lista) {
                bw.write(p.getNome() + ", " + String.format("%.2f", p.total()));
                bw.newLine();
            }
            System.out.println("Arquivo csv gerado com sucesso");
        }catch(IOException e){
            e.printStackTrace();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

}
