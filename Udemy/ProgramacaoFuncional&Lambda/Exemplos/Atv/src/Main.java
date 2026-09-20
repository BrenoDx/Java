import entidades.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Caminho do arquivo:");
    String path = sc.nextLine();

    try(BufferedReader br = new BufferedReader(new FileReader(path))) {
        List<Produto> list = new ArrayList<>();
        String linha = br.readLine();

        while(linha != null){
            String[] campos = linha.split(",");
            list.add(new Produto(campos[0], Double.parseDouble(campos[1])));
            linha = br.readLine();
        }

        // Pipeline para pegar a media dos valores dos produtos
        double media = list.stream()
                .map(p -> p.getVlr())
                .reduce(0.0, (x,y) -> x+y) / list.size();
        System.out.println("Média valores: " + String.format("%.2f", media));

        // Pipeline para pegar nomes em ordem decrescente que possuem preço inferior ao preço médio
        List<String> nomes = list.stream()
                .filter(p -> p.getVlr() < media)
                .map(p -> p.getNome())
                .sorted((s1, s2) -> s2.toUpperCase().compareTo(s1.toUpperCase()))
                .collect(Collectors.toList());
        nomes.forEach(System.out::println);

    }catch (IOException e){
        System.out.println("Caminho|Arquivo inválido!");
    }
    sc.close();
}
