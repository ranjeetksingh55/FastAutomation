package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FastAutomationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public FastAutomationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "speed-value")
    private WebElement speedValue;

    @FindBy(id = "speed-units")
    private WebElement speedUnits;

    // 🔹 Helper method
    private void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // ✅ Actions
    public String getSpeedValue() {
        waitForVisibility(speedValue);
        return speedValue.getText();
    }

    public String getSpeedUnits() {
        waitForVisibility(speedUnits);
        return speedUnits.getText();
    }
    public WebElement getSpeedValueElement() {
        waitForVisibility(speedValue);
        return speedValue;
    }
}


