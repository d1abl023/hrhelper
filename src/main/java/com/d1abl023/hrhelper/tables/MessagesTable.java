package com.d1abl023.hrhelper.tables;

import com.d1abl023.hrhelper.interfaces.IDBTable;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class MessagesTable implements IDBTable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dialogId")
    private long dialogId;

    @Column(name = "sender")
    private long senderId;

    @Column(name = "receiver")
    private long receiverId;

    @Column(name = "msg")
    private String text;

    @Column(name = "timestamp")
    private long timestamp;

    public MessagesTable() {
    }

    public MessagesTable(long dialogId, long senderId, long receiverId, String text, long timestamp) {
        this.dialogId = dialogId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.text = text;
        this.timestamp = timestamp;
    }

    public MessagesTable(long id, long dialogId, long senderId, long receiverId, String text, long timestamp) {
        this.id = id;
        this.dialogId = dialogId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.text = text;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDialogId() {
        return dialogId;
    }

    public void setDialogId(long dialogId) {
        this.dialogId = dialogId;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "id=" + id +
                ", dialogId=" + dialogId +
                ", sender=" + senderId +
                ", receiver=" + receiverId +
                ", text='" + text + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
