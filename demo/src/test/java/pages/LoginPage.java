package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage() {
        // Initialize the driver
        initializeDriver();
        // Open the login page
        openUrl("https://homero.app.br/login");
    }

    public void preencherCampoUsuario(String usuario){
        System.out.println("Preenchendo campo de usuário.");
        driver.findElement(By.id("username-input")).sendKeys(usuario);
    }

    public void deixarCampoSenhaEmBranco(){
        driver.findElement(By.id("password-input")).clear();
    }

    public void clicarBotaoLogin() {
        driver.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button")).click();
    }

    public boolean verificarMensagem(String mensagemEsperada) {
        String mensagemErro = driver.findElement(By.id("error-msg")).getText();
        return mensagemErro.contains(mensagemEsperada);
    }
    
}
