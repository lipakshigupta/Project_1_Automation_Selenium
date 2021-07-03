package Pages;

import org.openqa.selenium.By;

public class KuchTohService_WebElement {

    public By getUploadDocumentPage() {
        return UploadDocumentPage;
    }

    By UploadDocumentPage = By.xpath("//*[@id=\"axiosform\"]/div/div/h5");

    public String getAvailableConsultant_script() {
        return AvailableConsultant_script;
    }

    String AvailableConsultant_script = "document.getElementsByClassName('form-check-sign')[5].click()";

    public String getLookingConsultant_script() {
        return lookingConsultant_script;
    }

    String lookingConsultant_script = "document.getElementsByClassName('form-check-sign')[6].click()";
}
