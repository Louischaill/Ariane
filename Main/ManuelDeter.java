import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;

        public class ManuelDeter extends JFrame{
            private int[] tab;
            private int taille;
            private int sauvx,sauvy;

            public ManuelDeter(int[] tab, int taille){
                this.taille=taille;
                this.sauvx=sauvx;
                this.sauvy=sauvy;

                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GrilleCrea crea = new GrilleCrea(tab,taille,0);
                Observateur3 obs = new Observateur3(crea,this,taille,analyse );
                this.addKeyListener(obs);

                this.add(crea);
                this.setVisible(true);               
              
            }
        }

