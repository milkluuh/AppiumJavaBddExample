#language: pt

  Funcionalidade: Calcula Frete

    Eu como usuário do app dos correios
    Desejo saber o frete
    Para poder ter ciencia sobre o valor

    Cenário: Calcula Frete
      Dado que o usuario abre o app dos correios
      E clica no botao novo calculo
      E digita o cep no campo cep de origem
      E digita o cep no campo cep de destino
      Quando clica no botao proximo passo
      Entao o App exibe a tela de calculos salvos