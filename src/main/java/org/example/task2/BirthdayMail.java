package org.example.task2;

import lombok.Getter;

@Getter
public class BirthdayMail implements MailCode{
    String Subject = "Happy Birthday";
    @Override
    public String generateText(Client client) {
        return "Happy birthday, dear" + client.getName();
    }
}
