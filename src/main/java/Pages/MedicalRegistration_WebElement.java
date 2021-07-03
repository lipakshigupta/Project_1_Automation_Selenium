package Pages;
import org.openqa.selenium.By;

public class MedicalRegistration_WebElement {



   public By getRegNumber() {
      return RegNumber;
   }

   public By getRegCouncil() {
      return RegCouncil;
   }

   public By getRegYr() {
      return RegYr;
   }

   public By getNextBtn() {
      return NextBtn;
   }

   public By getMedicalPage() {
      return MedicalPage;
   }

   By  RegNumber = By.xpath("//*[@id=\"1\"]//input[@name=\"Registration no.1\"]");
   By  RegCouncil = By.xpath("//input[@placeholder='Registration council']");
   By RegYr = By.xpath("//*[@id=\"1\"]//input[@name=\"Registration year1\"]");
   By ErrRegNumber = By.xpath("//*[@id=\"1\"]//div[1]/div/label[2]");
//

   public By getErrRegNumber() {
      return ErrRegNumber;
   }

   public By getErrRegCouncil() {
      return ErrRegCouncil;
   }

   public By getErrRegYr() {
      return ErrRegYr;
   }

   By ErrRegCouncil = By.xpath("//*[@id=\"1\"]//div[3]/div/label[2]");
   By ErrRegYr = By.xpath("//*[@id=\"1\"]//div[4]/div/label[2]");
   public By getEduPage() {
      return EduPage;
   }

   By EduPage = By.xpath("//*[@id=\"3\"]//h5");
   By MedicalPage = By.xpath("//*[@id=\"1\"]//h5");
   By NextBtn = By.xpath("//*[@id=\"wizardProfile\"]//button[@class =\"btn btn-next btn-wd btn-info\"]");
}
