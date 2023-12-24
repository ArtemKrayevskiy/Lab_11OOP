package org.example.task2;

import lombok.Getter;

@Getter
public class NewYearMail implements  MailCode{
    String subject = "Happy New Year";
    @Override
    public String generateText(Client client) {
        return "Happy New Year, dear" + client.getName();

    }
}
