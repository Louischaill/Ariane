    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;
    import javax.swing.filechooser.*;
                 
        public class JFile extends JFrame{

            public JFile(){
                this.setSize(500,500);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JFileChooser chooser = new JFileChooser();
                File sauvegarde = new File(System.getProperty("user.dir")+File.separator+"sauvegarde");
                FileNameExtensionFilter filter = new FileNameExtensionFilter("sauvegarde file", "lab");
                chooser.setCurrentDirectory(sauvegarde);

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