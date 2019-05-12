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
    private Analyse analyse ;
    private AlgoDeterMan a;
    private int[] tab =null;
    public Observateur3(int[] tab ,GrilleCrea e,JFrame fen, int taille,AlgoDeterMan a , Analyse analyse){
    	this.e=e;
        this.taille=taille;
        this.a=a;
        this.analyse=analyse;
        this.fen=fen;
        this.sauvy=sauvy;
        this.tab=tab;
       
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	cmp++;

            			     

			    AlgoDeterministeMan alg = new AlgoDeterministeMan(tab,taille,e,fen,cmp,-1);

                 

         
                if(cmp==4){
                    cmp=0;
                }
                
            
		
			

			
	    }
    }       

    
    @Override
    public void keyReleased(KeyEvent evt) {}          
    
    @Override
    public void keyTyped(KeyEvent evt) {}
}