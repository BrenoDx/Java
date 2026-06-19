//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*
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

    FileReader fr = null;
    BufferedReader br = null;
     */
    String path = "caminho";
    try(BufferedReader br = new BufferedReader(new FileReader(path))){
        /*
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        */

        //br = new BufferedReader(new FileReader(path));
        String line = br.readLine();

        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

}
