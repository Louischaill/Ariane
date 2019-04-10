    import java.io.*;
    import java.util.*;
    import java.lang.*;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import javax.swing.JComponent;
    import java.awt.*;

    public class GrilleCrea extends JComponent{

    	private int[] tab = null;
    	private int taille;

    	public GrilleCrea(int[] tab, int taille ){
    		super();
    		this.tab=tab;
    		this.taille=taille;
    		
    	}
  
    	@Override
    	public void paintComponent(Graphics pinceau){
    		Graphics secondPinceau = pinceau.create();
    		secondPinceau.setColor(Color.white);
    		secondPinceau.fillRect(0,0,this.getWidth(),this.getHeight());
    		int large = 40;
            int nbr = 0;

    		for(int j = 0 ; j < taille ;j=j+1){
		
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
                    nbr ++;
        		}

    	    } 
    }
}
