package com.oa.entity;

/**
 * Created by LHD on 2017/6/2.
 */
//
public class Message {
    private int messageNo;     //消息编号
    private String messageContent;    //消息内容
    private String messageSender;   //消息发送者
    private String messageTaker;     //消息接收者，如果是部门消息此处可为空
    private messageType type;
    private enum messageType{
        部门 , 个人
    }

    public int getMessageNo() {
        return messageNo;
    }

    public void setMessageNo(int messageNo) {
        this.messageNo = messageNo;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }

    public String getMessageTaker() {
        return messageTaker;
    }

    public void setMessageTaker(String messageTaker) {
        this.messageTaker = messageTaker;
    }

    public messageType getType() {
        return type;
    }

    public void setType(messageType type) {
        this.type = type;
    }
}
