package com.intellyo.test.commonactions.intellyo;

import com.intellyo.java.utils.SeleniumUtils;
import org.testng.annotations.AfterMethod;

public abstract class CommonActions {

    @AfterMethod(alwaysRun = true)
    public void afterActions(){
        SeleniumUtils intellyoUtils = SeleniumUtils.getInstance();
        intellyoUtils.closeWebDriver();
    }
}
