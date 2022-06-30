package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;
import java.util.List;

public class PositionDetailPage {

    WebDriver driver;

    public PositionDetailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://jobs.lever.co/freeletics/5e25d867-b427-4e54-9ee1-c8318d6be1a1/apply']")
    WebElement applyButton;

    @FindBy(css = "body:nth-child(2) div:nth-child(2) article:nth-child(1) section.rQOqDqdkjQL4 > div.UZGg709deEYo")
    WebElement applySection;

    @FindBy(css = "article:nth-child(1) section.bCpRznl97T0q section.EEkhEVDedwE3:nth-child(2) div.ii3pF9L5WGDO > h1.ayC_azzpI9KY.TutZ5JVTzsxW.JyRf_chMfczg:nth-child(2)")
    WebElement positionTitle;

    @FindBy(css = "section.bCpRznl97T0q section.PlZUPMsaiw3T:nth-child(3) div.ii3pF9L5WGDO section.Sjm8qANQImeN:nth-child(1) > div:nth-child(3)")
    WebElement positionDescription;

    @FindAll({@FindBy(xpath = "//section[@itemprop='responsibilities']/ul/li")})
    List<WebElement> positionResponsibilities;

    @FindAll({@FindBy(xpath = "//section[@itemprop= 'experienceRequirements']/ul/li")})
    List<WebElement> positionProfile;

    public void clickOnApply(){
        Utils.scrollToView(applySection);
        applyButton.click();
    }

    public List<WebElement> getPositionProfile() {
        return positionProfile;
    }

    public WebElement getPositionTitle() {
        return positionTitle;
    }

    public WebElement getPositionDescription() {
        return positionDescription;
    }

    public List<WebElement> getPositionResponsibilities() {
        return positionResponsibilities;
    }
}
