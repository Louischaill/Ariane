import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoRandMan {

    	private int res=0;
    	private int sauvx,i,finbcl,nb,compteur;
    	private GrilleCrea e;
    	private int[] tab;
/**

         * @param  res = resultat de la somme ou de la difference et met la position +1 -1 +taille -tailel sans changer la val de sauvx qui est la position de thesee
         * @param  sauvx,i,finbcl,nb,compteur position init de thesee, i bcl d'incrementation, finbcl prend la valeur -1 quand on atteint la sortie, direction == valeur a afficher dans le mode manuel, 
         nb c'est la valeur que l'on doit analyse correspond aux points cardinaux 
         * @param GrilleCrea  ce qui va colorier et mettre a jour notre grille
         @param tab tableau d'origine 
         * @param AlgoDeterministeMan methode qui va permettre de mettre les bonnes valeurs dans notre tableau tab afin de bien colorier et mettre a jour
       
         */

		public AlgoRandMan(int[] tab, int taille , GrilleCrea e,JFrame fen, int direction,int nb,int compteur){
			this.nb=nb;
			this.tab=tab; 
			this.e=e;

			for(i = 0 ; finbcl !=-1 ; i++){
	        	if(tab[i]==2){
	        		sauvx=i;
	        		finbcl=-1;
	        	}
        	}

			if(nb==-1){
				this.e.manuel4(direction);
                this.e.repaint();
			}

			if(nb==0){   	 		
	     		if((sauvx%taille) != 0 ){
	     			if(tab[sauvx-1]==3){
		   				
		   				tab[sauvx]=0;
		   				fen.dispose();
		   				CopieGrille cop = new CopieGrille(compteur,taille);
	     				
		     		}
	     			if(tab[sauvx-1]==0 ){

	    				int res = sauvx-1;
		     			this.e.manuel0(sauvx,direction);
                        this.e.repaint();
                        sauvx=res;
                        
                       
					}	     				
	     		}
	     	}
			

			if(nb==1){
    	 			
	     			if((sauvx%taille) != (taille-1)){
	     				if(tab[sauvx+1]==3){
		     				
		     				tab[sauvx]=0;
		     				fen.dispose();
		     				CopieGrille cop = new CopieGrille(compteur,taille);
                        	
		     			}
	     				if(tab[sauvx+1]==0){

		     				int res = sauvx + 1;
		     				this.e.manuel1(sauvx,direction);
                        	this.e.repaint();
                        	sauvx=res;

	     				}		
	     			
	     		}
	     	}
			
			if(nb==2){
					
	     			if(sauvx > taille-1 ){

	     				if(tab[sauvx-taille]==3){
		     				tab[sauvx]=0;
		     				fen.dispose();
							CopieGrille cop = new CopieGrille(compteur,taille);
		     			}
	     				if(tab[sauvx-taille]==0 ){
							int res=sauvx-taille;	     	
		     				this.e.manuel2(sauvx,taille,direction);
                        	this.e.repaint();
                        	sauvx=res;
                        	
                        	
	     				}
	     				     			
	     				
	     			}
	     		
			}
			if(nb==3){
				
	     			if(sauvx<(taille*(taille-1))){
	     				if( tab[sauvx+taille]==3){		     				
		     				tab[sauvx]=0;
		     				fen.dispose();
                        	CopieGrille cop = new CopieGrille(compteur,taille);
		     			}
	     				if(tab[sauvx+taille]==0 ){

		     				int res=sauvx+taille;
		     				this.e.manuel3(sauvx,taille,direction);
                       		this.e.repaint();
                       		sauvx=res;
                       		
                       		
	     				}
	     				
	     			}
	     		}
			

	    }


	}
