package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void iniciaNavegador(){
        new Driver("chrome");
    }

    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFechaModal();
    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() {

    }

    @Quando("for realizado um clique icone de fechar da modal")
    public void forRealizadoUmCliqueIconeDeFecharDaModal() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique em Create New Account")
    public void forRealizadoUmCliqueEmCreateNewAccount(Map<String,String>map) {
        String userName = map.get("usuario");
        String password = map.get("senha");
        boolean remeber = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(userName);
        loginPage.setInpPassword(password);
        if(remeber){
            loginPage.clickInpRemember();
        }

    }

    @Entao("a pagina Create Account deve ser exibida")
    public void aPaginaCreateAccountDeveSerExibida() {

    }


    @Quando("os campos de login forem preenchidos com os valores")
    public void osCamposDeLoginForemPreenchidosComOsValores() {
        
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {
        
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}