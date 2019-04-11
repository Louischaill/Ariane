    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;

        public class Observateur implements MouseListener{
        	
        		private int taille;
    	        private int x,y;
    	        private GrilleCrea e;
    	        private int res,clique;
                private int nbrE=0,nbrS=0,sauvx,sauvy;

        	public Observateur(GrilleCrea e, int taille ){
        		this.e=e;
        		this.taille=taille;

        	}

        	public void mouseClicked(MouseEvent e){

                int gx = e.getX();
                int gy = e.getY();

                if(clique<0 && (nbrE==1 || nbrS==1)){
                    if(clique==-1 && nbrE == 1){
                        if(gx<taille*40 && gy<taille*40){
                            x=(e.getX()/40)+1;
                            y=(e.getY()/40)+1;
                            res = ((x-1)*taille+(y-1));
                            sauvx=res;
                            this.e.entree(res);
                            this.e.repaint();
                            clique=1;
                        }
                    }
                    if(clique==-2 && nbrS == 1){
                        if(gx<taille*40 && gy<taille*40){
                            x=(e.getX()/40)+1;
                            y=(e.getY()/40)+1;
                            res = ((x-1)*taille+(y-1));
                            this.e.sortie(res);
                            sauvy=res;
                            this.e.repaint();
                            clique=1;
                        }
                    }
                }else{
                    if(gx<taille*40 && gy<taille*40){
                        x=(e.getX()/40)+1;
                        y=(e.getY()/40)+1;
                        res = ((x-1)*taille+(y-1));
                        if(res==sauvx){
                            nbrE=0;
                        }else{
                            if(res==sauvy){
                                nbrS=0;
                            }
                        }
                        this.e.base(res);
                        this.e.repaint();
                       
                    }
                }
                if(gx>(taille+1)*40 && gx<(taille+2)*40 && gy>((taille/2)-1)*40 && gy<(taille/2)*40){

                        clique=-1;
                       /* System.out.println(clique);*/
                        nbrE++;
                
                }
                if(gx>(taille+2)*40 && gx<(taille+3)*40 && gy>((taille/2)-1)*40 && gy<(taille/2)*40){
                    
                        clique=-2;
                        /*System.out.println(clique);*/
                        nbrS++;
                }
                
            }

            public void mouseEntered(MouseEvent evenement){}       
            public void mouseExited(MouseEvent evenement){}       
            public void mousePressed(MouseEvent evenement){}          
            public void mouseReleased(MouseEvent evenement){}      
        		
        }
