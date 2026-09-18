//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> list = Arrays.asList(3,4,5,10,7);

    Stream<Integer> st1 = list.stream().map(x -> x*10); // Criação Stream apartir de uma lista
    Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Criaçao Stream com Stream.of
    // Criação atraves de um interator
    Stream<Integer> st3 = Stream.iterate(0, x -> x+2); // Começa pelo 0 e soma x + 2 (interação infinita)
    Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, o -> new Long[] {o[1], o[0]+o[1]} ).map(o -> o[0]);

    System.out.println(Arrays.toString(st1.toArray()));
    System.out.println(Arrays.toString(st2.toArray()));
    System.out.println(Arrays.toString(st3.limit(10).toArray()));
    System.out.println(Arrays.toString(st4.limit(20).toArray()));
}
