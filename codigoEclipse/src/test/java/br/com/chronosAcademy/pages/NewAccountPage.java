package br.com.chronosAcademy.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.NewAccountMap;

public class NewAccountPage {

    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount(){
        return newAccountMap.textCreateAccount.getText();
    }

    public void setInpUserName(String userName){
        Driver.visibilityOf(newAccountMap.inpUserName);
        newAccountMap.inpUserName.sendKeys(userName);
    }

    public void setInpEmail(String email){
        newAccountMap.inpEmail.sendKeys(email);
    }

    public void setInpPassword(String password){
        newAccountMap.inpPassword.sendKeys(password);
    }

    public void setInpConfirmPassword(String password){
        newAccountMap.getInpConfirmPassword.sendKeys(password);
    }

    public void selectCountry(String country){
        Select select = new Select(newAccountMap.slcCountry);
        Driver.aguardaOptions(select);
        select.selectByVisibleText(country);
    }

    public void clickInpIagree(){
        newAccountMap.inpIagree.click();
    }

    public void clickBtnRegister(){
        newAccountMap.btnRegister.click();
    }
}