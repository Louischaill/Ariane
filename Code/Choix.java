        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
              
        public class Choix extends JFrame implements ActionListener{
        	private JButton bouton1 = new JButton("Creer une grille");
            private JButton bouton2 = new JButton("Charger une grille existante");
        	private GridLayout gestionnaire = new GridLayout(3, 1);
        	private JPanel panneau = new JPanel();
            private JLabel texte = new JLabel(" ");

           /**
     
         * @param  bouton1,bouton2 choix creeer une grille ou en charger une 
        
         * @param JLabel consignes
         choix == permet de choisir ce que l'on veut creer ou charger 
        
         */

           	public Choix(){
            	
                this.setSize(500,500);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(gestionnaire);

                this.add(texte, BorderLayout.SOUTH);
                panneau.add(bouton1);
                panneau.add(bouton2);
                this.add(panneau, BorderLayout.SOUTH);
                this.setVisible(true);
                bouton1.addActionListener(this);
                bouton2.addActionListener(this);

     		}

     			public void actionPerformed(ActionEvent arg0) {
    	            if(arg0.getSource() == bouton1){
                        this.dispose();
    	            	FenCrea crea = new FenCrea();


    	        	}
                    if(arg0.getSource() == bouton2){

                        JFile test = new JFile();
                        this.dispose();
                        

                    }

    	        }
            
        }
