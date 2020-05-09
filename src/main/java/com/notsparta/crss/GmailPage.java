package com.notsparta.crss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage {
    static WebDriver webDriver;

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        setUp(webDriver);
        // currently works when logged in
        webDriver.get("https://mail.google.com/");
    }

    public void setUp(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    public static void enterTextIntoBox(WebDriver webDriver, String text, String boxID) {
        webDriver.findElement(By.id(boxID)).sendKeys(text);
    }

    public static void enterEmailAddress() {
        enterTextIntoBox(webDriver, EmailAddressContainer.emailAddress, "identifierId");
    }
}
