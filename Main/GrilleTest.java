        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;

        public class GrilleTest extends JFrame{
            private int[] tab;
            private int[] details;
            private int taille;
            private int posx,posy;
            private int res;

            public GrilleTest(int taille){
                this.taille=taille;
                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            
                int[] tab = new int[taille*taille];
                GrilleCrea crea = new GrilleCrea(tab,taille,1);
                Observateur obs = new Observateur(crea,this,taille,tab);
                crea.addMouseListener(obs);


                this.add(crea);
                
                this.setVisible(true);
            }

            public GrilleTest(int[] tab ,int taille,int sauvx,int sauvy){
                this.tab=tab;
                this.details=details;
                this.posx=sauvx;
                this.posy=sauvy;
                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GrilleCrea crea = new GrilleCrea(tab,taille,1);
                Observateur obs = new Observateur(crea,this,taille,tab,posx,posy);
                crea.addMouseListener(obs);


                this.add(crea);
                
                this.setVisible(true);
            }


         
           


            
    }
