import entidades.Funcionarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Funcionarios> list = new ArrayList<>();
    String path = "C:\\Users\\breno\\OneDrive\\Área de Trabalho\\teste.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
        String funcionarioCsv = br.readLine();
        while(funcionarioCsv != null){
            String[] campos = funcionarioCsv.split(",");
            list.add(new Funcionarios(campos[0],Double.parseDouble(campos[1])));
            funcionarioCsv = br.readLine();
        }
        Collections.sort(list);
        for(Funcionarios f : list){
            System.out.println(f.getNome()+", "+f.getSalario());
        }
    }catch (IOException e){
        System.out.println("Error:" +e.getMessage());
    }

}
