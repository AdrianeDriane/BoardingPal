package boardingpal;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class RoundedPasswordField extends JPasswordField {

    private int arcWidth = 50;  // Width of the rounded corner
    private int arcHeight = 50; // Height of the rounded corner
    private Insets customInsets = new Insets(15, 20, 15, 20); // Default insets (top, left, bottom, right)
    private String placeholder = "  Enter your password"; // Default placeholder text
    private boolean isPlaceholderActive = true;
    private Color lineColor = new Color(52, 152, 219, 0); // Default line color (transparent)

    public RoundedPasswordField() {
        setOpaque(false); // Makes the background transparent
        setEchoChar('*'); // Masks the input characters with '*'
        setForeground(new Color(153, 153, 153)); // Placeholder text color
        setFont(new Font("Arial", Font.PLAIN, 14)); // Font for the text
        setBorder(null); // Remove the default border
        addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(getPassword()).isEmpty()) {
                    isPlaceholderActive = false;
                    repaint();
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (String.valueOf(getPassword()).isEmpty()) {
                    isPlaceholderActive = true;
                    repaint();
                }
            }
        });
    }

    // Method to set custom insets
    public void setCustomInsets(Insets insets) {
        this.customInsets = insets;
        repaint();
    }

    // Override getInsets to use the custom insets
    @Override
    public Insets getInsets() {
        return customInsets;
    }

    // Bean property for the placeholder
   
    public void setPlaceholder(String placeholder) {
        String oldPlaceholder = this.placeholder;
        this.placeholder = placeholder;
        firePropertyChange("placeholder", oldPlaceholder, placeholder); // Notify listeners
        repaint();
    }

    // Getter for the placeholder
    public String getPlaceholder() {
        return placeholder;
    }

    // Method to set the line (border) color with transparency
    public void setLineColor(Color color) {
        this.lineColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background color
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);

        // Border color (using lineColor variable with transparency)
        g2.setColor(lineColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);

        g2.dispose();

        // If the password field is empty and not focused, display the placeholder
        if (isPlaceholderActive) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(new Color(153, 153, 153)); // Placeholder text color
            g2d.setFont(getFont());
            g2d.drawString(placeholder, 10, getHeight() / 2 + 5); // Draw the placeholder
        }

        // Let the superclass paint the actual password text
        super.paintComponent(g);
    }

    @Override
    public void setBorder(Border border) {
        // Prevent external borders from being applied
    }
}
