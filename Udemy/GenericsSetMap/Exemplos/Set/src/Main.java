import entidades.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Set<String> set = new LinkedHashSet<>();

    set.add("TV");
    set.add("Tablet");
    set.add("Notebook");


    System.out.println(set.contains("Notebook"));

    set.remove("Tablet");
    set.removeIf( x-> x.length() >= 3);

    for(String p : set){
        System.out.println(p);
    }

    Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
    Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

    //Union
    Set<Integer> c = new TreeSet<>(a); 
    c.addAll(b);
    System.out.println(c);

    //Intersection
    Set<Integer> d = new TreeSet<>(a);
    d.retainAll(b);
    System.out.println(d);

    //Difference
    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);
    System.out.println(e);

    // Igualdade (Equals & HashCode) com SET
    Set<Produto> set2 = new HashSet<>();
    set2.add(new Produto("TV", 900.0));
    set2.add(new Produto("Notebook", 1200.0));
    set2.add(new Produto("Tablet", 400.0));

    Produto prod = new Produto("Notebook", 1200.0);
    System.out.println(set2.contains(prod));

}
