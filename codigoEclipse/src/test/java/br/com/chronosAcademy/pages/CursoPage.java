package br.com.chronosAcademy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.chronosAcademy.maps.CursoMap;

public class CursoPage {
    private final WebDriver driver;
    private final CursoMap cursoMap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String getTitulo2() {

        return cursoMap.h2Titulo.getText();
    }
}