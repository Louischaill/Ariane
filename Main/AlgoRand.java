import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoRand {

    	private int[] tab;
    	private int res=0,sauvx,posx;

		public AlgoRand(int[] tab , int sauvx, int sauvy, int taille){
		

			Random random = new Random();
			int[] sauvtab = new int[taille*taille];
			int nb, i;
			int fin=0;
			int compteur=0;
			int valAdiviser = 0;
			this.tab=tab;
			this.sauvx=sauvx;

			posx=sauvx;
			/*System.out.println("posx : " + posx);*/

		for(int moyenne =0 ; moyenne<100; moyenne++){
			/*System.out.println("moyenne = " + moyenne);*/
			fin =0;
			sauvx=posx;
			tab[sauvx]=2;

			/*System.out.println("sauvx position : " +sauvx);*/

			for( i = 0 ; fin != 8; i++){

				nb = random.nextInt(4);
				/*compteur++;*/


				if(nb==0){
	     	 		compteur++;
		     		if((sauvx%taille) != 0 ){
		     			if(tab[sauvx-1]==3){
			   			
			   				tab[sauvx]=0;
		     				fin=8;
		     			

			     		}
		     			if(tab[sauvx-1]==0 ){
		    				int res = sauvx-1;
		    				tab[res]=tab[sauvx];
			     			tab[sauvx]=0;
			     			sauvx=res;
			     			/*System.out.println("sauvx : " +sauvx);*/
			     			
						}
						     				
		     		}
		     	
		     	}
				

				if(nb==1){
	     	 		compteur++;
		     			if((sauvx%taille) != (taille-1)){
		     				if(tab[sauvx+1]==3){
			     				tab[sauvx]=0;
			     				fin=8;
			     	
			     			}
		     				if(tab[sauvx+1]==0){
			     				int res = sauvx + 1;
			     				tab[res]=tab[sauvx];
			     				tab[sauvx]=0;
			     				sauvx=res;
			     			/*	System.out.println("sauvx : " +sauvx);*/
		     				}		     							     			
		     			}			
		     	}
				
				if(nb==2){
					compteur++;
		     			if(sauvx > taille-1 ){
		     				
		     				if(tab[sauvx-taille]==3){
			     				tab[sauvx]=0;
			     				fin=8;
			     				
			     			}
		     				if(tab[sauvx-taille]==0 ){
			     				int res=sauvx-taille;
			     				tab[res]=tab[sauvx];
			     				tab[sauvx]=0;
			     				sauvx=res;
			     				/*System.out.println("sauvx : " +sauvx);*/
		     				}
		     				     			
		     				
		     			}
		     		
				}
				if(nb==3){
					compteur++;
		     		if(sauvx<(taille*(taille-1))){
		     			if( tab[sauvx+taille]==3){
			     			tab[sauvx]=0;
			     			fin=8;
			 

			     		}
		     			if(tab[sauvx+taille]==0 ){
			     			int res=sauvx+taille;
			     			tab[res]=tab[sauvx];
			     			tab[sauvx]=0;
		    				sauvx=res;
			  			/*	System.out.println("sauvx : " +sauvx);*/

		     			}		     			
		     		}		     		
		   		}						     		
		    }
		}
		System.out.println(compteur);
		compteur=compteur/100;
	    System.out.println("Vous avez finis en "+compteur+" coups");
	    CopieGrille cop = new CopieGrille(compteur,taille);

	}
}