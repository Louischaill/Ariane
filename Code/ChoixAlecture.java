import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
    public class ChoixAlecture extends JFrame implements ActionListener{
        	private JButton bouton1 = new JButton("A.Aleatoire");
            private JButton bouton2 = new JButton("A.Deterministe");
        	private GridLayout gestionnaire = new GridLayout(1, 3);
        	private JPanel container = new JPanel();
            private int tab[]=null;
            private int sauvx,sauvy,taille;

                       /**
    
         * @param  bouton1,bouton2 choix de l'algorithme
        * @param  sauvx,sauvy,taille,tab thesee, sortie et taille du tableau, tableau d'origine 
         * @param direction  indique si l'on va au nord est ouest sud 
         * @param JLabel consignes
         choix == permet de choisir ce que l'on veut creer ou charger 
        
         */

           	public ChoixAlecture(int []tab, int sauvx,int  sauvy, int taille){
            	
                this.setSize(500,500);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(gestionnaire);


                this.taille=taille;
                this.sauvx=sauvx;
                this.sauvy=sauvy;
                this.tab=tab;

     			bouton1.addActionListener(this);
     			container.add(bouton1);
                bouton2.addActionListener(this);
                container.add(bouton2);
     			this.setContentPane(container);
     			this.setVisible(true);

     		}

     			public void actionPerformed(ActionEvent arg0) {

    	            if(arg0.getSource() == bouton1){
                        System.out.println("fenman");
                        FenManAuto choix = new  FenManAuto(tab, sauvx, sauvy, taille);
                        this.dispose();

    	        	}
                    if(arg0.getSource() == bouton2){

                        FenDeterchoix automan = new FenDeterchoix(tab,sauvx,sauvy,taille);
                        
                        this.dispose();

                    }

    	        }
            
        }
