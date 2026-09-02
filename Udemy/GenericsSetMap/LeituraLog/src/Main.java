import entidades.Log;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Caminho do arquivo: ");
    String path = sc.nextLine();

    try(BufferedReader br = new BufferedReader(new FileReader(path))){

        Set<Log> set = new HashSet<>();
        String linha = br.readLine();

        while(linha != null){

            String[] campos = linha.split(" ");
            String nome = campos[0];
            Date data = Date.from(Instant.parse(campos[1]));

            set.add(new Log(nome,data));
            linha = br.readLine();
        }
        System.out.println("Total users: "+ set.size());
    }catch(IOException e){
        System.out.println("Caminho inválido!");
    }
}
