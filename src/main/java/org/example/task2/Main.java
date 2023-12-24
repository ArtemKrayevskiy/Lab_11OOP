package org.example.task2;


import com.mailjet.client.errors.MailjetException;

public class Main {
    public static void main(String[] args) throws MailjetException {
        MailSender.sendMail(new MailInfo(new Client("Artem", Gender.MALE, 18), new MerryChristmasMail()));
    }
}
