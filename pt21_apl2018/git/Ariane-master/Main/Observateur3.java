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
	private int nb,cmp=0,compteur=0,posx,directmp=0,total=0,direction=0,s=0;
    private Analyse analyse ;
    private AlgoDeterMan adm;

    private int[] tab =null;
    private int[] ts=null ;
    private int[] ti=null;
    private int[] reconstruction=null;
    private int[] directs=null ;

    public Observateur3(int[] tab ,GrilleCrea e,JFrame fen, int taille,AlgoDeterMan adm,int[] ts,int[] ti,int[] reconstruction,int[] directs,int posx){
    	this.e=e;
        this.taille=taille;
        this.fen=fen;
        this.tab=tab;
        this.adm=adm; 
        this.reconstruction=reconstruction;
        this.ts=ts;
        this.ti=ti;
        this.directs=directs;
        this.posx=posx;
         
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	
            total++;
            compteur++;
         /*   System.out.println(Arrays.toString(ts));*/
         System.out.println("posx"+posx);

            for(int i = 0 ; i < tab.length ; i++){
                if(tab[i]==2){
                    sauvx=i;
                    System.out.println("sauvx boucle :"+sauvx);

                }
                if(tab[i]==3){
                    sauvy=i;
                }
            }
                if(compteur==5){
                    compteur=1;
                }

            
            Analyse analyse = new Analyse(tab ,sauvx, sauvy,taille);
          /*  System.out.println("compteur :"+compteur);
            System.out.println("sauvx"+sauvx);*/

            if(compteur==1 ){
                System.out.println("nord");
                
                int re = reconstruction[sauvx-1];
                int t = ts[sauvx-1];

                if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-1){ /*deja fait*/
                    System.out.println("e1");
                    /*System.out.println(sauvx);
                    System.out.println("t : "+t);*/

                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                 

                }else {

                    if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-2){ /*mur*/
                        System.out.println("e2");
                        reconstruction[sauvx-1]=1;
                        AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                        
                    }else{
                        if (this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==1){ /*possible*/
                                                   
                            ts[sauvx]=1;
                            reconstruction[sauvx-1]=0;
                            ti[cmp]=sauvx;
                           
                            directs[cmp]=3;
                            directmp=3;                                
                            cmp++;
                            AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,compteur);
                            
                            compteur=0;
                           
                            sauvx=sauvx-1;
                           

                        }else {
                            if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==2){                       
                                System.out.println("vous avez termine en : "+total+ "coups");
                                CopieGrille cop = new CopieGrille(total,taille);
                                
                            }
                        }
                    }
                }
            }                   
               
            
                if(compteur==2 && sauvx < taille*(taille-1) ){
                    System.out.println("est");
                    int re = reconstruction[sauvx+taille];
                    int t = ts[sauvx+taille];

                    if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-1){

                        AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                       

                    }else {

                        if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-2){
                            reconstruction[sauvx+taille]=1;
                            AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                           
                        }else{
                            if (this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==1 ){
                                
                                ts[sauvx]=2;
                                reconstruction[sauvx+taille]=0;
                                ti[cmp]=sauvx;
                                
                                directs[cmp]=4;
                                directmp=4;
                                cmp++;

                                AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,compteur);
                               
                                compteur=0;
                               
                                sauvx=sauvx+taille;
                                

                            }else {
                                if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==2){                       
                                    System.out.println("vous avez termine en : "+total+ "coups");
                                    CopieGrille cop = new CopieGrille(total,taille);
                                    
                                }
                            }
                        }
                    }                   
                   
                }

                    if(compteur==3 && (sauvx%taille) < (taille-1) ){
                        System.out.println("sud");

                        int re = reconstruction[sauvx+1];
                        int t = ts[sauvx+1];

                        if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-1){

                            AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                            
                        }else {

                            if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-2){
                                reconstruction[sauvx+1]=1;
                                AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                            }else{
                                if (this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==1 ){
                                  
                                    
                                    ts[sauvx]=3;
                                    reconstruction[sauvx+1]=0;
                                    ti[cmp]=sauvx;
                                   
                                    directs[cmp]=1;
                                    directmp=1;
                                    cmp++;
                                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,compteur);
                                  
                                    compteur=0;
                                    
                                    sauvx=sauvx+1;
                                   

                                }else {
                                    if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==2){                       
                                        System.out.println("vous avez termine en : "+total+ "coups");
                                        CopieGrille cop = new CopieGrille(total,taille);
                                        
                                    }
                                }
                            }
                        }                   
                       
                    }
                        if(compteur==4 && sauvx > taille-1){
                            System.out.println("ouest");

                            int re = reconstruction[sauvx-taille];
                            int t = ts[sauvx-taille];

                            if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-3){
                                System.out.println("e1");
                                tab[sauvx]=0;
                                tab[posx]=2;
                                AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                                s=4;
                                
                            }else{

                                if(this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-2){
                                    System.out.println("e2");       
                                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher); 
                                    s=4;
                                                   
                                }else{
                                    if( this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==-1){

                                       System.out.println("e3");
                                        System.out.println("mur"); 
                                        reconstruction[sauvx-taille]=1; 
                                        AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,afficher);
                                        s=4;
                                        
                                    }else{
                                        if( this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==1){
                                            System.out.println("e4");
                                            ts[sauvx]=4;
                                            reconstruction[sauvx-taille]=0;
                                            ti[cmp]=sauvx;
                                                   
                                            directs[cmp]=2;
                                            directmp=2;
                                            cmp++;
                                           

                                            AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,compteur);
                                            
                                            compteur=0;      
                                            
                                            sauvx=sauvx-taille;
                                                             

                                        }else{
                                            if( this.adm.AlgoDman(compteur,sauvx,sauvy,analyse,re,t,directmp,posx)==2){
                                                System.out.println("e5");                                   
                                                System.out.println("vous avez termine en : "+total+ "coups");
                                                CopieGrille cop = new CopieGrille(total,taille);
                                            }
                                        }
                                    }
                                }
                            }

                                                               
                        
                            if(s==4){

                                t = ts[sauvx];

                                if(sauvx > taille - 1 && reconstruction[sauvx-taille]==posx){
                                    System.out.println("e6");
                                                                             
                                    cmp=0;                                        
                                    directmp=ts[sauvx-taille];
                                    sauvx=posx;  
                                                                                                                                     
                                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,4);
                                    s=0;

                                    }else{
                                       
                                        System.out.println("loulou"+(sauvx-1));

                                        if( (sauvx%taille) < (taille-1) && reconstruction[sauvx+1]==posx){
                                            System.out.println("e7");

                                            cmp=0;                                           
                                            directmp=ts[sauvx+1];
                                            sauvx=posx;                
                                                           
                                            AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,2);
                                            s=0;

                                        } else{   

                                            if(sauvx%taille != 0 && reconstruction[sauvx-1]==posx){
                                                System.out.println("e8");

                                                cmp=0;                                           
                                                directmp=ts[sauvx-1];
                                                sauvx=posx;                
                                                           
                                                AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,1);
                                                s=0;


                                            }else{
                                                if( sauvx < taille*(taille-1) && reconstruction[sauvx+taille]==posx){
                                                    System.out.println("e8");

                                                    cmp=0;                                           
                                                    directmp=ts[sauvx+taille];
                                                    sauvx=posx;                
                                                           
                                                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,1);
                                                    s=0;

                                                }else{
                                                    System.out.println("e10");  
                                                    System.out.println(directs[cmp-1]);

                                                    System.out.println(sauvx);
                                                    ts[sauvx]=directs[cmp-1]; 
                                                    tab[sauvx]=0;                                      
                                                    sauvx=ti[cmp-1];     
                                                    tab[sauvx]=2;
                                                    System.out.println(sauvx);                                       
                                                    

                                                    directmp=directs[cmp-2];  
                                                    System.out.println(directmp);                                                                                                                             
                                                    cmp--;
                                                    AlgoDeterministeMan algo = new AlgoDeterministeMan(tab,taille ,e,fen,compteur,-1);
                                                    s=0;
                                                }

                                        }

                                    

                                }
                            }
                        }
                        }
                    }
                }
                                

            
    
    @Override
    public void keyReleased(KeyEvent evt) {}          
    
    @Override
    public void keyTyped(KeyEvent evt) {}
}
