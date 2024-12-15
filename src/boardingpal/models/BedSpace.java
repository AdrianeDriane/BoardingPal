package boardingpal.models;

import java.util.ArrayList;
import java.util.List;

public class BedSpace {
    private float monthlyFee;
    private float sizePerSqm;
    private boolean isAirconditioned;
    private int occupants;
    private List<User> roommates;
    private User isOwnedBy;
    private String bedspaceName;
    private String id;
    private String address;
    private boolean isBiddingOpen;

    // Constructor
    public BedSpace(float monthlyFee, float sizePerSqm, boolean isAirconditioned, int occupants, 
                    List<User> roommates, User isOwnedBy, String bedspaceName, String id, 
                    String address, boolean isBiddingOpen) {
        this.monthlyFee = monthlyFee;
        this.sizePerSqm = sizePerSqm;
        this.isAirconditioned = isAirconditioned;
        this.occupants = occupants;
        this.roommates = new ArrayList<>(roommates);
        this.isOwnedBy = isOwnedBy;
        this.bedspaceName = bedspaceName;
        this.id = id;
        this.address = address;
        this.isBiddingOpen = isBiddingOpen;
    }

    // Getters and Setters
    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public float getSizePerSqm() {
        return sizePerSqm;
    }

    public void setSizePerSqm(float sizePerSqm) {
        this.sizePerSqm = sizePerSqm;
    }

    public boolean isAirconditioned() {
        return isAirconditioned;
    }

    public void setAirconditioned(boolean isAirconditioned) {
        this.isAirconditioned = isAirconditioned;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public List<User> getRoommates() {
        return roommates;
    }

    public void setRoommates(List<User> roommates) {
        this.roommates = roommates;
    }
    
    public void addRoommates(User roommate){
        this.roommates.add(roommate);
    }

    public User getIsOwnedBy() {
        return isOwnedBy;
    }

    public void setIsOwnedBy(User isOwnedBy) {
        this.isOwnedBy = isOwnedBy;
    }

    public String getBedspaceName() {
        return bedspaceName;
    }

    public void setBedspaceName(String bedspaceName) {
        this.bedspaceName = bedspaceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isBiddingOpen() {
        return isBiddingOpen;
    }

    public void setBiddingOpen(boolean isBiddingOpen) {
        this.isBiddingOpen = isBiddingOpen;
    }
}

