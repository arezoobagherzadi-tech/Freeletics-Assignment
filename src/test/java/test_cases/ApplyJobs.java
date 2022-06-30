package test_cases;

import base.BaseClass;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JobsPage;
import pages.PositionDetailPage;

public class ApplyJobs extends BaseClass {

    HomePage homePage;

    public ApplyJobs(){
        homePage = new HomePage(driver);
    }

    @Test
    public void applyToQAPosition(){
        homePage.acceptCookies();
        JobsPage jobsPage = homePage.navigateToCareerPage()
                                    .navigateToJobsPage();
        PositionDetailPage qaPage = jobsPage.openPosition(jobsPage.getQAPosition());

        //Assertion for title
        Assert.assertEquals(qaPage.getPositionTitle().getText(),"QA Engineer (all genders) - Remote or Munich");
        System.out.println(qaPage.getPositionTitle().getText());
        //Assertion for Description
        Verify.verify(qaPage.getPositionDescription().isDisplayed(),"QA Description Not Found");
        System.out.println(qaPage.getPositionDescription().getText());
        //Assertion for Responsibilities section
        Verify.verify(qaPage.getPositionResponsibilities().size()==7, "QA Responsibilities Are Not 7");
        System.out.println(qaPage.getPositionResponsibilities().size());
        //Assertion for Profile section
        Assert.assertEquals(qaPage.getPositionProfile().size(),6);
        System.out.println(qaPage.getPositionProfile().size());
        qaPage.clickOnApply();
    }
}
