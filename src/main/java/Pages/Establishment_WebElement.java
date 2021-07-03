package Pages;

import org.openqa.selenium.By;

public class Establishment_WebElement {

    public By getEstName() {
        return EstName;
    }

    public By getEstAdd() {
        return EstAdd;
    }

    public By getEstYr() {
        return EstYr;
    }

    By EstName = By.name("establishment name.1");
    By EstAdd = By.name("address.1");
    By EstYr = By.name("year.1");
}
