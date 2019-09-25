import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;

        public class ManuelDeter extends JFrame{
            private int[] tab;
            private int taille;
            private int sauvx,sauvy,posx;
            private int[] ts=null ;
            private int[] ti=null;
            private int[] reconstruction=null;
            private int[] directs=null ;

            public ManuelDeter(int[] tab , int sauvx,int sauvy, int taille){
                this.taille=taille;
                this.sauvx=sauvx;
                this.sauvy=sauvy;
                this.tab=tab;

                int[] ts = new int[taille*taille];
                int[] ti = new int[taille*taille];
                int[] reconstruction= new int[taille*taille];
                int[] directs = new int[taille*taille*taille*taille];
                reconstruction[sauvx]=sauvx;

                posx=sauvx;
                this.setSize((taille*40)*2+30,(taille*40)+32);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GrilleCrea crea = new GrilleCrea(tab,taille,0);
                AlgoDeterMan adm = new AlgoDeterMan(taille);
                Observateur3 obs = new Observateur3(tab ,crea,this, taille,adm,ts,ti,reconstruction,directs,posx);
                this.addKeyListener(obs);

                this.add(crea);
                this.setVisible(true);               
              
            }
        }

