import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
             
    public class JFile extends JFrame{

        public JFile(){
            this.setSize(500,500);
            this.setLocation(100, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(this);

            if(returnVal == JFileChooser.APPROVE_OPTION) {

                System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
                String fichier = chooser.getSelectedFile().getName();
                this.add(chooser);
             
                System.out.println(fichier);
                Lecture tst = new Lecture(fichier);
           

            }
        }
    }