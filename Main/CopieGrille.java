import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

    public class CopieGrille extends JFrame{
        private int[] tab;
        private int taille;
        private int sauvx,sauvy;
        private int res;

        public CopieGrille(int[] tab, int sauvx,int sauvy,int taille){
            this.taille=taille;
            this.sauvx=sauvx;
            this.sauvy=sauvy;
            this.setSize((taille*40)*2+30,(taille*40)+32);
            this.setLocation(100, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            /*System.out.println(sauvx);
            System.out.println(sauvy);*/

            GrilleCrea crea = new GrilleCrea(tab,taille);
            AlgoRand alg = new AlgoRand(crea,tab,sauvx,sauvy,taille);
            this.add(crea);
            
            this.setVisible(true);
        }
           
    }
