package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CorporatePage {

    WebDriver driver;

    public CorporatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "article:nth-child(1) section.M0vq7QNpVsXd:nth-child(2) section.dkcsjMEi9ytc div.tpskdRwmR6nV > a.AisLsJaE_AWn.xK8HVPyWXV90.eG_BJQQLdVcX")
    WebElement jobsButton;

    public JobsPage navigateToJobsPage(){
        Utils.waitForClick(jobsButton);
        jobsButton.click();
        return new JobsPage(driver);
    }
}
