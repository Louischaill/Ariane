        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
              
        public class Choix extends JFrame implements ActionListener{
        	private JButton bouton1 = new JButton("Creer une grille");
            private JButton bouton2 = new JButton("Charger une grille existante");
        	private GridLayout gestionnaire = new GridLayout(2, 1);
        	private JPanel container = new JPanel();

           	public Choix(){
            	
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
                        this.dispose();
    	            	FenCrea crea = new FenCrea();


    	        	}
                    if(arg0.getSource() == bouton2){

                        JFile test = new JFile();
                        this.dispose();
                        

                    }

    	        }
            
        }
