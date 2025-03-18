# UC09 - Desenvolver e organizar interface gráfica para aplicações desktop
## 🧑‍🏫 Contexto
Com o sucesso do projeto anterior, agora o Sindicato de Nutricionistas se interessa em um projeto de software para os consultórios dos nutricionistas associados. O software, a princípio, será desktop. Neste momento, serão feitas provas de conceito sem o uso de banco de dados. Com a aprovação do cliente, esse recurso poderá ser adicionado no futuro.

O software deve permitir a inclusão e exclusão de registros de consulta. Para cada consulta, informam-se o nome do paciente, o CPF, o telefone, a idade e a data da consulta. Por fim, há uma marcação indicando se essa pessoa já é paciente ou não.

Ao registrar a consulta, esta aparecerá para o usuário listada em uma tabela na tela. Para excluir uma consulta, o usuário deve selecionar a linha na tabela e clicar no botão Excluir. Para o usuário atualizar uma consulta, ele deve selecionar uma linha na tabela e marcar que a consulta já foi realizada. Além disso, pode informar, em texto, o que foi receitado ao paciente.

Todas as operações acontecerão sob listas em memória.

Crie um projeto Java no NetBeans e implemente o sistema, que contará com as seguintes telas:

1. **Tela inicial**, com a listagem de todas as consultas cadastradas em memória.

   O botão **Nova Consulta** leva à tela de **cadastro de consulta**. O botão **Excluir Consulta** exclui da lista o registro que estiver selecionado na tabela. O botão **Finalizar Consulta** leva à tela **Detalhes da Consulta**. Quando houver alguma ação de inclusão, exclusão ou finalização de consulta, a tabela sempre deve ser atualizada.

2. Tela de **cadastro da consulta.**

 Essa tela deve:
- Validar formato de CPF
- Validar formato de data
- Validar formato de telefone
- Não permitir cadastro sem informar nome, CPF, telefone e data da consulta

Ao clicar em **Cadastrar**, deve-se incluir novo registro na lista em memória e fechar a janela.
3. Tela de **detalhes e finalização da consulta.**

  Ao clicar no botão **Finalizar**, essa tela deve tornar-se visível. Será necessário um atributo na classe dessa tela para que você possa repassar a informação de qual consulta está selecionada e, neste caso, preencher esse atributo antes ou logo após abrir a janela.

  Nessa tela, a checkbox **Consulta Realizada** deve ser marcada automaticamente, se a consulta já está como realizada, e não ficar disponível para o usuário alterar (modo enabled falso).

  O campo **Receita e observações** é de texto livre. Nele, o nutricionista pode informar o histórico da consulta, por exemplo.

  O botão **Finalizar** deve ficar visível apenas se a consulta ainda não foi realizada. Quando clicado, registrará o texto digitado na consulta, atualizando-a para “já realizada”. Não se deve permitir a finalização sem um texto digitado na caixa de observações.

  Crie as classes necessárias para a implementação dessas regras. Toda a aplicação deve usar uma estrutura de dados em memória para seu funcionamento. Observe o uso de tratamento de exceção para evitar quebra do programa.
