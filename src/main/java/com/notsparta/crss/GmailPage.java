package com.notsparta.crss;

import org.openqa.selenium.WebDriver;

public class GmailPage {
    WebDriver webDriver;

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        setUp(webDriver);
        webDriver.get("https://mail.google.com/");
    }

    public void setUp(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }
}
