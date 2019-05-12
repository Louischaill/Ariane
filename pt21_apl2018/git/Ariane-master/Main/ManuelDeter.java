import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;

        public class ManuelDeter extends JFrame{
            private int[] tab;
            private int taille;
            private int sauvx,sauvy;

            public ManuelDeter(int[] tab , int sauvx,int sauvy, int taille){
                this.taille=taille;
                this.sauvx=sauvx;
                this.sauvy=sauvy;
                this.tab=tab;

                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GrilleCrea crea = new GrilleCrea(tab,taille,0);

                Analyse analyse = new Analyse( tab , sauvx, sauvy, taille);
                AlgoDeterMan a = new AlgoDeterMan(analyse, sauvx, sauvy, taille);

                Observateur3 obs = new Observateur3(tab ,crea,this, taille,a ,analyse);
                this.addKeyListener(obs);

                this.add(crea);
                this.setVisible(true);               
              
            }
        }

