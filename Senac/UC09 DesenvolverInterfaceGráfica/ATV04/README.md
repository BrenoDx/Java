# UC09 - Desenvolver e organizar interface gráfica para aplicações desktop
## 🧑‍🏫 Contexto
Os trabalhos com o Sindicato de Nutricionistas ganharam expressão e, com isso, alguns colegas cardiologistas mostraram-se interessados em também disponibilizar software a seus pacientes.

A ideia deles é disponibilizar um programa em que os pacientes que têm aparelho de aferimento de pressão possam registrar os dados de cada medição realizada. O software gravará esses dados em um arquivo que, no dia da consulta, poderá ser levado pelo paciente ao médico, para que este possa observar o histórico das medições.

O software precisa ter apenas uma tela, na qual o usuário informa: data, hora, pressão sistólica e pressão diastólica (estes dois últimos campos numéricos inteiros). O usuário também deve ser capaz de indicar se está em uma situação de estresse no momento da medição.

Como o software é voltado especialmente para pessoas idosas, é importante que use caracteres maiores e que implemente os seguintes aspectos de usabilidade e acessibilidade:
- Descrições acessíveis e tooltips nos componentes presentes na tela
- Associação de rótulos **(JLabel)** aos componentes correspondentes
- Ordem sequencial de foco nos componentes de tela
- Atalhos por teclado

Para esta proposta, crie um projeto Java no NetBeans com uma tela contendo labels, caixas de texto para os dados requisitados e checkbox para o usuário marcar se está em situação de estresse. Também é necessário existir um botão **Salvar**, para que haja a gravação desses dados em arquivo (texto ou CSV).

Esses dados devem ser mostrados na própria tela em uma tabela **(JTable)** ou um campo de texto livre **(JTextArea)**. Esse componente deverá ser preenchido ao abrir o programa e atualizado quando o usuário salvar nova medição.

O programa deverá emitir mensagens amigáveis em casos de falhas, por exemplo, quando um valor inadequado é informado.
