//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);


    System.out.println();
    int q = sc.nextInt();
    int[][] mat = new int[q][q];

    for (int i = 0; i<mat.length; i++){
        for (int j = 0; j<mat.length; j ++){
            System.out.println();
            int n = sc.nextInt();
            mat[i][j] = n;
        }
    }
    System.out.println("Diagonal principal");
    for (int i = 0; i < mat.length; i++){
        System.out.println(mat[i][i]);
    }

    System.out.println("Números negativos");
    for (int i = 0; i< mat.length; i++){
        for (int j =0; j < mat.length; j++){
            if (mat[i][j] < 0 ){
                System.out.println(mat[i][j]);
            }
        }
    }

}
