Feature: Login

  Scenario: Login com senha em branco
    Given que o usuário está na página de login
    When o usuário insere o nome de usuário "usuario_teste"
    And o usuário deixa o campo de senha em branco
    And o usuário clica no botão de login
    Then o usuário deve ver a mensagem de erro "Esse campo é obrigatório"