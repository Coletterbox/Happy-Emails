package com.notsparta.crss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        SendEmail sendEmail = new SendEmail();
        sendEmail.assembleMessage("Bob");
        setUp();
        GmailPage.enterEmailAddress();
        GmailPage.clickNextButton();
        GmailPage.enterPassword();
        GmailPage.clickPasswordNextButton();
        // for testing:
//        GmailPage.clickForgotPassword();
    }

    public static void setUp() {
        WebDriver webDriver = new ChromeDriver();
        new GmailPage(webDriver);
    }
}
