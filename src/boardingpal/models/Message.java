/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardingpal.models;

import java.time.LocalDateTime;

/**
 *
 * @author Jan
 */
public class Message {
    private String messageText;
    private User messageAuthor;
    private LocalDateTime timestamp;

    // Constructor
    public Message(String messageText, User messageAuthor) {
        this.messageText = messageText;
        this.messageAuthor = messageAuthor;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public User getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(User messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
