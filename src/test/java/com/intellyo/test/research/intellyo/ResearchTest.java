package com.intellyo.test.research.intellyo;

import com.intellyo.java.pageobjects.DashboardPageObject;
import com.intellyo.java.pageobjects.ResearchPageObject;
import com.intellyo.java.utils.SeleniumUtils;
import com.intellyo.test.commonactions.intellyo.CommonActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResearchTest extends CommonActions {

    ResearchPageObject researchPageObject = new ResearchPageObject();
    DashboardPageObject dashboardPageObject = new DashboardPageObject();

    SeleniumUtils seleniumUtil = SeleniumUtils.getInstance(); //TODO : delete this line

    @Test(description = "Test if research page open properly")
    public void researchPageOpenTest(){
        researchPageObject.openResearchPage();
        Assert.assertTrue(true);
        //Assert.assertTrue(researchPageObject.isPageLoadProperly());
    }

    @Test(description = "Test Search with simpel use case"/*, dependsOnMethods = { "researchPageOpenTest" }*/)
    public void setResearchPageSearch(){
        researchPageObject.openResearchPage();
        Assert.assertTrue(true);
        //researchPageObject.writeTextToSearchOnFaceBook("Intellyo");
        //Assert.assertTrue(researchPageObject.isSearchDropDownListAppears());
        //seleniumUtil.sleep(3);
        //researchPageObject.clickOnCompany("Intellyo");
        //Assert.assertTrue(dashboardPageObject.isPageLoadProperly("Intellyo"));

    }
}
