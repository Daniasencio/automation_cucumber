package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CadastroPage;
import pages.PesquisaPage;
import support.BaseSteps;

public class PesquisaPageStepsTest extends BaseSteps {

    public static PesquisaPage pesquisaPage = new PesquisaPage(driver);

    @Given("^O usuario acessa o site sexyHOT$")
    public void o_usuario_acessa_o_site_sexyHOT ( ) throws Throwable {
        pesquisaPage.openPage();

    }

    @Then("^e insere alguma palavra na barra de busca$")
    public void e_insere_alguma_palavra_na_barra_de_busca ( ) throws Throwable {
        pesquisaPage.clickSim();
        pesquisaPage.inputPesquisa();
    }

    @And("^Clico no botao buscar$")
    public void clico_no_botao_buscar ( ) throws Throwable {
        pesquisaPage.clickPesquisa();
    }
//
//    @When("^a busca é realizada com sucesso$")
//    public void a_busca_é_realizada_com_sucesso (String value ) throws Throwable {
//        Assert.assertEquals(value, pesquisaPage.assertPesquisa());
//
//    }


}