package PageObjBdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static PageObjBdd.Utils.LongTimeStamp;

public class Hooks extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    //   static  String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(Date());

    @Before//run before every method
    public void openBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get("http://demo.nopcommerce.com/");
    }

    @After //run after every method //ITestResult result

    public void closeBrowser(Scenario scenario) throws IOException {
        if (scenario.isFaild()) {
            try {

                TakesScreenshot ts = (TakesScreenshot) driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File("ScreenShots\\" + scenario.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot" + e.getMessage());
            }
        }

//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//Capture screen
//
//                FileUtils.copyFile(ts, new File("ScreenShots\\" + result.getName() + LongTimeStamp() + ".png"));//Store Screenshot to a file.
//
//
//                System.out.println("Screenshot taken");
//
//            } catch (Exception e) {
//
//            }
        //  driver.quit();
        // }
    }
}

