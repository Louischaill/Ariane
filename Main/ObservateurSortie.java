	import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;

        public class ObservateurSortie implements MouseListener{
        	
        		private int taille;
    	        private int x,y;
    	        private GrilleCrea e;
    	        private int res;

        	public ObservateurSortie(GrilleCrea e, int taille ){
        		this.e=e;
        		this.taille=taille;
        	}

        	public void mouseClicked(MouseEvent e){

                int gx = e.getX();
                int gy = e.getY();
                if(gx<taille*40 && gy<taille*40){
                    x=(e.getX()/40)+1;
                    y=(e.getY()/40)+1;
                    res = ((x-1)*taille+(y-1));
                    /*System.out.println(res);*/
                    this.e.sortie(res);
                    this.e.repaint();
                } 
            }

            public void mouseEntered(MouseEvent evenement){}       
            public void mouseExited(MouseEvent evenement){}       
            public void mousePressed(MouseEvent evenement){}          
            public void mouseReleased(MouseEvent evenement){}      
        		
        }