Feature: Realizar cadastro no site

  Background:
    Given O usuario acessa o site

  @Case1
  Scenario: O usurio deseja acessar o site e se cadastrar
    And clica no botao cadastrar
    And Isiro meus dados
    Then Clico no botao cadastre-se
    When O cadastro é realizado com sucesso

