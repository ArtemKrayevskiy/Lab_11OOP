package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode code;

    public String generateText(){
        return code.generateText(client);
    }
}
