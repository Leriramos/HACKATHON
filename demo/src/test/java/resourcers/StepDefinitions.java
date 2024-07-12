package resourcers;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDefinitions {

    private LoginPage loginPage;

    @Given("que o usuário está na página de login")
    public void que_o_usuário_está_na_página_de_login() {
        loginPage = new LoginPage();
        
    }

    @When("o usuário insere o nome de usuário {string}")
    public void o_usuário_insere_o_nome_de_usuário(String username) {
        loginPage.preencherCampoUsuario(username);
    }

    @When("o usuário deixa o campo de senha em branco")
    public void o_usuário_deixa_o_campo_de_senha_em_branco() {
        loginPage.deixarCampoSenhaEmBranco();
    }

    @When("o usuário clica no botão de login")
    public void o_usuário_clica_no_botão_de_login() {
        loginPage.clicarBotaoLogin();
    }

    @Then("O usuário deve ver a mensagem de erro {string}")
    public void o_usuario_deve_ver_a_mensagem_de_erro(String mensagemEsperada) {
        assertTrue(loginPage.verificarMensagem(mensagemEsperada));
    }
    
}
