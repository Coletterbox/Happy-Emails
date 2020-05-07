package com.notsparta.crss;

import java.util.Random;

public class SendEmail {
    public String assembleMessage(String name) {
        String message = "";
        String[] adjectives = {"happy", "joyful", "cheerful", "fortunate", "lucky"};
        Random random = new Random();
        int i = random.nextInt(adjectives.length);
        message += name + "! This is a " + adjectives[i] + " test.";
        System.out.println(message);
        return message;
    }
    public void openNewEmailWindow() {

    }
    public void sendEmail(String emailAddress) {
        emailAddress = EmailAddressContainer.emailAddress;
    }
}
