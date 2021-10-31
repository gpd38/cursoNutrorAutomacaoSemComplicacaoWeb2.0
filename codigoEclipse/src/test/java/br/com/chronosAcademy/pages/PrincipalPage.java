package br.com.chronosAcademy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.chronosAcademy.maps.PrincipalMap;

public class PrincipalPage {
    private WebDriver driver;
    private PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
    }

    public void clickBotao() {

        principalMap.btnTitulo.click();

    }
}