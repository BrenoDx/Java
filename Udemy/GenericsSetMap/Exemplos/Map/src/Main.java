//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Map<String, String> cookies = new TreeMap<>();

    //Adicionando(chave, valor)
    cookies.put("usuario","maria");
    cookies.put("email","maria@email.com");
    cookies.put("telefone", "99112233");

    //Removendo conteudo do map pela chave
    cookies.remove("email");
    cookies.put("telefone","112233 ");

    System.out.println("Contém chave 'telefone'? "+ cookies.containsKey("telefone"));
    System.out.println("Número telefone:"+cookies.get("telefone"));
    System.out.println("Email:"+cookies.get("email"));
    System.out.println("Quantidade:"+cookies.size());

    System.out.println("COOKIES");
    // keySet retorna um Set
    for(String chave : cookies.keySet()){
        System.out.println(chave+": "+ cookies.get(chave));
    }
}
