package pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import steps.Hooks;
import support.DriverQA;

public class PesquisaPage extends Hooks {

    @Before
    public void beforeScenario ( ) {

    }

    @After

    public void depoisDoTeste ( ) {
        driver.quit();

    }

    public void openPage ( ) {
        String url = "https://sexyhot.globo.com/";
        driver.openURL(url);
    }

    public DriverQA driver;

    public PesquisaPage (DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void inputPesquisa ( ) throws InterruptedException {
        driver.sendKeys("testes", "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]", "xpath");
        Thread.sleep(2000);

    }


public void clickPesquisa ( ) throws InterruptedException {
    driver.click("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/*", "xpath");
    Thread.sleep(2000);
}

public void clickSim( ) throws InterruptedException {
    driver.click("/html/body/div[1]/div/div/div/div/div/a[2]", "xpath");
    Thread.sleep(2000);
}
        public String assertPesquisa( ) throws InterruptedException {return driver.getText("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]","xpath");

}

}

