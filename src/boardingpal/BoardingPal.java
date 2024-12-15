/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boardingpal;

import boardingpal.models.BedSpace;
import boardingpal.models.Conversation;
import boardingpal.models.User;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BoardingPal {
    public static List<User> users = new ArrayList<>();
    public static List<BedSpace> bedspaces = new ArrayList<>();
    public static List<Conversation> conversations = new ArrayList<>();
    
    public static User loggedInUser = null;
   
    public static BoardingPal boardingPal = new BoardingPal();
    
    public BoardingPal() {
        users.add(new User(
            "john.doe@gmail.com", //email
            "password123", //password
            "John Doe", //fullName
            25, //age
            LocalDate.of(1998, 4, 12), //birthdate
            "Male", //gender
            "Data Analyst", //occupation
            "American", //nationality
            "Atheism", //religion
            "I enjoy hiking and solving puzzles.", //about
            "JohnDoe" //image url
        ));

        users.add(new User(
            "jane.smith@yahoo.com", //email
            "securepass", //password
            "Jane Smith", //fullName
            30, //age
            LocalDate.of(1993, 1, 20), //birthdate
            "Female", //gender
            "Graphic Designer", //occupation
            "Canadian", //nationality
            "Agnostic", //religion
            "Passionate about art and coffee.", //about
            "JaneSmith" //image url
        ));

        users.add(new User(
            "mike.wilson@outlook.com", //email
            "wilson2023", //password
            "Mike Wilson", //fullName
            28, //age
            LocalDate.of(1995, 7, 5), //birthdate
            "Male", //gender
            "Web Developer", //occupation
            "Australian", //nationality
            "Hinduism", //religion
            "I’m a fitness enthusiast and tech lover.", //about
            "MikeWilson" //image url
        ));

        users.add(new User(
            "emma.lee@gmail.com", //email
            "emma_lee_21", //password
            "Emma Lee", //fullName
            22, //age
            LocalDate.of(2001, 3, 15), //birthdate
            "Female", //gender
            "Content Writer", //occupation
            "Korean", //nationality
            "Buddhism", //religion
            "Avid reader and cat lover.", //about
            "EmmaLee" //image url
        ));

        users.add(new User(
            "luis.garcia@mail.com", //email
            "luis_pass_789", //password
            "Luis Garcia", //fullName
            35, //age
            LocalDate.of(1988, 9, 23), //birthdate
            "Male", //gender
            "Civil Engineer", //occupation
            "Mexican", //nationality
            "Christianity", //religion
            "Family is my priority and I love tacos.", //about
            "LuisGarcia" //image url
        ));

        users.add(new User(
            "sophie.tan@icloud.com", //email
            "sophiet123", //password
            "Sophie Tan", //fullName
            27, //age
            LocalDate.of(1996, 6, 10), //birthdate
            "Female", //gender
            "UX Designer", //occupation
            "Singaporean", //nationality
            "Islam", //religion
            "I enjoy traveling and sketching.", //about
            "SophieTan" //image url
        ));

        users.add(new User(
            "chris.brown@protonmail.com", //email
            "chris_pass", //password
            "Chris Brown", //fullName
            40, //age
            LocalDate.of(1983, 12, 2), //birthdate
            "Male", //gender
            "Entrepreneur", //occupation
            "British", //nationality
            "Judaism", //religion
            "Always seeking new business opportunities.", //about
            "ChrisBrown" //image url
        ));
        
        // Create BedSpace objects and assign to users
        bedspaces.add(new BedSpace(
            5000, // monthlyFee
            20, // sizePerSqm
            true, // isAirconditioned
            2, // occupants
            List.of(users.get(1)), // roommates (Adriane and John)
            users.get(1), // owner (JohnDoe)
            "Jerkins Master Room", // bedspaceName
            "BS001", // id
            "123 Main St, City", // address
            true // isBiddingOpen
        ));

        bedspaces.add(new BedSpace(
            4500, // monthlyFee
            18, // sizePerSqm
            false, // isAirconditioned
            3, // occupants
            List.of(users.get(2)), // roommates (Jane and Mike)
            users.get(2), // owner (Jane)
            "DasJ Boarding House", // bedspaceName
            "BS002", // id
            "456 Maple Ave, City", // address
            false // isBiddingOpen
        ));

        bedspaces.add(new BedSpace(
            6000, // monthlyFee
            25, // sizePerSqm
            true, // isAirconditioned
            1, // occupants
            List.of(users.get(4)), // roommates (Emma)
            users.get(4), // owner (Emma)
            "Ronald's BalayBalay", // bedspaceName
            "BS003", // id
            "789 Oak Rd, City", // address
            true // isBiddingOpen
        ));

        bedspaces.add(new BedSpace(
            7000, // monthlyFee
            30, // sizePerSqm
            true, // isAirconditioned
            2, // occupants
            List.of(users.get(5)),
            users.get(5), // owner (Luis)
            "Jom Boardinganan", // bedspaceName
            "BS004", // id
            "101 Pine Ln, City", // address
            true // isBiddingOpen
        ));

        // Now set the bedspaces for each user (based on their ownership)
//        users.get(0).setBedspace(bedspaces.get(0));
        users.get(1).setBedspace(bedspaces.get(0));
        users.get(2).setBedspace(bedspaces.get(1));
        users.get(4).setBedspace(bedspaces.get(2));
        users.get(5).setBedspace(bedspaces.get(3));
    }
 
    public static void main(String[] args) {
    LandingPage LandingPageFrame = new LandingPage();
    LandingPageFrame.setVisible(true);
    LandingPageFrame.pack();
    LandingPageFrame.setLocationRelativeTo(null);
     
     
}
}