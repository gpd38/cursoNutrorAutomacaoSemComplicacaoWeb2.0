package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.MyAccountMap;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccountMap myAccountMap;

    public MyAccountPage() {
        myAccountMap = new MyAccountMap();
        PageFactory.initElements(Driver.getDriver(), myAccountMap);
    }

    public void clickLinkUser() {
        myAccountMap.linkUser.click();

    }

    public void clickLinkMyAccount() {
        Driver.visibilityOf(myAccountMap.linkMyAccount);
        myAccountMap.linkMyAccount.click();
    }

    public void clickLinkEdit() {
        Driver.visibilityOf(myAccountMap.linkEdit);
        myAccountMap.linkEdit.click();
    }

    public String getTextUsuario() {
        Driver.visibilityOf(myAccountMap.textUsuario);
        return myAccountMap.textUsuario.getText();
    }

    public void clickBtnDelete() {
        Driver.visibilityOf(myAccountMap.btnDelete);
        myAccountMap.btnDelete.click();
    }

    public void clickBtnYes() {
        Driver.visibilityOf(myAccountMap.btnYes);
        myAccountMap.btnYes.click();
    }

    public String getTextDelete() {
        Driver.visibilityOf(myAccountMap.textDelete);
        return myAccountMap.textDelete.getText();
    }

}
