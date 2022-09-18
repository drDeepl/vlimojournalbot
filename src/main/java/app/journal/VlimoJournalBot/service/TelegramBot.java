package main.java.app.journal.VlimoJournalBot.service;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import app.journal.VlimoJournalBot.config.BotConfig;


public class TelegramBot extends TelegramLongPollingBot{
    
    BotConfig config;

    @Override
    public String getBotUsername(){
        String botName = config.botname;
        return botName;
    }

    public String getBotToken(){
        // TODO
        return null;
    }

    @Override
    public void onUpdateReceived(Update update){

    }

}
