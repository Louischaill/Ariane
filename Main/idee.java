/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoRand {

    	private GrilleCrea e;
    	private int res=0;

		public AlgoRand(GrilleCrea e,int[] tab , int sauvx, int sauvy, int taille){
			System.out.println("Finis");
			this.e=e;
			Random random = new Random();
			int nb;

		for(int i =0 ; i < 10000 ; i++){
     	
			nb = random.nextInt(4);

	     	
     	if(nb==0){

     		if(tab[sauvx-1]== 3){
     			tab[sauvx-1]=2;
     			System.out.println("Finis !");
     			i=9999;

     		}else{     	
	     		if((sauvx%taille) != 0 && tab[sauvx-1]!=1 ){
	     			tab[sauvx-1]=2;
	     			tab[sauvx]=0;
	     			e.repaint();
	     			System.out.println("Haut");
	     			
	     		}
	     	}
     	}

     	if(nb==1){
     		
     		if(tab[sauvx+1]== 3){
     			tab[sauvx+1]=tab[sauvx];
     			System.out.println("Finis !");
     			i=9999;
     		}else {
	     		if((sauvx%taille) != 4 && tab[sauvx+1]!=1 ){
	     			tab[sauvx+1]=2;
	     			tab[sauvx]=0;
	     			e.repaint();
	     			System.out.println("bas");
	     			
	     		}
	     	}
     	}

     	if(nb==2){

     		if(tab[sauvx+taille]== 3){
     			tab[sauvx+taille]=2;
     			System.out.println("Finis !");
     			i=9999;
     		}else {
	     		if(sauvx>taille-1 && tab[sauvx+taille]!=1 ){
	     			tab[sauvx+taille]=2;
	     			tab[sauvx]=0;
	     			e.repaint();
	     			System.out.println("droite");
	     			
	     		}
	     	}
     	}

     	if(nb==3){

     		if(tab[sauvx-taille]== 3){
     			tab[sauvx-taille]=2;
     			System.out.println("Finis !");
     			i=9999;
     		}else {
	     		if(sauvx<(taille*(taille-1)) && tab[sauvx-taille]!=1 ){
	     			tab[sauvx-taille]=2;
	     			tab[sauvx]=0;
	     			e.repaint();
	     			System.out.println("gauche");
	     			
	     		}
	     	}
     	} 	   	   	   	
    	}
    }
}*/