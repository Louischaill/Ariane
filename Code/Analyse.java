import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class Analyse{
    	private int[] tab=null;
    	private int sauvx,sauvy,taille;
    	private int direction;

    	/**

         * @param  tab tableau d'origine contenant les cases noirs blanches thesee et sortie
         * @param  sauvx,sauvy,taille thesee sortie et taille du tableau
         * @param direction  indique si l'on va au nord est ouest sud 
         * @param Analyse fait rapport au programme analyse pour savoir si on peut acceder a une case du tableau
        * Analyse prends les variables expliquées precedem,nt en argument 
        	AnalyseTab est un constructeur qui va en fonctuion de l'endroit ou on est analyser l'espace autour si c'est noir blanc ou la sortie et retourne un valeur 
         */

    	public Analyse(int[] tab , int sauvx, int sauvy, int taille){
    		this.tab=tab;
    		this.sauvx=sauvx;
    		this.sauvy=sauvy;
    		this.taille=taille;
    	}
    	public int AnalyseTab(int sauvx,int direction){
    		this.direction=direction;
    		this.sauvx=sauvx;

    		if(direction==1){
    		    if(sauvx-1==sauvy){
    		    	
    				return 5;

    			}else{

	    			if(tab[sauvx-1]==1){
	    				return 1;
	    			}else{
	    				return 2;
	   				}
	    			
	    		}
	    	}else{
	    		
		    	if(direction==2){
	    			if(sauvx+taille==sauvy){
	    				return 5;
	    			}else{

		   				if(tab[sauvx+taille]==1){
		   					return 1;
		    			}else{
		    				return 2;
		    			}
		    			
		    		}
	    		}else{
		    		if(direction==3){
		    			if(sauvx+1==sauvy){
		    				return 5;
		    			}else{
			    			if(tab[sauvx+1]==1){
			    				return 1;

			    			}else{
			    				return 2;
			    			}
			    		}
    				}else{
			    		if(direction==4){
			    			if(sauvx-taille==sauvy){
			    				return 5;
			    			}else{
				    			if(tab[sauvx-taille]==1){
				    				return 1;
				    			}else{
				    				return 2;
				    			}
				    		
				    		}
				    	}else{
				    		return -1;
				    	}
				    }
				}
			}
    		

    	}
    }
