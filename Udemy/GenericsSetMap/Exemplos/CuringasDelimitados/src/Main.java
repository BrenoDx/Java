import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Forma> myShapes = new ArrayList<>();
    myShapes.add(new Retangulo(3.0,2.0));
    myShapes.add(new Circulo(2.0));

    System.out.println("Total area: " + totalArea(myShapes));

    List<Integer> myInts = Arrays.asList(1,2,3,4);
    List<Double> myDoubles = Arrays.asList(3.14,6.28);
    List<Object> myObjs = new ArrayList<Object>();

    // Princípio Get/Put  covariância/contravariância
    copy(myInts,myObjs);
    printList(myObjs);
    copy(myDoubles,myObjs);
    printList(myObjs);

}
public static void copy(List<? extends Number>origem, List<? super Number>destino){
    for(Number n : origem){
        destino.add(n);
    }
}
public static void printList(List<?>lista){
    for(Object o : lista){
        System.out.print(o + " ");
    }
    System.out.println( );
}
public static double totalArea(List<? extends  Forma>lista){
    double soma = 0.0;
    for(Forma f : lista){
        soma += f.area();
    }
    return soma;
}

