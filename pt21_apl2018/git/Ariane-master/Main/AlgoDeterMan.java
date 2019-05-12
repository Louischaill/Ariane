import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.Math; 

    public class AlgoDeterMan {
        private int[] ts=null;
        private int[] ti=null;
        private int[] reconstruction=null;
        private int[] directs = null;
        private int sauvx,sauvy,taille,fin=0,sauvegardedirection=0;
        private int casedei=0,cmp=0,resultat,directmp=0,i=1,posx;
        private Analyse e;
        private int s;

        public AlgoDeterMan(Analyse e, int sauvx, int sauvy, int taille){
            this.sauvx=sauvx;
            this.sauvy=sauvy;
            this.taille=taille;
            this.e=e;
            
            int[] ts = new int[taille*taille];
            int[] ti = new int[taille*taille];
            int[] reconstruction= new int[taille*taille];
            int[] directs = new int[taille*taille];
                                    
            posx=sauvx;

            int s=0;
            int res=0;
            int compteur=0;
            reconstruction[sauvx]=sauvx;
        }

        public int AlgoDman( int tour){

            if(tour==1){
                if(sauvx%taille != 0 && reconstruction[sauvx-1]!=1 && ts[sauvx-1]!=4 && directmp !=1  ){
                    if(ts[sauvx-1]!=0){
                        return 1;
                        
                    }else{
                        if( this.e.AnalyseTab(sauvx,1) == 1){
                            System.out.println("mur");  
                            reconstruction[sauvx-1]=1;
                            
                            return 1;  
                        }else{
                            if( this.e.AnalyseTab(sauvx,1) == 2){
                     
                                ts[sauvx]=1;
                                reconstruction[sauvx-1]=0;
                                ti[cmp]=sauvx;
                                sauvx=sauvx-1;
                                directs[cmp]=3;
                                directmp=3;
                                cmp++;
                                return 0;
                                

                            }else{
                                if(this.e.AnalyseTab(sauvx,1) == 5){
                                    System.out.println("finis");
                                  return -2;
                                    
                                }
                            }
                        }
                    }
                }
                return 8;
            }
              
                if(tour==2){
                    if( sauvx < taille*(taille-1) && reconstruction[sauvx+taille]!=1 && ts[sauvx+taille]!=4 && directmp!=2  ){
                  
                        if(ts[sauvx+taille]!=0  ){
                           return 1;
                     
                            
                        }else{
                            if(this.e.AnalyseTab(sauvx,2) == 1){
                                System.out.println("mur");  
                                reconstruction[sauvx+taille]=1; 
                                return 1;  

                            }else{
                                if(this.e.AnalyseTab(sauvx,2) == 2){
                           
                                    ts[sauvx]=2;
                                    reconstruction[sauvx+taille]=0;
                                    ti[cmp]=sauvx;
                                    sauvx=sauvx+taille;
                                    directs[cmp]=4;
                                    directmp=4;
                                    cmp++;
                                    return 0;
                                  

                                }else{
                                    if(this.e.AnalyseTab(sauvx,2) == 5){
                                        System.out.println("finis");
                                        return -2;
                                        
                                    }
                                }
                            }
                        }

                    }    
                    return 8;  
                    }     
                        
                    if(tour==3){
                        if((sauvx%taille) < (taille-1) && reconstruction[sauvx+1]!=1 && ts[sauvx+1]!=4 && directmp!=3 ){
                   

                            if(ts[sauvx+1]!=0){
                               return 1;
                               
                            }else{
                                
                                if(this.e.AnalyseTab(sauvx,3)== 1){
                                    System.out.println("mur");  
                                    reconstruction[sauvx+1]=1; 
                                    return 1; 
                                }else{
                                    if(this.e.AnalyseTab(sauvx,3) == 2){
                     
                                        ts[sauvx]=3;
                                        reconstruction[sauvx+1]=0;
                                        ti[cmp]=sauvx;
                                        sauvx=sauvx+1;
                                        directs[cmp]=1;
                                        directmp=1;
                                        cmp++;
                                        return 0;
                                                     

                                    }else{
                                        if(this.e.AnalyseTab(sauvx,3) == 5){
                                            System.out.println("finis");
                                            return -2;
                                            
                                        }
                                    }
                                }
                            } 

                        }return 8;
                    }
                        if(tour==4){
                            if( sauvx > taille-1 && reconstruction[sauvx-taille]!=1 && ts[sauvx-taille]!=4 ){
                          
                                if(directmp==4){
                                   return 1;
                                }else{
                                    if(ts[sauvx-taille]!=0){
                                  
                                        return 1;
                                        
                                    }else{
                                        if( this.e.AnalyseTab(sauvx,4) == 1){
                                            System.out.println("mur"); 
                                            reconstruction[sauvx-taille]=1; 
                                            return 1;  
                                        }else{
                                            if(this.e.AnalyseTab(sauvx,4) == 2){
                                         
                                                ts[sauvx]=3;
                                                reconstruction[sauvx-taille]=0;
                                                ti[cmp]=sauvx;
                                                sauvx=sauvx-taille;
                                                directs[cmp]=2;
                                                directmp=2;
                                                cmp++;
                                               return 0;
                                                           

                                            }else{
                                                if(this.e.AnalyseTab(sauvx,4) == 5){
                                                    System.out.println("finis");
                                                    return -2;
                                                   
                                                }
                                            }
                                        } 
                                    }
                                }
                            }else {
                                        
                                    s=4;

                                    if(s==4 ){

                                        System.out.println("sauvx"+sauvx);
                                        System.out.println("rec"+reconstruction[sauvx-taille]);
                                        System.out.println(ts[sauvx-taille]);

                                        if(reconstruction[sauvx-taille]==posx){
                                                                                      
                                            cmp=0;
                                            
                                            directmp=ts[sauvx-taille];
                                            sauvx=posx;
                                            return 1;

                                        }else{
                                            System.out.println("loulou");
                                            if(reconstruction[sauvx+1]==posx){
                                                cmp=0;
                                                
                                                directmp=ts[sauvx+1];
                                                sauvx=posx;
                                                return 1;
                                            } else{                                      
                                                ts[sauvx]=directs[cmp-1];
                                           
                                                sauvx=ti[cmp-1];
                                                directmp=directs[cmp-2];
                                                
                                                
                                                cmp--;
                                                return 1;
                                        }

                                    }

                                    }
                                }
                            }

                        return 8;
                        }

                    }
              
    
