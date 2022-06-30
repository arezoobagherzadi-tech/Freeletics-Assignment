package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {

    WebDriver driver;

    public JobsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'QA Engineer (all genders) - Remote or Munich')]")
    WebElement QAPosition;

    @FindBy(xpath = "//a[contains(text(),'Frontend Developer - React.js (all genders) - Remote or Munich')]")
    WebElement frontEndPosition;

    //Dynamically opens job positions detail page
    public PositionDetailPage openPosition(WebElement position){
        position.click();
        return new PositionDetailPage(driver);
    }

    public WebElement getQAPosition() {
        return QAPosition;
    }

    public WebElement getFrontEndPosition() {
        return frontEndPosition;
    }
}
