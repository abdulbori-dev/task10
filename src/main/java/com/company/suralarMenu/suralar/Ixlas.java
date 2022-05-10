package com.company.suralarMenu.suralar;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class Ixlas {

    public SendMessage sendTextMessage(Message message){
        SendMessage sendMessage1 = new SendMessage();
        sendMessage1.setText("Qul huvallòhu ahad.\n" +
                "Allòhus-somad.\n" +
                "Lam yalid.\n" +
                "Va lam yúvlad va lam yakullahú\n" +
                "kufuvan ahad");
        sendMessage1.setParseMode(ParseMode.MARKDOWN);
        sendMessage1.setChatId(String.valueOf(message.getChatId()));
        return sendMessage1;
    }

    public SendAudio sendAudioMessage(Message message){
        SendAudio sendAudio = new SendAudio();
        sendAudio.setChatId(String.valueOf(message.getChatId()));
        sendAudio.setCaption("Mishary Rashid - Ixlos surasi");
        return sendAudio;
    }
}
