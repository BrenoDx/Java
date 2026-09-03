//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();
    Set<Integer> c = new HashSet<>();
    Set<Integer> total = new HashSet<>();

    System.out.print("Quantos Alunos para curso A? ");
    int qtdA = sc.nextInt();
    for(int i = 0; i<qtdA; i++){
        System.out.print("Código do aluno "+(i+1)+": ");
        a.add(sc.nextInt());
    }

    System.out.print("Quantos Alunos para curso B? ");
    int qtdB = sc.nextInt();
    for(int i = 0; i<qtdB; i++){
        System.out.print("Código do aluno "+(i+1)+": ");
        b.add(sc.nextInt());
    }

    System.out.print("Quantos Alunos para curso C? ");
    int qtdC = sc.nextInt();
    for(int i = 0; i<qtdC; i++){
        System.out.print("Código do aluno "+(i+1)+": ");
        c.add(sc.nextInt());
    }

    total.addAll(a);
    total.addAll(b);
    total.addAll(c);

    System.out.println("Total de alunos: " +total.size());
    sc.close();
}
