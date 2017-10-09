package com.intellyo.java.pageobjects;

import com.intellyo.java.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.intellyo.java.constants.ResearchConstants.*;

public class ResearchPageObject {


    SeleniumUtils seleniumUtil = SeleniumUtils.getInstance();

    public void openResearchPage(){

        seleniumUtil.openWebpage(RESEARCH_URL);
    }

    public boolean isPageLoadProperly(){

        return seleniumUtil.isElementPresents(PERFORMING_XPATH)
                && seleniumUtil.isElementPresents(FACEBOOK_XPATH)
                && seleniumUtil.isElementPresents(INPUT_XPATH);
    }

    public void writeTextToSearchOnFaceBook(String searchText) {
        seleniumUtil.writeTotextBox(INPUT_XPATH, searchText);
    }

    public  boolean isSearchDropDownListAppears(){
        return seleniumUtil.isElementPresents(SEARCH_DROP_DOWN_LIST);
    }

    public void clickOnCompany(String companyName){
            seleniumUtil.clickOnElement(By.xpath("//*[contains(@class,'input-suggestion')]//*[(text()='" + companyName + "')]"));
    }
}
