        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;


        public class GrilleTest extends JFrame {
            private int[] tab;
            private int taille;
            private int x,y;
            private int res;

        
            private int clique,nbrE=0,nbrS=0;


            public GrilleTest(int taille){
                this.taille=taille;

                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                

                int[] tab = new int[taille*taille];
                System.out.println(clique);
                GrilleCrea crea = new GrilleCrea(tab,taille);
                Observateur obs = new Observateur(crea,taille);
                crea.addMouseListener(obs); 
                this.add(crea); 
                
                this.setVisible(true);

 

            }
           


            
    }
