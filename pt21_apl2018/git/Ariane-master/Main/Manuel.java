import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;

        public class Manuel extends JFrame{
            private int[] tab;
            private int taille;
            private int sauvx,sauvy;

            public Manuel(int[] tab, int taille){
                this.taille=taille;
                this.sauvx=sauvx;
                this.sauvy=sauvy;

                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GrilleCrea crea = new GrilleCrea(tab,taille,0);
                Observateur2 obs = new Observateur2(crea,this,taille,tab);
                this.addKeyListener(obs);

                this.add(crea);
                this.setVisible(true);               
              
            }
        }

