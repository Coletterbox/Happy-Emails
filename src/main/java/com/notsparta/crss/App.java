package com.notsparta.crss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        SendEmail sendEmail = new SendEmail();
        sendEmail.assembleMessage("Bob");
        setup();
        GmailPage.enterEmailAddress();
        GmailPage.clickNextButton();
    }

    public static void setup() {
        WebDriver webDriver = new ChromeDriver();
        new GmailPage(webDriver);
    }
}
