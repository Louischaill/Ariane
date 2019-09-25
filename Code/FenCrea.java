 import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
    public class FenCrea extends JFrame implements ActionListener{
            private JButton bouton1 = new JButton("A.Aleatoire");
            private JButton bouton2 = new JButton("A.Deterministe");
            private JTextField area = new JTextField();
            private GridLayout gestionnaire;
            private JPanel panneau = new JPanel();
            private JPanel panneau1 = new JPanel();
            private JLabel vide = new JLabel("");
            private JLabel conseil = new JLabel("Entrez la taille de grille souhaité puis choisissez un algorithme");
            private int tab[]=null;
            private Boolean a = true;
            public FenCrea(){
                
                this.setSize(500,500);
                this.setLocation(500, 150);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GridLayout gestionnaire = new GridLayout(3, 1);
                this.setLayout(gestionnaire);
            
                this.add(vide, BorderLayout.NORTH);

                area.setPreferredSize(new Dimension(250, 20));
                 panneau.add(area);
                 panneau.add(conseil);
                this.add(panneau, BorderLayout.CENTER);
                area.addActionListener(this);


                panneau.add(bouton1);
                panneau.add(bouton2);
                bouton1.addActionListener(this);
                bouton2.addActionListener(this);
                this.add(panneau, BorderLayout.CENTER);
                this.setVisible(true);

    

            }



                public void actionPerformed(ActionEvent arg0) {
                    String r= area.getText();
                    int taille =Integer.parseInt(r);

                    if(arg0.getSource() == bouton1){

                        GrilleTest grille = new GrilleTest(taille,1);
                        this.dispose();

                    }
                    if(arg0.getSource() == bouton2){

                        GrilleTest grille = new GrilleTest(taille,2);
                        this.dispose();
                        

                    }

                }
            
        }

