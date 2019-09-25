import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class VueAide extends JFrame implements ActionListener{
      private JButton bouton1 = new JButton("quitter");
      private JLabel rouge = new JLabel("Rouge : correspond à Thesée"); 
      private JLabel vert = new JLabel("Vert : correspond à la sortie");
      private JLabel bleu = new JLabel("Bleu : correspond à la possibilité de poser des cases noir de façon aléatoire"); 
      private JLabel orange = new JLabel("Orange : correspond à la possbilité de sauvegarder sa grille "); 
      private JLabel fini = new JLabel("Une fois votre grille créée , validé en cliquant sur ' FINIS ! '");
      private JPanel panneau = new JPanel();


      public VueAide(){

          this.setSize(600, 450);
          this.setLocation(1300, 100);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grille = new GridLayout(6,1);
        this.setLayout(grille);



          rouge.setHorizontalAlignment(JLabel.CENTER);
          rouge.setVerticalAlignment(JLabel.CENTER);
          vert.setHorizontalAlignment(JLabel.CENTER);
          vert.setVerticalAlignment(JLabel.CENTER);
          bleu.setHorizontalAlignment(JLabel.CENTER);
          bleu.setVerticalAlignment(JLabel.CENTER);
          orange.setHorizontalAlignment(JLabel.CENTER);
          orange.setVerticalAlignment(JLabel.CENTER);
          fini.setHorizontalAlignment(JLabel.CENTER);
          fini.setVerticalAlignment(JLabel.CENTER);

          this.add(rouge);
          this.add(vert);
          this.add(bleu);
          this.add(orange);
          this.add(fini);
          panneau.add(bouton1);
          this.add(panneau, BorderLayout.SOUTH);
          bouton1.addActionListener(this);

          this.setVisible(true);
      }


      public void actionPerformed(ActionEvent arg0) {
                  if(arg0.getSource() == bouton1){
                       
                        this.dispose();
                }
                    




     
      
}
}