    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;

    public class GrilleTest extends JFrame{
        private int[] tab=null;
        private int taille;

    	public GrilleTest(int taille){
    		

            this.setSize(this.getWidth(),this.getHeight());
            this.setLocation(100, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        	GrilleCrea crea = new GrilleCrea(tab,taille);
            this.add(crea);
            this.setVisible(true);

    	}
    		

    	
    }
