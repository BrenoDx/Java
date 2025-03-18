# UC06 - Desenvolver código orientado a objetos
## 🧑‍🏫 Contexto
Considere um módulo contábil de um projeto em desenvolvimento. É preciso representar os diferentes e complexos impostos a serem calculados em vendas de produtos. São necessários cálculos para as contribuições e os impostos a seguir:
- **PIS** (Programa de Integração Social): necessita do valor total de débito e do valor total de crédito da empresa. O cálculo do imposto é “debito - credito * 1,65%”. Por exemplo: débito R$ 30000,00; crédito R$ 16000,00; (30000 - 16000) * 1,65% = 14000 * 1,65% = R$ 235.
- **IPI** (Imposto sobre Produtos Industrializados): necessita do valor da alíquota e valor do produto, frete, seguro, outras despesas. A soma desses quatro últimos valores formará a base de cálculo. O cálculo então será “IPI = base de cálculo * alíquota”. Exemplo: valor R$ 90, frete R$ 10, seguro R$ 5, outras despesas R$ 5; alíquota = 5%; IPI = (90 + 10 + 5 + 5) * 5% = R$ 5,5.
 Observação: alíquota é o percentual que se calcula sobre um valor para obter o total de imposto a pagar.

Para o sistema, note que, comumente a todos os impostos, é preciso saber calcular o valor do imposto e é preciso mostrar na tela sua descrição (“PIS”, por exemplo). Não há uma informação em comum entre os impostos, já que as bases de cálculo variam e as alíquotas podem ser fixas ou não.

Considerando tudo isso, planeje uma hierarquia de classes para representar esses impostos e permitir que novos sejam implementados no futuro.

O sistema ainda contará com uma classe “Pagamentos”, que conterá o nome da empresa, e uma lista de impostos a serem pagos.

Crie um projeto Java no NetBeans. Observe com atenção as características em comum entre os impostos e considere a utilização de hierarquia de classes com interfaces. Desenvolva as classes e interfaces e um programa em main(), para testar.

- Crie um objeto de “Pagamentos” para o qual o usuário informará dados.
- Permita que o usuário cadastre na lista de “Pagamentos” uma lista de impostos que possa receber ambos os tipos expostos no contexto. Não há um limite para a quantidade de impostos registrados – o usuário deve cadastrar vários consecutivos, informando o tipo de imposto e os valores necessários; informará “pare” para encerrar a entrada de dados de impostos.
- Ao fim do cadastramento, independentemente do tipo, mostre o total calculado para cada um dos impostos cadastrados e também mostre a descrição deles.
