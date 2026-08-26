import entidades.Produto;
import services.CalculadoraService;

// Exemplos metodos genericos
void main() {
    Locale.setDefault(Locale.US);
    List<Produto> list = new ArrayList<>();
    String path = "C:\\Users\\breno\\OneDrive\\Área de Trabalho\\teste.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
        String linha = br.readLine();
        while(linha != null){
            String[] campos = linha.split(",");
            list.add(new Produto(campos[0],Double.parseDouble(campos[1])));
            linha = br.readLine();
        }
        Produto x = CalculadoraService.max(list);
        System.out.println("Max:");
        System.out.println(x);
    }catch(IOException e){
        System.out.println("Error: "+ e.getMessage());
    }

}
