import services.PrintService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    PrintService<Integer> ps = new PrintService<>();

    System.out.println("Quantos valores irá digitar:");
    int n = sc.nextInt();

    for(int i =0; i <n;i++){
        int value = sc.nextInt();
        ps.addValue(value);
    }

    ps.print();
    System.out.println("First:"+ps.firts());
    sc.close();
}
