package com.intellyo.java.constants;

import org.openqa.selenium.By;

public class ResearchConstants {
    public static final String RESEARCH_URL = "http://www.google.com";
    //public static final String RESEARCH_URL = "https://research.constants.com/";
    public static final By PERFORMING_XPATH = By.xpath("//*[@class='hero-heading'][contains(text(),'Do You Know How You')]");
    public static final By FACEBOOK_XPATH = By.xpath("//*[@class='dropdown-trigger']//*[contains(text(),'facebook.com/')]");
    public static final By INPUT_XPATH = By.xpath("//*[@id='social-competitor-search-input']");
    public static final By SEARCH_DROP_DOWN_LIST = By.xpath("//*[@id='react-autowhatever-1'][contains(@class, 'open')]");
}
