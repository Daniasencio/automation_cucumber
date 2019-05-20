package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CadastroPage;
import support.BaseSteps;

public class CadastroPageStepsTest extends BaseSteps {

    public static CadastroPage cadastroPage = new CadastroPage(driver);

    @Given("^O usuario acessa o site$")
    public void o_usuario_acessa_o_site ( ) throws Throwable {
        cadastroPage.openPage();
    }
    @And("^clica no botao cadastrar$")
    public void clica_no_botao_cadastrar ( ) throws Throwable {
        cadastroPage.clickCadastre();
    }

    @And("^Isiro meus dados$")
    public void isiro_meus_dados ( ) throws Throwable {
        cadastroPage.inputNome();
        cadastroPage.inputEmail();
        cadastroPage.inputSenha();
//          cadastroPage.clickCaptcha();
        cadastroPage.clickTermsOfUse();

    }

    @Then("^Clico no botao cadastre-se$")
    public void clico_no_botao_cadastre_se ( ) throws Throwable {
        cadastroPage.clickEnter();
    }
////ASSERT TEXT EXAMPLES
//    @When("^O cadastro é realizado com sucesso$")
//    public void o_cadastro_é_realizado_com_sucesso (String value) throws Throwable {
//       Assert.assertEquals(value, cadastroPage.Assert());
//    }
//

}