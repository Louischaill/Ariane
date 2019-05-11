import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Observateur3 implements KeyListener{
	private int taille;
   	private GrilleCrea e;
   	private int sauvx,sauvy,res;
    private JFrame fen;
    private int orientation ,afficher=-1;
	private int nb,cmp=0;

    public Observateur3(GrilleCrea e,JFrame fen, int taille){
    	this.e=e;
        this.taille=taille;

        this.fen=fen;
        this.sauvy=sauvy;
        this.analyse=analyse;
        this.adm=adm;

       
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	cmp++;

            Analyse analyse = new Analyse( tab , sauvx, sauvy, taille);
            AlgoDeterMa
			
			orientation =nb;

			AlgoRandMan alg = new AlgoRandMan(tab,taille,e,fen,orientation,afficher,cmp);
			
			afficher=orientation;

			
	    }
    }       
    
    @Override
    public void keyReleased(KeyEvent evt) {}          
    
    @Override
    public void keyTyped(KeyEvent evt) {}
}