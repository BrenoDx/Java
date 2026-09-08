//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  Scanner sc = new Scanner(System.in);
  Map<String,Integer> votos = new LinkedHashMap<>();

  System.out.println("Contagem de votos");
  System.out.println("Caminho do arquivo (NOME, VOTOS):");
  String path = sc.nextLine();

  try(BufferedReader br = new BufferedReader(new FileReader(path))){
    String linha = br.readLine();

    while(linha != null){
      String[] campo = linha.split(",");

      if(votos.containsKey(campo[0])){
        Integer parcial = votos.get(campo[0]) + Integer.parseInt(campo[1]);
        votos.put(campo[0], parcial);
      }else {
        votos.put(campo[0], Integer.parseInt(campo[1]));
      }

      linha = br.readLine();
    }

    for(String set: votos.keySet()){
      System.out.println(set + ": "+votos.get(set));
    }
    
  }catch(IOException e){
    System.out.println("Arquivo não encontrado! ");
  }

}
