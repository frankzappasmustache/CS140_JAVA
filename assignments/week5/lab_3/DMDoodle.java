/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 3
    File Name: DMDoodle.java
    Author: Dustin McClure
    Lab: Doodle (Part A)
    Modified Date: 05/07/2021

    A program that creates a little doodle with a few squares, an oval, 
    and a triangle.
*/
import java.awt.*;

// Begin class DMDoodle
public class DMDoodle
{
    // Method main begins execution
    public static void main(String[] args)
    {
        int x[] = new int[3]; // declare an array of integers and initialize it
        int y[] = new int[3]; // declare an array of integers and initialize it

        // set array indexes to appropriate x and y coordinates for triangle
        x[0] = 100;
        y[0] = 100;
        x[1] = 300;
        y[1] = 250;
        x[2] = 350;
        y[2] = 350;

        DrawingPanel dPanel = new DrawingPanel(600, 600); // create new panel
        Graphics dPanelGraphics = dPanel.getGraphics(); // create new graphics object

        dPanel.setBackground(new Color(255,127,80)); // set background color for panel
        dPanelGraphics.drawRect(0, 0, 300, 300); // draw rectangle 1
        dPanelGraphics.setColor(new Color(221,160,221)); // set bg color for rectangle 1
        dPanelGraphics.fillRect(0,0, 300, 300); // fill rectangle 1
        dPanelGraphics.setColor(new Color(218,165,32)); // set bg color for rect 2
        dPanelGraphics.fillRect(100, 100, 300, 300); // fill rect 2 ( no drawing for this one :)
        dPanelGraphics.drawRect(300, 300, 300, 300); // draw rect 3
        dPanelGraphics.setColor(new Color(102,205,170)); // set bg color for rect 3
        dPanelGraphics.fillRect(300, 300, 300, 300); // fill rect 3
        dPanelGraphics.drawOval(175, 175, 200, 200); // draw oval
        dPanelGraphics.setColor(new Color(72,209,204)); // set bg color for oval
        dPanelGraphics.fillOval(175, 175, 200, 200); // fill oval
        dPanelGraphics.drawPolygon(x, y, 3); // draw triangle using x and y coordinates
        dPanelGraphics.setColor(new Color(255,99,71)); // set color for triangle
        dPanelGraphics.fillPolygon(x, y, 3); // fill triangle
    } // method main ends
} // class DMDoodle ends
