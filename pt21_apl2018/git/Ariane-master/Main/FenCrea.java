 import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.util.*;
    public class FenCrea extends JFrame implements ActionListener{
        	private JButton bouton1 = new JButton("A.Aleatoire");
            private JButton bouton2 = new JButton("A.Deterministe");
            private JTextField area = new JTextField();
        	private GridLayout gestionnaire = new GridLayout(1, 3);
        	private JPanel container = new JPanel();
            private int tab[]=null;

           	public FenCrea(){
            	
                this.setSize(500,500);
                this.setLocation(100, 100);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setLayout(null);

                area.addActionListener(this);
                area.setPreferredSize(new Dimension(100, 20));
                container.add(area);

     			bouton1.addActionListener(this);
     			container.add(bouton1);
                bouton2.addActionListener(this);
                container.add(bouton2);
     			this.setContentPane(container);
     			this.setVisible(true);

     		}

     			public void actionPerformed(ActionEvent arg0) {
                    String r= area.getText();
                    int taille =Integer.parseInt(r);

    	            if(arg0.getSource() == bouton1){

                        GrilleTest grille = new GrilleTest(taille,1);
    	            	System.out.println(taille);
                        this.dispose();

    	        	}
                    if(arg0.getSource() == bouton2){

                        GrilleTest grille = new GrilleTest(taille,2);
                        this.dispose();
                        

                    }

    	        }
            
        }
