package org.example.task2;

import lombok.Getter;

@Getter
public class MerryChristmasMail implements MailCode{

    @Override
    public String generateText(Client client) {
        String subject = "Marry Christmas";
        return  "Dear " + client.getName() + ", Marry Christmas";
    }
}
