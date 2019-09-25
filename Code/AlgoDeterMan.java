import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoDeterMan {
        private int taille;
        private Analyse e;
        private int tour,sauvx,sauvy,reconstruction,ts,directmp,posx;
        /**
         * Analyse voir dans quelle direction on a le droit d'aller retourne differentes valeurs au prgm d'origine permettant ou non le mouvement
         * @param taille  taille du tableau
         * @param Analyse fait rapport au programme analyse pour
         * @param int     permettent de connaitre position thesee,sortie, nord est ouest sud , le tableau en reconstruction pour connaitre les cases noires que l'on a trouver 
         * @return la valeur des valeurs negatives lorsque l'on ne peut pas acceder a la case , sinon 1 le chemin est libre, 5 si la prochaine case est la fin
            AlgDeterMan est la methode principale ou nous rentrons que la taille
            AlgoDman est le constructeur qui retourne les valeurs d'accessiblilités
         */
        public AlgoDeterMan( int taille){

            this.taille=taille;

        }

  
        public int AlgoDman(int tour,int sauvx,int sauvy,Analyse analyse,int reconstruction,int ts,int directmp ,int posx){

            this.e=analyse;

            if(tour==1 ){

                if(sauvx%taille != 0 && reconstruction!=1 && ts!=4 && directmp !=1  ){
                   
                    if(ts!=0){
                        return -1;
                        
                    }else{
                        if( this.e.AnalyseTab(sauvx,1) == 1){
                            
                            return -2;  
                        }else{
                            if( this.e.AnalyseTab(sauvx,1) == 2){                    
                                return 1;
                                

                            }else{
                                if(this.e.AnalyseTab(sauvx,1) == 5){
                                   
                                  return 2;
                                    
                                }
                            }
                        }
                    }
                }
                
            }
              
            if(tour==2){
                    
                    if( sauvx < taille*(taille-1) && reconstruction!=1 && ts!=4 && directmp!=2  ){
                  
                        if(ts!=0  ){
                           return -1;                    
                            
                        }else{
                            if(this.e.AnalyseTab(sauvx,2) == 1){
                                return -2;  

                            }else{
                                if(this.e.AnalyseTab(sauvx,2) == 2 ){
                           
                                    return 1;
                                  

                                }else{
                                    if(this.e.AnalyseTab(sauvx,2) == 5){
                                        
                                        return 2;
                                        
                                    }
                                }
                            }
                        }

                    }   
                    
                    }    
                        
                    if(tour==3){
                       
                        if((sauvx%taille) < (taille-1) && reconstruction!=1 && ts!=4 && directmp!=3 ){
                   
                            if(ts!=0){
                               return -1;
                               
                            }else{
                                
                                if(this.e.AnalyseTab(sauvx,3)== 1){
                                    return -2; 
                                }else{
                                    if(this.e.AnalyseTab(sauvx,3) == 2){
                                        return 1;
                                                     

                                    }else{
                                        if(this.e.AnalyseTab(sauvx,3) == 5){
                                            
                                            return 2;
                                            
                                        }
                                    }
                                }
                            } 

                        }
                        
                    }
                        if(tour==4){
                            
                           if( sauvx > taille-1 && reconstruction!=1 && ts!=4 ){
                          
                                if(directmp==4){
                                   return -3;
                                }else{
                                    if(ts!=0){
                                  
                                        return -2;
                                        
                                    }else{
                                        if( this.e.AnalyseTab(sauvx,4) == 1){

                                            return -1;  
                                        }else{
                                            if(this.e.AnalyseTab(sauvx,4) == 2){

                                               return 1;
                                                           

                                            }else{
                                                if(this.e.AnalyseTab(sauvx,4) == 5){

                                                    return 2;
                                                   
                                                }
                                            }
                                        } 
                                    }
                                }


                                    
                                }
                            }

                       
                        
                        return -8;
                    
                    }
                }
              
    
