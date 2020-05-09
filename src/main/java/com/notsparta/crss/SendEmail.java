package com.notsparta.crss;

import java.util.Random;

public class SendEmail {
    public String assembleMessage(String name) {
        String message = "";
        String[] greetings = {"greetings", "hello", "hi", "hey"};
        String[] adjectives = {"happy", "joyful", "cheerful", "fortunate", "lucky"};
        String[] timePeriod = {"day", "week", "month", "year"};
        Random random = new Random();
        int adjectivesIndex = random.nextInt(adjectives.length);
        int greetingsIndex = random.nextInt(greetings.length);
        int timePeriodIndex = random.nextInt(timePeriod.length);
        String greeting = greetings[greetingsIndex].substring(0, 1).toUpperCase() + greetings[greetingsIndex].substring(1, greetings[greetingsIndex].length()).toLowerCase() + ", " + name + "!";
        String openingSentence = "I hope you are having a " + adjectives[adjectivesIndex] + " " + timePeriod[timePeriodIndex] + ".";
        message += greeting + "\n\n" + openingSentence;
        System.out.println(message);
        return message;
    }
    public void openNewEmailWindow() {

    }
    public void sendEmail(String emailAddress, int numberOfEmails) {
        emailAddress = EmailAddressContainer.emailAddress;
    }
}
