package com.notsparta.crss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SendEmail sendEmail = new SendEmail();
        sendEmail.assembleMessage("Bob");
    }
}
