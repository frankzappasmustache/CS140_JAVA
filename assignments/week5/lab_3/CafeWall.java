/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 3
    File Name: CafeWall.java
    Author: Dustin McClure
    Lab: Cafe Wall (Part B)
    Modified Date: 05/07/2021

    A program that creates the cafe wall illusion using a method that draws row
    pairs, a method that draws grids using series of row pairs, and the main method
    which makes use of these two methods to *almost* reproduce the image from our lab.

    I had a little trouble getting the spacing between rows and grids to show properly.
*/
import java.awt.*;

// Begin class CafeWall
public class CafeWall
{
    // Method main begins execution
    public static void main(String[] args)
    {
        DrawingPanel dPanel = new DrawingPanel (650, 400); // create new drawing panel at 650x400
        dPanel.setBackground(Color.GRAY); // set background color to gray

        Graphics dPanelGraphics = dPanel.getGraphics(); // create new graphics object for drawing

        makeRow(dPanelGraphics, 0, 0, 4, 20); // draw row 1
        makeRow(dPanelGraphics, 50, 70, 5, 30); // draw row 2
        makeGrid(dPanelGraphics, 10, 150, 4, 25, 0, 2); // draw bottom left row grid
        makeGrid(dPanelGraphics, 250, 200, 3, 25, 10, 2); // draw bottom middle row grid
        makeGrid(dPanelGraphics, 425, 180, 5, 20, 10, 2); // draw bottom right row grid
        makeGrid(dPanelGraphics, 400, 20, 2, 35, 35, 2); // draw upper right row grid

    } // method main ends
    
    // Begin method makeRow
    public static void makeRow(Graphics dPanelGraphics, int x, int y, int pairs, int size)
    {
        // for loop that draws 2 boxes and loops through to create as many pairs
        // of boxes as necessary
        for(int i = 0; i <= pairs; i++)
        {
            dPanelGraphics.setColor(new Color(0, 0, 0)); // set color for box 1 to black
            dPanelGraphics.drawRect(x, y, size, size); // draw box 1 starting at x/y to size/size
            dPanelGraphics.fillRect(x, y, size, size); // fill box 1 using identical coordinates and size
            dPanelGraphics.setColor(new Color(0, 0, 255)); // change color to blue for x on black boxes
            dPanelGraphics.drawLine(x, y, x + size, y + size); // draw line 1 of x in black box
            x += size; // add size to x coord so that line 2 of the x starts at appopriate x coord
            dPanelGraphics.drawLine(x, y + size, x + size, y); // draw line 2 of x in black box
            dPanelGraphics.setColor(new Color(255, 255, 255)); // change color to white in preparation for white box
            dPanelGraphics.drawRect(x, y, size, size); // draw box 2 starting at x/y to size/size
            dPanelGraphics.fillRect(x, y, size, size); // fill box 2 using identical coordinates and size
            x += size; // add size to x coord so the next pair in row start at the appropriate coordinates
        } // end for loop
    } // end method makeRow

    // Begin method makeGrid
    public static void makeGrid(Graphics dPanelGraphics, int x, int y, int pairs, int size, int offset, int mortar)
    {
        // for loop that loops through while i is less than pairs * 2 (2 rows in each series)
        for(int i = 0; i <= pairs * 2; i++)
        {
            // use makeRow method and account for offset/size of already existing rows
            makeRow(dPanelGraphics, x + (i % 2 * offset), y + size * i, pairs, size);
            y += 2; // account for mortar on next loop
        } // end for loop
    } // end method makeGrid
} // end class CafeWall
