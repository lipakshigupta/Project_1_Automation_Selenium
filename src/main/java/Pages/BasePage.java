package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {

    //Declare the WebDriver
    public static WebDriver driver;


    //constructor of base class
    public BasePage() {

            //Set the path for chromedriver
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
            String filePath = System.getProperty("user.dir");

            System.setProperty("webdriver.chrome.driver",
                    BasePage.class.getClassLoader().getResource("chromedriver_win32//chromedriver.exe").getPath());
//                "C://Kuch_Toh_Automation//src//test//resources//chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();

            //go to application
//            driver.get("http://localhost:42000/auth/register");
        driver.get("http://localhost:42000/auth/login");
            driver.manage().window().maximize();


//        }
    }

    public static void deadWait(long waittime) {
        try{
            Thread.sleep(waittime);
        }catch (InterruptedException e) {
        }

        }

}