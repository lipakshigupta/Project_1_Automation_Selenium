package Pages;

import org.openqa.selenium.By;

public class BookNow_WebElement {

    public By getBookNow() {
        return BookNow;
    }

    public By getYourEst() {
        return YourEst;
    }

    public By getSpec() {
        return Spec;
    }

    public By getService() {
        return Service;
    }

    public By getSearchBtn() {
        return searchBtn;
    }

    By BookNow = By.xpath("//*[@id=\"__layout\"]//div[2]/h2/a");
    By YourEst = By.xpath("//*[@id=\"__layout\"]//div[5]/div[1]/div/div[1]//div[1]/input");
    By Spec = By.xpath("//*[@id=\"__layout\"]/div/div[5]/div[1]/div/div[2]/div[1]/div/div/div/div[1]/input");
    By Service = By.xpath("//*[@id=\"__layout\"]/div/div[5]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/input");
    By searchBtn = By.xpath("//button[@class=\"btn btn-next btn-wd btn-info\"]");
    By YourEstText = By.xpath("/html/body/div[3]/div[1]/div[2]");
    By specText = By.xpath("//*[@class='el-scrollbar__view el-select-dropdown__list']/li[@class=\"el-select-dropdown__item select-info\"][1]/span[1]");
    By serviceText = By.xpath("//*[@class='el-scrollbar__view el-select-dropdown__list']/li[@class='el-select-dropdown__item select-info hover']/span[1]");

    public By getYourEstErr() {
        return YourEstErr;
    }

    public By getServiceErr() {
        return ServiceErr;
    }

    public By getSpecErr() {
        return SpecErr;
    }

    By YourEstErr = By.xpath("//div[1]/div[2]/div[1]/label[@class=\"error\"]");
//    The establishment field is required
    By ServiceErr = By.xpath("//div[2]/div[2]/div[1]/label[@class=\"error\"]");
//    The service field is required
    By SpecErr = By.xpath("//div[1]/div/label");
//    The specialization field is required

    public By getYourEstText() {
        return YourEstText;
    }

    public By getSpecText() {
        return specText;
    }

    public By getServiceText() {
        return serviceText;
    }

    public By getSearchData() {
        return SearchData;
    }

    public By getMoreDetailsBtn() {
        return MoreDetailsBtn;
    }

    public By getBookingTimeInput() {
        return BookingTimeInput;
    }

    public By getBookConsult() {
        return BookConsult;
    }

    By SearchData = By.xpath("//*[@id=\"card\"]/div/p[1]");
    By MoreDetailsBtn = By.xpath("//*[@id=\"card\"]/div/div/button");
    By BookingTimeInput = By.xpath("/html/body//div/div/div/div/div[3]/div/input");
    By BookConsult = By.xpath("/html/body//div[4]/button[2]");
//    /html/body/div[8]/div/div/div/div/div[4]/button[2]
}
