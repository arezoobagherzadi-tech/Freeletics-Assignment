package test_cases;

import base.BaseClass;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.JobsPage;
import pages.PositionDetailPage;

public class ApplyJobs extends BaseClass {

    HomePage homePage;
    SoftAssert softAssert;
    public ApplyJobs(){
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void applyToQAPosition(){
        homePage.acceptCookies();
        JobsPage jobsPage = homePage.navigateToCareerPage()
                                    .navigateToJobsPage();
        PositionDetailPage qaPage = jobsPage.openPosition(jobsPage.getQAPosition());

        //Assertion for title
        Assert.assertEquals(qaPage.getPositionTitle().getText(),"QA Engineer (all genders) - Remote or Munich");
        System.out.println(qaPage.getPositionTitle().getText());
        //Assertion for Description
        softAssert.assertTrue(qaPage.getPositionDescription().isDisplayed(),"QA Description Not Found");
        System.out.println(qaPage.getPositionDescription().getText());
        //Assertion for Responsibilities section
        softAssert.assertEquals(qaPage.getPositionResponsibilities().size(),7);
        System.out.println(qaPage.getPositionResponsibilities().size());
        //Assertion for Profile section
        Assert.assertEquals(qaPage.getPositionProfile().size(),6);
        System.out.println(qaPage.getPositionProfile().size());
        qaPage.clickOnApply();

        softAssert.assertAll();
    }
}
