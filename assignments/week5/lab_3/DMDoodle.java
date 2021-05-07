/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 3
    File Name: DMDoodle.java
    Author: Dustin McClure
    Lab: Doodle (Part A)
    Modified Date: 05/06/2021
*/
import java.awt.*;

public class DMDoodle
{
    public static void main(String[] args)
    {
        int x[] = new int[3];
        int y[] = new int[3];

        x[0] = 100; y[0] = 100;
        x[1] = 300; y[1] = 250;
        x[2] = 350; y[2] = 350;

        DrawingPanel dPanel = new DrawingPanel(600, 600);
        Graphics dPanelGraphics = dPanel.getGraphics();

        dPanel.setBackground(new Color(255,127,80));
        dPanelGraphics.drawRect(0, 0, 300, 300);
        dPanelGraphics.setColor(new Color(221,160,221));
        dPanelGraphics.fillRect(0,0, 300, 300);
        dPanelGraphics.setColor(new Color(218,165,32));
        dPanelGraphics.fillRect(100, 100, 300, 300);
        dPanelGraphics.drawRect(300, 300, 300, 300);
        dPanelGraphics.setColor(new Color(102,205,170));
        dPanelGraphics.fillRect(300, 300, 300, 300);
        dPanelGraphics.drawOval(175, 175, 200, 200);
        dPanelGraphics.setColor(new Color(72,209,204));
        dPanelGraphics.fillOval(175, 175, 200, 200);
        dPanelGraphics.drawPolygon(x, y, 3);
        dPanelGraphics.setColor(new Color(255,99,71));
        dPanelGraphics.fillPolygon(x, y, 3);
    }
}
