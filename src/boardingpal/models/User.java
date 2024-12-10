package boardingpal.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String password;
    private String fullName;
    private int age;
    private LocalDate birthdate;
    private String gender;
    private String residenceStatus; // "N/A" or bedspace.location
    private String occupation;
    private String nationality;
    private String religion;
    private String about;
    private String imageUrl;
//    private BedSpace bedspace; // Can be null
//    private List<Request> pendingRequests; // Tracks incoming and outgoing requests

    // Constructor
    public User(String email, String password, String fullName, int age, LocalDate birthdate,
                String gender, String occupation, String nationality, String religion, String about, String imageUrl) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.birthdate = birthdate;
        this.gender = gender;
        this.residenceStatus = "N/A"; // Default status
        this.occupation = occupation;
        this.nationality = nationality;
        this.religion = religion;
        this.about = about;
        this.imageUrl = imageUrl;
//        this.bedspace = null; // Default is no bedspace
//        this.pendingRequests = new ArrayList<>(); // Initialize the list
    }
    
    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
//        this.bedspace = null; // Default is no bedspace
//        this.pendingRequests = new ArrayList<>(); // Initialize the list
    }

    // Getters and Setters
    public String getAbout(){
        return about;
    }    
    
    public void setAbout(String about){
        this.about = about;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    public String getImageUrl(){
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

//    public BedSpace getBedspace() {
//        return bedspace;
//    }
//
//    public void setBedspace(BedSpace bedspace) {
//        this.bedspace = bedspace;
//        this.residenceStatus = (bedspace != null) ? bedspace.getLocation() : "N/A";
//    }
//
//    public List<Request> getPendingRequests() {
//        return pendingRequests;
//    }
//
//    public void addPendingRequest(Request request) {
//        this.pendingRequests.add(request);
//    }
//
//    public void removePendingRequest(Request request) {
//        this.pendingRequests.remove(request);
//    }
}
