

/*1. As warmup, write a GraphicsProgram that draws a blue, filled rectangle with
        width equal to 350 pixels and height equal to 270 in the center of the screen:
*/
package com.company;
import javax.swing.*;
import java.awt.*;


public class Rectangle extends JFrame {
    Rectangle(){
        super("Blue Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,400);
        setVisible(true);
        setResizable(true);



    }
    public void paint (Graphics g ){
        g.drawRect(50,50,350,270);
        g.setColor(Color.blue);
        g.fillRect(50,50,350,270);


    }
    public static void main(String[] args) {
        new Rectangle();

    }
}
