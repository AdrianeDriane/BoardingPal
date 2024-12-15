/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardingpal.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jan
 */
public class Conversation {
    private User inquirer;
    private User bedspaceOwner;
    private List<Message> messages;
    private List<User> members;
    private String title;
    private String chat_id;

    // Constructor
    public Conversation(User inquirer, User bedspaceOwner, String title, String chat_id) {
        this.inquirer = inquirer;
        this.bedspaceOwner = bedspaceOwner;
        this.title = title;
        this.chat_id = chat_id;
        this.messages = new ArrayList<>();
        this.members = new ArrayList<>();
        // Adding initial members
        this.members.add(inquirer);
        this.members.add(bedspaceOwner);
    }

    // Getters and Setters
    public User getInquirer() {
        return inquirer;
    }

    public void setInquirer(User inquirer) {
        this.inquirer = inquirer;
    }

    public User getBedspaceOwner() {
        return bedspaceOwner;
    }

    public void setBedspaceOwner(User bedspaceOwner) {
        this.bedspaceOwner = bedspaceOwner;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public List<User> getMembers() {
        return members;
    }

    public void addMember(User user) {
        if (!this.members.contains(user)) {
            this.members.add(user);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }
    
}