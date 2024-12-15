/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardingpal.models;

/**
 *
 * @author Jan
 */
public class Request {
    private User requester;
    private BedSpace bedspace;
    private boolean isResolved;
    private boolean isAccepted;
    private String rqstMessage;

    // Parameterized constructor
    public Request(String rqstMessage, User requester, BedSpace bedspace) {
        this.rqstMessage = rqstMessage;
        this.requester = requester;
        this.bedspace = bedspace;
        this.isResolved = false;
    }

    public String getRequestMessage(){
        return rqstMessage;
    }
    
    public void setRequestMessage(String rqstMessage){
        this.rqstMessage = rqstMessage;
    }
    
    // Getter for requester
    public User getRequester() {
        return requester;
    }

    // Setter for requester
    public void setRequester(User requester) {
        this.requester = requester;
    }

    // Getter for bedspace
    public BedSpace getBedspace() {
        return bedspace;
    }

    // Setter for bedspace
    public void setBedspace(BedSpace bedspace) {
        this.bedspace = bedspace;
    }

    // Getter for isResolved
    public boolean isResolved() {
        return isResolved;
    }

    // Setter for isResolved
    public void setResolved(boolean isResolved) {
        this.isResolved = isResolved;
    }

    // Getter for isAccepted
    public boolean isAccepted() {
        return isAccepted;
    }

    // Setter for isAccepted
    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    // toString method (optional, for debugging or logging purposes)
    @Override
    public String toString() {
        return "Request{" +
                "requester=" + requester +
                ", bedspace=" + bedspace +
                ", isResolved=" + isResolved +
                ", isAccepted=" + isAccepted +
                '}';
    }
}

