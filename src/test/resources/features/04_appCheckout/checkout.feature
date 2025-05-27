#language: pt

Funcionalidade: Checkout informacao e verificar geral

  Cenario: Informacao dados do Usuario e verificar no checkout
    Dado Sou redirecionado para tela de Checkout: Information
    Quando Preencho os dados validos nos campos de Checkout
    E Clico o botao continue
    Entao Sou redirecionado para tela de Checkout: Overview
    E Verifico quantidade do item
    E Verifico o nome do item
    E Verifico o valor do item
    E Verifico valor do taxa
    E Verifico valor final
    Quando Clico no finish para realizar a compra
    Entao Encerro a sessão