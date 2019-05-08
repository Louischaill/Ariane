import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoDeterministe {
    	private int[] tab=null;
    	private int[] ti=null;
    	private int sauvx,sauvy,taille,fin=0,sauvegardedirection=0;
    	private int directmp=0,casedei=0,cmp=0;

    	public AlgoDeterministe(int[] tab , int sauvx, int sauvy, int taille){
    		this.tab=tab;
    		this.sauvx=sauvx;
    		this.sauvy=sauvy;
    		this.taille=taille;
    		System.out.println("taille : "+taille);
    		
    		int[] ts = new int[taille*taille];
    		int[] ti = new int[10000];
    		ts[sauvy]=6;  						/*savoir la case de fin*/

    		int x=0;
    		int s=0;
    		int sauvsx=0;

    		for(int i = 0 ; fin != -1 ; i++){
    			//System.out.println("cmp : "+cmp);

    			if(s==1){
    				x=sauvsx-1;
    			}
    			if(s==2){
    				x=sauvsx+taille;
    			}
    			if(s==3){
    				x=sauvsx+1;
    			}
    			if(s==4){
    				x=sauvsx-taille;
    			}


    			for(int val = 0 ; val < ti.length ; val++){
    				if( s!= 0 && ti[val] == x ){  						/*si le sauvx deja present ds le ti alors bcl*/
    					casedei = val;							/*sauvegarde la place*/
    					sauvegardedirection = ts[val];				/*met la val de la direction : 1.2.3.4*/
    					cmp=val; 
    					val= ti.length;
    					System.out.println("louis");    											/*arrete bcl*/
    					for(int e = casedei+1 ; e < ti.length ; e++){
    						ti[e]=0;								/*met tout le reste a 0*/    						
    					}
    				}
    			}

    			if(sauvx%taille != 0 && tab[sauvx-1] != 1 && ts[sauvx-1]!=4 && directmp !=1 /*&&  sauvegardedirection != 1*/){
    				System.out.println("val :"+1);
    				//System.out.println("sauvx :" + sauvx);
    				if(ts[sauvx-1]==6){
	    				fin=-1;
	    			}else{
	    				ts[sauvx]=1; /*met la direction*/
	    				s=1;
	    				sauvsx=sauvx;
	    				tab[sauvx]=0;
	    				sauvx=sauvx-1;
	    				tab[sauvx]=2;  /*change sauvx*/
	    				directmp=3;
	    				//System.out.println("tmp :"+directmp);
	    				ti[cmp]=sauvx;
	    				cmp++;
	    				//System.out.println("sauvx : "+sauvx);

	    			}

    			}else {
    				if( sauvx < taille*(taille-1) && tab[sauvx+taille] != 1 && ts[sauvx+taille]!=4 && directmp!=2  /*&& sauvegardedirection!= 2*/){
    					System.out.println("val :"+2);
    					//System.out.println("sauvx :" + sauvx);
    					if(ts[sauvx+taille]==6){
	    					fin=-1;
	    				}else{
	    					ts[sauvx]=2;
	    					s=2;
	    					sauvsx=sauvx;
	    					tab[sauvx]=0;
	    					sauvx=sauvx+taille;
	    					tab[sauvx]=2; 
	    					directmp=4; /*pas de retour sur le pere donc garde val pere*/  
	    					//System.out.println("tmp :"+directmp);
	    					ti[cmp]=sauvx;	
	    					cmp++;
	    					/*System.out.println("sauvx :" + sauvx);*/
	    				}
			
    				}else{
	    				if((sauvx%taille) != (taille-1) &&  tab[sauvx+1] != 1 && ts[sauvx+1]!=4 && directmp!=3 /*&&  sauvegardedirection != 3*/){
	    					System.out.println("val :"+3);
	    					/*System.out.println("sauvx :" + sauvx);*/
	    					if(ts[sauvx+1]==6){
	    						fin=-1;
	    					}else{
		    					ts[sauvx]=3;
		    					s=3;
		    					sauvsx=sauvx;
		    					tab[sauvx]=0;
		    					sauvx=sauvx+1;
		    					tab[sauvx]=2;
		    					directmp=1;
		    					/*System.out.println("tmp :"+directmp);*/
		    					ti[cmp]=sauvx;
		    					cmp++;
		    					/*System.out.println("sauvx :" + sauvx);*/
		    				}

    					}else{
	    					if(sauvx > taille-1 && tab[sauvx-taille] != 1 && ts[sauvx-taille]!=4 && directmp!=4/* &&  sauvegardedirection != 4*/){
	    						System.out.println("val :"+4);
	    						//System.out.println("sauvx :" + sauvx);
	    						if(ts[sauvx-taille]==6){
	    							fin=-1;
	    						}else{
		    						ts[sauvx]=4;
		    						s=4;
		    						sauvsx=sauvx;
		    						tab[sauvx]=0;
		    						sauvx=sauvx-taille;
		    						tab[sauvx]=2;
		    						directmp=2;
		    						//System.out.println("tmp :"+directmp);
		    						ti[cmp]=sauvx;
		    						cmp++;
		    						//System.out.println("sauvx :" + sauvx);
		    					}
	    					}
    					}
    				}
    			}
    		}
    		int valeurAaffiche=0;
    		for(int finish = 0 ; finish < ti.length ; finish++){
    			if(ti[finish] != 0){
    				valeurAaffiche++;
    			}
    		}
    		System.out.println(valeurAaffiche);

    

		}

    }
