//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    try{
        String[] vec = sc.nextLine().split(" ");

        int op = sc.nextInt();
        System.out.println(vec[op]);
    }catch(InputMismatchException e){
        System.out.println("Informe um inteiro");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index inválido");
    }

    System.out.println("Finalizando o programa");
}
