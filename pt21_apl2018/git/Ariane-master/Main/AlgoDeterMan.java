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
                            System.out.println("mur");  
                            return -2;  
                        }else{
                            if( this.e.AnalyseTab(sauvx,1) == 2){                    
                                return 1;
                                

                            }else{
                                if(this.e.AnalyseTab(sauvx,1) == 5){
                                    System.out.println("finis");
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
                                        System.out.println("finis");
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
                                            System.out.println("finis");
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

                                                    return -2;
                                                   
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
              
    
