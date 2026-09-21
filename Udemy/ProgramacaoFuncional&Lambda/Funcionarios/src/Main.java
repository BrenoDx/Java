import entidades.Funcionarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Funcionarios> list = new ArrayList<>();
    double soma = 0;

    System.out.print("Caminho do arquivo .txt: ");
    String path = sc.nextLine();

    System.out.print("Informe salário para filtrar: ");
    double salario = sc.nextDouble();

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
        String linha = br.readLine();
        while(linha != null) {
            String[] campos = linha.split(",");
            list.add(new Funcionarios(campos[0], campos[1], Double.parseDouble(campos[2])));
            linha = br.readLine();
        }

        List<String> emails = (list.stream().
                filter(x -> x.getSalario() >= salario)
                .map(Funcionarios::getEmail)
                .sorted()
                .collect(Collectors.toList()));

        soma =  list.stream()
                .filter(x -> x.getNome().charAt(0) == 'M')
                .mapToDouble(Funcionarios::getSalario)
                .sum();

        System.out.println("Emails dos funcionários que tem salário de "+ String.format("%.2f", salario)+"+:");
        emails.forEach(System.out::println);
        System.out.printf("Soma do salários das pessoas que começa com a letra 'M': %.2f", soma);

    }catch(IOException e){
        System.out.println("Caminho/Arquivo inválido!");
    }
}
