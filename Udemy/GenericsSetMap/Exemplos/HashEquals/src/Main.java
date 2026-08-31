import entidades.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cliente c1 = new Cliente("maria", "maria@gmail.com");
    Cliente c2 = new Cliente("maria","alex@gmail.com");

    String s1 = "teste";
    String s2 = "teste";

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2);
    System.out.println(s1 == s2);
}
