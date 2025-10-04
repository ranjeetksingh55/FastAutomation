package tests;

import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FastAutomationPage;

import javax.sound.midi.Soundbank;
import java.time.Duration;

public class FastAutomationTest extends BaseTest {

    private FastAutomationPage fastAutomationPage;

    @BeforeMethod(alwaysRun = true)
    public void setUpPage() {
        // Initialize your page object with the active WebDriver
        fastAutomationPage = new FastAutomationPage(getDriver());
    }

    @Test(description = "Wait until speed is in green zone")
    public void fastAutomationTestWithWait() throws InterruptedException {

        while(true) {
            // Get the text for printing
            String speedValueText = fastAutomationPage.getSpeedValue();
            String speedUnitsText = fastAutomationPage.getSpeedUnits();

            // Get class attribute from the WebElement
            String className = fastAutomationPage.getSpeedValueElement().getAttribute("class");

            System.out.println("Current Speed: " + speedValueText + " " + speedUnitsText);

            if (className != null && className.contains("succeeded")){
                System.out.println("Speed is in green zone ✅");
                System.out.println("Final Speed: " + speedValueText + " " + speedUnitsText);
                break;
            }

            Thread.sleep(500); // wait to avoid CPU busy loop
        }
    }




}