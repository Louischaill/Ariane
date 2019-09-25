import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

    public class CopieGrille extends JFrame{

        private int compteur;
                   /**
         * permet d'afficher le resultat
         * @param  compteur d'incrementation 
         
        
         */

        public CopieGrille(int compteur, int taille){
            this.compteur=compteur;
            this.setSize((taille*40)*2+30,(taille*40)+32);
            this.setLocation(100, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel lab = new JLabel("Le pacours a ete realise en " + compteur + " coups !");
            lab.setHorizontalAlignment(JLabel.CENTER);
            this.add(lab);
            
            this.setVisible(true);
        }
           
    }
