package com.oa.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Message implements Serializable {
    private Byte messageno;

    private String messagecontent;

    private String messagesender;

    private String messagetaker;

    private String messagetype;

    private static final long serialVersionUID = 1L;

    public Byte getMessageno() {
        return messageno;
    }

    public void setMessageno(Byte messageno) {
        this.messageno = messageno;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public String getMessagesender() {
        return messagesender;
    }

    public void setMessagesender(String messagesender) {
        this.messagesender = messagesender;
    }

    public String getMessagetaker() {
        return messagetaker;
    }

    public void setMessagetaker(String messagetaker) {
        this.messagetaker = messagetaker;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }
}