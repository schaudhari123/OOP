// Author: Sahil Chaudhari
// Drawing a Red oval.

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container; 
import java.awt.Color;

class Oval extends JPanel {
    private Color myColor;
    public void setColor(int red, int green, int blue) {
        myColor = new Color(red,green,blue);
    }
    public Color getColor() {
        return myColor;
    }

    Oval() {
        setColor(255,0,0);
    }

    Oval(int red, int green, int blue) {
        setColor(red,green,blue);       
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        g.setColor(Color.RED);
        g.fillRect(10, 10, 100, 100);
        g.drawRect(10, 10, 100, 100);
    }
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDrawPlus");
        setBounds(200,200,300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oval myOval = new Oval(0,255,255);
        Container contentPane = getContentPane();
        contentPane.add(myOval);     
    }
}

public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("OvalDraw Starting...");
        OvalFrame myFrame = new OvalFrame();
        
    }
}