import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Observateur2 implements KeyListener{
	private int taille;
   	private GrilleCrea e;
   	private int sauvx,sauvy,res;
    private int[] tab;
    private JFrame fen;
    private int orientation ,afficher=-1;
    private Random random = new Random();
	private int nb,cmp=0;

    public Observateur2(GrilleCrea e,JFrame fen, int taille,int[] tab){
    	this.e=e;
        this.taille=taille;
        this.tab=tab;
        this.fen=fen;
        this.sauvy=sauvy;
        Random random = new Random();
		int nb;
       
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	cmp++;
			nb = random.nextInt(4);
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