import entidades.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Selecione quantidade de Alunos: ");
    int qtd = sc.nextInt();


    Aluno[] alunos = new Aluno[qtd];
    double soma = 0;
    double maiorNota = 0;
    String aluno="";

    for(int i =0; i < qtd; i++){
        sc.nextLine();
        System.out.println("Nome aluno " + (i+1));
        String nome = sc.nextLine();

        System.out.println("Nota:");
        double nota = sc.nextDouble();

        alunos[i] = new Aluno(nome, nota);
        soma += nota;
    }

    double media = soma / qtd;

    for(int i=0; i<qtd; i++){
        if (alunos[i].getNota() > maiorNota) {
            maiorNota = alunos[i].getNota();
            aluno = alunos[i].getNome();
        }
    }

    System.out.printf("Média da sala foi %.2f%n", media);
    System.out.printf("Maior nota da sala foi de:%.2f do aluno:%s", maiorNota, aluno);

}
