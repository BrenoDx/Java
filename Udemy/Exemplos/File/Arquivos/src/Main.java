//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*
    //File 1
    Scanner sc = null;
    File file = new File("caminho");

    try{
        sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }finally {
        if(sc != null){
            sc.close();
        }
    }

    // FileReader & BufferedReader
    FileReader fr = null;
    BufferedReader br = null;

    String path = "caminho";
    try(BufferedReader br = new BufferedReader(new FileReader(path))){

        //fr = new FileReader(path);
        //br = new BufferedReader(fr);


        //br = new BufferedReader(new FileReader(path));
        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    // FileWriter & BufferedWriter
    String[] palavras = new String[] {"Olá", "Hello", "World"};
    String path = "caminho";
    // Sem o TRUE no FileWriter irá sobrescrever que tiver dentro do arquvio
    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
        for(String palavra : palavras){
            bw.write(palavra);
            bw.newLine();
        }

    }catch (IOException e){
        e.printStackTrace();
    }

    // Manipulando pasta/arquivos
    Scanner sc  = new Scanner(System.in);

    System.out.print("Caminho:");
    String strPath = sc.nextLine();

    File path = new File(strPath);
    File[] pastas = path.listFiles(File::isDirectory);
    System.out.println("Pastas:");
    for(File pasta : pastas){
        System.out.println(pasta);
    }

    File[] arquivos = path.listFiles(File::isFile);
    System.out.println("Arquivos:");

    for(File arquivo : arquivos){
        System.out.println(arquivo);
    }

    boolean status = new File(strPath + "\\teste").mkdir();
    System.out.println("Pasta criada com sucesso: " + status);
    */
    // Informação do caminho
    Scanner sc  = new Scanner(System.in);

    System.out.println("caminho:");
    String strCaminho = sc.nextLine();

    File path = new File(strCaminho);

    System.out.println("getPath: " + path.getPath());
    System.out.println("getName:" + path.getName());
    System.out.println("getParent: " + path.getParent());
}
