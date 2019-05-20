package pages;

import org.junit.After;
import org.junit.Before;
import steps.Hooks;
import support.DriverQA;

public class CadastroPage extends Hooks {

    @Before
    public void beforeScenario ( ) {

    }

    @After

    public void depoisDoTeste ( ) {
        driver.quit();

    }

    public void openPage ( ) {
        String url = "https://login.globo.com/login/6284?signup_no_blank=true&url=https%3A%2F%2Fgsatmulti.globo.com%2Fcore%2Flogin%2F%3Fredirect_uri%3Dhttps%253A%252F%252Fsexyhot.globo.com%252Fvod%252Fauth%252Fclient-side%252F%26duid%3D%26client_id%3D5347d0cf-683c-43bd-82a4-b8d99414a1ea";
        driver.openURL(url);
    }

    public DriverQA driver;

    public CadastroPage (DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void inputNome ( ) throws InterruptedException {
        driver.sendKeys("testes", "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]", "xpath");
        Thread.sleep(2000);

    }

    public void inputEmail ( ) throws InterruptedException {
        driver.sendKeys("Teste@mailinator.com", "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/input[1]", "xpath");
        Thread.sleep(2000);
    }

    public void inputSenha ( ) throws InterruptedException {
        driver.sendKeys("12345", "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/div[1]/input[1]", "xpath");
        Thread.sleep(2000);
    }

    public void clickCadastre ( ) throws InterruptedException {
        driver.click("/html/body/div[1]/main/div[3]/div/div/div[2]/div[2]/welcome-link/div/a", "xpath");
        Thread.sleep(2000);

    }

    public void clickTermsOfUse ( ) throws InterruptedException {
        driver.click("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]", "xpath");
        Thread.sleep(2000);

    }

    public void clickCaptcha ( ) throws InterruptedException {
        driver.click("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]", "xpath");
        Thread.sleep(2000);

    }

    public void clickEnter ( ) throws InterruptedException {
        driver.click("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]", "xpath");
        Thread.sleep(2000);
    }

//ASSERT TEXT
    public String Assert ( ) throws InterruptedException {
       return driver.getText("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]", "xpath");


    }

}



