
 import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
              
        public class FenDeterchoix extends JFrame implements ActionListener{
        	private JButton bouton1 = new JButton("Mode Manuel");
            private JButton bouton2 = new JButton("Mode Automatique");
        	private GridLayout gestionnaire = new GridLayout(2, 1);
        	private JPanel container = new JPanel();
        	private int sauvx,sauvy,taille;
        	private int[] tab; 

           	public FenDeterchoix(int[] tab, int sauvx, int sauvy, int taille){
            	
				this.tab=tab;
				this.sauvx=sauvx;
				this.sauvy=sauvy;
				this.taille=taille;

                this.setSize(500,500);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(null);

     			bouton1.addActionListener(this);
     			container.add(bouton1);
                bouton2.addActionListener(this);
                container.add(bouton2);
     			this.setContentPane(container);
     			this.setVisible(true);

     		}

     			public void actionPerformed(ActionEvent arg0) {
    	            if(arg0.getSource() == bouton1){
                       
                        ManuelDeter x = new ManuelDeter(tab ,sauvx,sauvy, taille);
                        this.dispose();
    	        	}
                    if(arg0.getSource() == bouton2){
                        Analyse analyse = new Analyse(tab ,sauvx, sauvy,taille);
                        AlgoDeterministe ad = new AlgoDeterministe(analyse,sauvx,sauvy,taille);
                        this.dispose();
                        

                    }

    	        }
            
        }
