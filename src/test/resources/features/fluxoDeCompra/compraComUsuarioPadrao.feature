#language: pt

@standard_user
Funcionalidade: Fluxo de compra com usuario padrao

  Cenario: Login com sucesso
    Dado Eu estou na pagina de Login
    Quando Preencho dados pardao do usuario validos nos campos de login
    Entao Clico no botão de login

  Cenario: Escolher um produto e validar quantidade dos itens
    Dado Sou redirecionado para tela dos produtos
    Quando Valido o nome do item
    Entao Seleciono um item
    E Valido quantidade o item no icone do carrinho
    Entao Clico o icone do carrinho para redirecionar na tela do carrinho

  Cenario: Validar o item ao carrinho por quantidade, nome e valor
    Dado Sou redirecionado para tela de Seu Carrinho
    Quando Valido quantidade do item no carrinho
    E Valido o nome do item no carrinho
    E Valido o valor do item no carrinho
    Entao Clico o botao checkout

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
    E Verifico a mensagem de finalizar a compra
    E Clico o icone tres listras no topo
    Entao Clico no logout para sair da conta