Feature: Realizar pesquisa no site

  Background:
    Given O usuario acessa o site sexyHOT

  @Case2
  Scenario: O usurio deseja acessar o site e realizar uma busca
    Then e insere alguma palavra na barra de busca
    And Clico no botao buscar
#    When a busca é realizada com sucesso