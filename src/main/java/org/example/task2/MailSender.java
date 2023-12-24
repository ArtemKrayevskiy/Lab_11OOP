package org.example.task2;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;

public class MailSender {
    public static void sendMail(MailInfo mail) throws MailjetException{
            ClientOptions options = ClientOptions.builder()
                    .apiKey("")
                    .apiSecretKey("")
                    .build();

            MailjetResponse response;
            MailjetClient client = new MailjetClient(options);

            MailjetRequest request = new MailjetRequest(Emailv31.resource)
                    .property(Emailv31.MESSAGES, new JSONArray()
                            .put(new JSONObject()
                                    .put(Emailv31.Message.FROM, new JSONObject()
                                            .put("Email", "kraievskyi.pn@ucu.edu.ua")
                                            .put("Name", "Artem"))
                                    .put(Emailv31.Message.TO, new JSONArray()
                                            .put(new JSONObject()
                                                    .put("Email", "kraievskyi.pn@ucu.edu.ua")
                                                    .put("Name", "Artem")))
                                    .put(Emailv31.Message.SUBJECT, mail.getCode().subject)
                                    .put(Emailv31.Message.TEXTPART, mail.getCode().generateText(mail.getClient()))
                                    .put(Emailv31.Message.HTMLPART, "")
                                    .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
            response = client.post(request);
            System.out.println(response.getStatus());
            System.out.println(response.getData());
    }
}

