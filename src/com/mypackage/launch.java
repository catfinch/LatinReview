package com.mypackage;

import com.mypackage.Level;

import javax.swing.JFrame;
import java.awt.*;

public class launch {

    public static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.

        Level newContentPane = new Level();
        newContentPane.setVisible(true);
        frame.setContentPane(newContentPane);


        //Display the window.
        frame.setSize(600,500);
        frame.setLocation(500, 240);
        frame.setVisible(true);



        if(Level.ShowWeek)
        {
            newContentPane.setVisible(false);
            //weeksContentPane2.setVisible(true);
        }
        else
        {

            newContentPane.setVisible(true);
            frame.setContentPane(newContentPane);


            //weeksContentPane2.setVisible(false);
        }

    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}