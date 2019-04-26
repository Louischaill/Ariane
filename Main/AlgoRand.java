import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoRand {

    	private GrilleCrea e;
    	private int res=0;

		public AlgoRand(GrilleCrea e,int[] tab , int sauvx, int sauvy, int taille){
		/*	System.out.println("Finis");*/
			this.e=e;
			Random random = new Random();
			int nb,i;
			int fin=0;
			int compteur=0;

		for( i = 0 ; fin != 8; i++){
			nb = random.nextInt(4);

			if(nb==0){
				System.out.println("haut");
     	 			
	     		if((sauvx%taille) != 0 ){
	     			if(tab[sauvx-1]==3){
		   				System.out.println("FInis");
		   				tab[sauvx]=0;
	     				fin=8;
		     		}
	     			if(tab[sauvx-1]==0 ){
		  				System.out.println("possible haut");
	    				int res = sauvx-1;
	    				tab[res]=tab[sauvx];
		     			tab[sauvx]=0;
		     			sauvx=res;
		     			compteur++;
					}	     				
	     		}
	     	}
			

			if(nb==1){
				System.out.println("bas");
     	 		
	     			if((sauvx%taille) != (taille-1)){
	     				System.out.println("test");
	     				if(tab[sauvx+1]==3){
		     				System.out.println("FInis");
		     				tab[sauvx]=0;
		     				fin=8;
		     			}
	     				if(tab[sauvx+1]==0){
		     				System.out.println("possible bas");
		     				int res = sauvx + 1;
		     				tab[res]=tab[sauvx];
		     				tab[sauvx]=0;
		     				sauvx=res;
		     				compteur++;
	     				}

	     				
	     			
	     		}
	     	}
			
			if(nb==2){
				System.out.println("gauche");

	     			if(sauvx > taille-1 ){
	     				System.out.println(sauvx);
	     				System.out.println("test");
	     				if(tab[sauvx-taille]==3){
		     				System.out.println("FInis");
		     				tab[sauvx]=0;
		     				fin=8;
		     			}
	     				if(tab[sauvx-taille]==0 ){
		     				System.out.println("possible gauche");
		     				int res=sauvx-taille;
		     				tab[res]=tab[sauvx];
		     				tab[sauvx]=0;
		     				sauvx=res;
		     				compteur++;
	     				}
	     				     			
	     				
	     			}
	     		
			}
			if(nb==3){
				System.out.println("droite");
	     			if(sauvx<(taille*(taille-1))){
	     				if( tab[sauvx+taille]==3){
		     				System.out.println("FInis");
		     				tab[sauvx]=0;
		     				fin=8;
		     			}
	     				if(tab[sauvx+taille]==0 ){
		     				System.out.println("possible droite");
		     				int res=sauvx+taille;
		     				tab[res]=tab[sauvx];
		     				tab[sauvx]=0;
		     				sauvx=res;
		     				compteur++;
	     				}
	     				
	     			}
	     		}
			

	    }
	    compteur=compteur+1;
	    System.out.println("Vous avez finis en "+compteur+" coups");
	   
	}
}