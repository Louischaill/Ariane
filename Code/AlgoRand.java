import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoRand {

    	private int[] tab;
    	private int res=0,sauvx,posx;

    	  /**

         * @param  tab tableau d'origine contenant les cases noires et blanche entree sortie 
         * @param  res,sauvx,posx sauvegarde la position de l'entree que l'on veut en fonction de la direction 
       
         */

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
			

		for(int moyenne =0 ; moyenne<100; moyenne++){
			
			fin =0;
			sauvx=posx;
			tab[sauvx]=2;

			

			for( i = 0 ; fin != 8; i++){

				nb = random.nextInt(4);
			


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
			  			

		     			}		     			
		     		}		     		
		   		}						     		
		    }
		}
	
		compteur=compteur/100;

	    CopieGrille cop = new CopieGrille(compteur,taille);

	}
}