import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class VueDossier extends JFrame implements ActionListener{
      private JButton bouton1 = new JButton("OK");
      private JButton bouton2 = new JButton("annuler");
      private JTextField champ = new JTextField();  
      private JPanel panneau = new JPanel();
      private JPanel panneau2 = new JPanel();
      private JLabel texte = new JLabel("Créer le dossier : ");
      private String nomDossier;
      private int x,y,grandeur;
      private int[] tab;


      public VueDossier(int[] tableau,int sauvx,int sauvy,int taille){
          this.x=sauvx;
          this.y=sauvy;
          this.grandeur=taille;
          this.tab=tableau;   

          this.setSize(400, 250);
          this.setLocation(100, 100);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          panneau2.add(texte);
          champ.setPreferredSize(new Dimension(100, 20));
          panneau2.add(champ);

          this.add(panneau2,BorderLayout.CENTER);
          panneau.add(bouton1);
          panneau.add(bouton2);
          bouton1.addActionListener(this);
          bouton2.addActionListener(this);
          champ.addActionListener(this);
          this.add(panneau,BorderLayout.SOUTH); 

          this.setVisible(true);
      }


      public void actionPerformed(ActionEvent arg0) {
          String dossier= champ.getText();
          String test;
          Boolean a=true;
          int i;

          if(arg0.getSource() == bouton1){
              test = dossier.substring(0,dossier.length());

              if(test.contains(".")){
                  String verif = dossier.substring(dossier.length()-3,dossier.length());
                  
                  if(!verif.equals("lab")){ 
                      this.champ.setText("");
                      System.out.println("erreur l'extension doit être .lab");
                  }else{
                      Sauvegarde(dossier,tab,x,y,grandeur);
                      this.setVisible(false);                                
                  }       
                      
              }else{
                  this.champ.setText("");
                  System.out.println("erreur l'extension doit être .lab");
              }
          }
                    

          if(arg0.getSource() == bouton2){
              this.setVisible(false);                        
          }
      }
      
      public void Sauvegarde(String string,int[] tab,int sauvx,int sauvy,int taille){
            
          this.nomDossier = string;
          this.x=sauvx;
          this.y=sauvy;
          this.grandeur=taille;
          this.tab=tab;
          
          try {
              File fichier = new File(System.getProperty("user.dir")+File.separator+"sauvegarde"+File.separator+nomDossier);
              
              if(!fichier.exists()){
                  System.out.println("Creation du fichier effectué avec succès");
              }else{
                  System.out.println("Le fichier existe déjà ,les valeurs sont écrasées automatiquement");
              } 
              BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));
              writer.close();
              Ecriture sauv = new Ecriture(nomDossier,tab,x,y,taille);           
          }catch (IOException e){
              System.out.println("Erreur");
          }
      }
}