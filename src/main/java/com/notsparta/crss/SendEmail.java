package com.notsparta.crss;

import java.util.Random;

public class SendEmail {
    public String assembleMessage(String name) {
        String message = "";
        String[] greetings = {"greetings", "hello", "hi", "hey"};
        String[] adjectives = {"happy", "joyful", "cheerful", "fortunate", "lucky"};
        String[] timePeriod = {"day", "week", "month", "year"};
        String[] goals = {"motivate yourself", "get inspired", "cheer up", "feel better", "stop crying", "fix your sleeping pattern", "repair your ruined relationships"};
        String[] transitiveVerbs = {"write", "lend", "bake", "play", "buy", "donate", "read", "send", "teach", "get", "make", "take", "steal", "eat", "punch"};
        String[] nouns = {"cat", "child", "book", "cake", "truck", "car", "bed", "pillow", "sock", "pineapple"};
        Random random = new Random();
        int adjectivesIndex = random.nextInt(adjectives.length);
        int greetingsIndex = random.nextInt(greetings.length);
        int timePeriodIndex = random.nextInt(timePeriod.length);
        int goalsIndex = random.nextInt(goals.length);
        int nounsIndex = random.nextInt(nouns.length);
        int transitiveVerbsIndex = random.nextInt(transitiveVerbs.length);
        String greeting = greetings[greetingsIndex].substring(0, 1).toUpperCase() + greetings[greetingsIndex].substring(1, greetings[greetingsIndex].length()).toLowerCase() + ", " + name + "!";
        String openingSentence = "I hope you are having a " + adjectives[adjectivesIndex] + " " + timePeriod[timePeriodIndex] + ".";
        String content = "";
        message += greeting + "\n\n" + openingSentence + "\n\nTo " + goals[goalsIndex] + ", " + transitiveVerbs[transitiveVerbsIndex] + " a " + nouns[nounsIndex] + "!";
        System.out.println(message);
        return message;
    }
    public void openNewEmailWindow() {

    }
    public void sendEmail(String emailAddress, int numberOfEmails) {
        emailAddress = EmailAddressContainer.emailAddress;
    }
}
