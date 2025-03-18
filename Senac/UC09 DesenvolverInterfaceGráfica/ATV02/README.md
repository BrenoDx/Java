# UC09 - Desenvolver e organizar interface gráfica para aplicações desktop
## 🧑‍🏫 Contexto
O Sindicato dos Nutricionistas pretende fazer uma ação diferente com seus associados. Ele distribuirá aos nutricionistas softwares desktop para realizar rapidamente cálculos muito comuns na rotina desses profissionais.

O software precisa realizar:
- Cálculo de IMC (índice de massa corporal)
- Calculo de gasto calórico basal, que é quanto uma pessoa gasta de caloria para simplesmente sobreviver
- Cálculo de gasto calórico total, que considera a quantidade de atividades físicas que a pessoa realiza
- Recomendação de quantidade de carboidrato, proteína e gordura que a pessoa deve ingerir
1. Crie uma tela **inicial**
2. Crie a tela **IMC**

Essa tela será acessada por meio do botão IMC da tela principal e deverá aparecer sobre ela (não por trás).

Ao clicar em **Calcular**, o programa deve coletar os dados informados e realizar a operação “IMC = Peso / Altura²”. O resultado dessa operação aparecerá após o label **Resultado**. À direita do label Interpretação, deve conter um dos seguintes textos:

- “Magreza”, se o IMC for menor que 18,5
- “Normal”, se o IMC for entre 18,5 e 24,9
- “Sobrepeso”, se o IMC for entre 25 e 29,9
- “Obesidade”, se o IMC for entre 30 e 39,9
- “Obesidade grave”, se o IMC for maior ou igual a 40
3. Crie a tela **Gasto Calórico**
  
Essa tela será acessada por meio do botão Gasto Calórico da tela principal.
Ao clicar em Calcular, o programa deve, primeiro, realizar o cálculo de gasto calórico basal, que varia de acordo com o sexo da pessoa:

|Homem|Homem|
|------|-----|
|CalBasal = 66 + (13,8 * Peso) + (5 * Altura) – (6,8 * Idade)|CalBasal = 655 + (9,6 * Peso) + (1,9 * Altura) – (4,7 * Idade)|

Esse valor deve aparecer à direita do label **Gasto Basal** na tela.

Depois disso, com base no gasto de caloria basal obtido pelo cálculo anterior, deve-se calcular o gasto total, que varia de acordo com o nível de atividade física da pessoa:
|Nível de atividade|Cálculo|
|------------------|-------|
|Sedentário|calTotal = CalBasal * 1,2|
|Leve (exercício leve 1 a 3 dias/semana)|calTotal = CalBasal * 1,375|
|Moderado (exercício moderado 3 a 5 dias/semana)|calTotal = CalBasal * 1,55|
|Ativo (exercício pesado 5 a 6 dias/semana)|calTotal = CalBasal * 1,725|
|Extremamente ativo (exercício pesado diário)|calTotal = CalBasal * 1,9|

A combobox presente na tela deve oferecer as opções listadas anteriormente para “nível de atividade”.

O valor obtido pelo cálculo deve aparecer à direita do label **Gasto Total.**

**Validações:** a tela não deve “quebrar” ao informar valores inválidos; a tela deve solicitar que o usuário preencha todos os campos.

4. Crie a tela **Recomendações**
Essa tela será acessada por meio do botão **Recomendações** da tela principal.

Ao clicar em **Calcular**, o programa deve usar a quantidade de calorias informada e calcular, da seguinte maneira, a quantidade recomendada dos nutrientes:

- Carboidratos = calorias * 0,5 / 4
- Proteínas = calorias * 0,25 / 4
- Gordura = calorias * 0,25 / 9

Os resultados devem aparecer à direita dos componentes de label correspondentes e devem ser expressos em gramas (g).
