package app.chat.com.chatapp;

import java.util.Date;

/**
 * Created by X450 on 9/12/2017.
 */
public class ChatMessage {
    private String messageText;
    private String messageUser;
    private long messageTime;
    private boolean isUser;

    public ChatMessage(String messageText, String messageUser, boolean isUser){
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.isUser = isUser;

        messageTime = new Date().getTime();

    }

    public ChatMessage(){

    }

    public String getMessageText(){
        return messageText;
    }

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    public String getMessageUser(){
        return messageUser;
    }

    public void setMessageUser(String messageUser){
        this.messageUser = messageUser;
    }

    public long getMessageTime(){
        return messageTime;
    }

    public void setMessageTime(long messageTime){
        this.messageTime = messageTime;
    }

    public boolean getIsUser(){
        return this.isUser;
    }

    public void setIsUser(boolean isUser){
        this.isUser = isUser;
    }
}
