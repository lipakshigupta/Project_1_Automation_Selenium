package Runner;


import Pages.BasePage;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.sql.Timestamp;
import java.time.Instant;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target//cucumber-reports//report.html"},
        features="src//test//resources//Feature_File//",
        glue={"Step_Defination"},

        tags = {"@vhv"},

//      publish = true,
        monochrome = true
)
public class CucumberRunner  {
    @BeforeClass
    public static void setup(){
        ExtentProperties extentProperties   = ExtentProperties.INSTANCE;
//        Timestamp instant= Timestamp.from(Instant.now());
        String filename = "Report.html";
        String path = System.getProperty("user.dir")+ File.separator+"extendReport"+File.separator+filename;
        com.aventstack.extentreports.reporter.ExtentHtmlReporter report = new ExtentHtmlReporter(path);
        extentProperties.setReportPath(path);
    }
    @Before
    public static void setup_test(){
        System.out.println("Before");
    }

    @AfterClass
    public static void tearDown(){

        BasePage.driver.close();
        BasePage.driver.quit();
   }

}
