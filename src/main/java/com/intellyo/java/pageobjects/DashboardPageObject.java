package com.intellyo.java.pageobjects;

import com.intellyo.java.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.intellyo.java.constants.DashBoardConstants.*;

public class DashboardPageObject {

    SeleniumUtils seleniumUtil = SeleniumUtils.getInstance();

    public boolean isPageLoadProperly(String... faceBookBookPageNames){

        boolean companyBooleanValue = true;
        for (String comapany:faceBookBookPageNames) {

            if(!seleniumUtil.isElementPresents(By.xpath("//*[@class='tagsinput-tag-info-title']//*[contains(text(),'" + comapany + "')]"))){
                companyBooleanValue = false;
            }

        }
        return companyBooleanValue  && seleniumUtil.isElementPresents(LOGO_XPATH);
    }
}
