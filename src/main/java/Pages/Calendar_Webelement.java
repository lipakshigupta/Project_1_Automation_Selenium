package Pages;

import org.openqa.selenium.By;

public class Calendar_Webelement {

    public By getCalendar() {
        return calendar;
    }

    public By getCal_month() {
        return Cal_month;
    }

    public By getCal_week() {
        return cal_week;
    }

    public By getCal_day() {
        return cal_day;
    }

    By calendar = By.xpath("//*[@id=\"__layout\"]//div[1]/h2/a");
    By Cal_month = By.xpath("//button[@class=\"fc-dayGridMonth-button fc-button fc-button-primary fc-button-active\"]");
    By cal_week = By.xpath("//button[@class=\"fc-timeGridWeek-button fc-button fc-button-primary\"]");
    By cal_day = By.xpath("//button[@class=\"fc-timeGridDay-button fc-button fc-button-primary\"]");
}
