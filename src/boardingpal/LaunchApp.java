
package boardingpal;

import boardingpal.models.User;
import boardingpal.models.BedSpace;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class LaunchApp extends javax.swing.JFrame {
    public static List<User> users = new ArrayList<>();
    public static List<BedSpace> bedspaces = new ArrayList<>();
    
    public static User loggedInUser = null;
   
    public LaunchApp(String a) {
        users.add(new User(
            "test",
            "test123",
            "Adriane Dilao",
            20,
            LocalDate.of(2004, 10, 16),
            "Male",
            "Software Engineer",
            "Filipino",
            "Christianity",
            "I love fried Chicken and lasagnas.",
            "AdrianeDilao"
        ));
        
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
            List.of(users.get(0), users.get(1)), // roommates (Adriane and John)
            users.get(0), // owner (Adriane)
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
            List.of(users.get(2), users.get(3)), // roommates (Jane and Mike)
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
            List.of(users.get(5)), // roommates (Luis and Sophie)
            users.get(5), // owner (Luis)
            "Jom Boardinganan", // bedspaceName
            "BS004", // id
            "101 Pine Ln, City", // address
            true // isBiddingOpen
        ));

        // Now set the bedspaces for each user (based on their ownership)
        users.get(0).setBedspace(bedspaces.get(0));
        users.get(2).setBedspace(bedspaces.get(1));
        users.get(4).setBedspace(bedspaces.get(2));
        users.get(5).setBedspace(bedspaces.get(3));

        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
    }
    
    public LaunchApp() {
        users.add(new User(
            "test",
            "test123",
            "Adriane Dilao",
            20,
            LocalDate.of(2004, 10, 16),
            "Male",
            "Software Engineer",
            "Filipino",
            "Christianity",
            "I love fried Chicken and lasagnas.",
            "AdrianeDilao"
        ));
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

        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.6F);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaunchApp().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
