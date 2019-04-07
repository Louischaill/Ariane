import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JComponent;
import java.awt.*;


public class Fenetre extends JComponent{

        private int[] tab = new int[16];
        private int[] details = new int[5];

        public Fenetre(int[] tab, int[] details ){
                super();
                this.tab=tab;
                this.details=details;
                
        }

        @Override
        public void paintComponent(Graphics pinceau){
                Graphics secondPinceau = pinceau.create();
                secondPinceau.setColor(Color.white);
                secondPinceau.fillRect(0,0,500,500);
                int large = 40;
                int nbr = 0;
                int x=0;
                int taille = details[0];
               
                int xe = details[1];
                int ye = details[2];
                int xs = details[3];
                int ys = details[4];


 				xe=xe*40;
                ye=ye*40;
                xs= xs*40;
                ys=ys*40;

                for(int j = 0 ; j < taille ;j=j+1){
                        int t = 0;
                        
                        for( int i = 0 ; i < taille ;i=i+1){
                                if(tab[nbr]==0){
                                        secondPinceau.setColor(Color.white);
                                        secondPinceau.fillRect(j*large,i*large,40,40);
                                        secondPinceau.setColor(Color.black);
                                        secondPinceau.drawRect(j*large,i*large,40,40);
                                }else{
                                        secondPinceau.setColor(Color.black);
                                        secondPinceau.fillRect(j*large,i*large,40,40);
                                        secondPinceau.drawRect(j*large,i*large,40,40);
                                }
                                t++;
                                nbr++;
                        }

                        x++;
                }
                secondPinceau.setColor(Color.green);
                secondPinceau.fillRect(ye,xe,40,40);
                secondPinceau.setColor(Color.black);
                secondPinceau.drawRect(ye,xe,40,40);
                secondPinceau.setColor(Color.red);
                secondPinceau.fillRect(ys,xs,40,40);
                secondPinceau.setColor(Color.black);
                secondPinceau.drawRect(ys,xs,40,40);

	
		

	}
}