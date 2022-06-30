package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "article.N0R5C8YImKSv footer.MXtus134DS2w div.cwo71fTlfXBx ul.qEilawsX5omV li:nth-child(2) ul.ljBmczspopnO li:nth-child(1) a:nth-child(1) > span:nth-child(1)")
    WebElement careersFooter;

    @FindBy(xpath = "//*[@class='AisLsJaE_AWn C2vDPvrShYYx xK8HVPyWXV90 cdc4_xoyu5lt']")
    WebElement acceptCookieButton;

    public CorporatePage navigateToCareerPage(){
        Utils.scrollToView(careersFooter);
        careersFooter.click();
        return new CorporatePage(driver);
    }

    public void acceptCookies(){
        acceptCookieButton.click();
    }
}
