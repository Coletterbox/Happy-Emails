package com.notsparta.crss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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

    public static void wait(WebDriver webDriver) {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void enterTextIntoBox(WebDriver webDriver, String text, String boxID) {
        webDriver.findElement(By.id(boxID)).sendKeys(text);
    }

    public static void enterTextIntoBoxByName(WebDriver webDriver, String text, String boxName) {
        webDriver.findElement(By.name(boxName)).sendKeys(text);
    }

    public static void enterTextIntoBoxByClass(WebDriver webDriver, String text, String boxClass) {
        webDriver.findElement(By.className(boxClass)).sendKeys(text);
    }

    public static void enterTextIntoBoxByXpath(WebDriver webDriver, String text, String xpath) {
        webDriver.findElement(By.className(xpath)).sendKeys(text);
    }

    public static void enterEmailAddress() {
        enterTextIntoBox(webDriver, EmailAddressContainer.emailAddress, "identifierId");
    }

    public static void clickButton(WebDriver webDriver, String buttonID) {
        webDriver.findElement(By.id(buttonID)).click();
    }

    public static void clickNextButton() {
        clickButton(webDriver, "identifierNext");
        wait(webDriver);
    }

    public static void clickForgotPassword() {
        GmailPage.clickButton(webDriver, "forgotPassword");
    }

    public static void enterPassword() {
        enterTextIntoBox(webDriver, EmailAddressContainer.password, "password");
    }

//    public static void enterPassword() {
//        enterTextIntoBoxByName(webDriver, EmailAddressContainer.password, "password");
//    }

//    public static void enterPassword() {
//        enterTextIntoBoxByClass(webDriver, EmailAddressContainer.password, "whsOnd zHQkBf");
//    }

//    public static void enterPassword() {
//        enterTextIntoBoxByXpath(webDriver, EmailAddressContainer.password, "//span[@class='whsOnd zHQkBf']");
//    }

    public static void clickPasswordNextButton() {
        clickButton(webDriver, "passwordNext");
    }
}
