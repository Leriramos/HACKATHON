# Projeto de Automação de Testes de Login

Este projeto foi desenvolvido para automatizar os testes da página de login do site "https://homero.app.br/login" durante um hackathon. Utilizamos as ferramentas Selenium e Cucumber para a implementação dos testes automatizados.

## Estrutura do Projeto

- `pages`: Contém as classes responsáveis pelas páginas do site.
  - `BasePage.java`: Classe base que inicializa o WebDriver e abre URLs.
  - `LoginPage.java`: Classe específica para a página de login.
- `resourcers`: Contém as classes de definição de passos e a classe de execução do Cucumber.
  - `StepDefinitions.java`: Classe que define os passos dos cenários de teste.
  - `RunCucumberTest.java`: Classe que configura e executa os testes do Cucumber.
- `login.feature`: Arquivo de feature do Cucumber que descreve os cenários de teste.

## Requisitos

- Java 17
- Maven
- Google Chrome
- ChromeDriver
