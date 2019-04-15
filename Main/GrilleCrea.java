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
            private int nbrCases;
           /* private Image img;*/

            public GrilleCrea(int[] tab, int taille){
                super();
                this.tab=tab;
                this.taille=taille;
                nbrCases=taille*taille;
                /*img = Toolkit.getDefaultToolkit().getImage("pb.jpg");*/
                
            }
            public void base(int i){
               
                if(tab[i]==0 ){
                    this.tab[i]=1;
                }else{
                    if(tab[i]==1){
                        this.tab[i]=0;
                    }else {
                        if(tab[i]==2){
                            this.tab[i]=0;
                           
                        }else {
                            if(tab[i]==3){
                                this.tab[i]=0;
                                
                            }
                        }
                    }
                }
            }
            public void entree(int i){

                if(tab[i]==0 ){
                    this.tab[i]=2;
                }else{
                    this.tab[i]=0;
                }      
            }
            public void sortie(int i){

                if(tab[i]==0 ){
                    this.tab[i]=3;
                }else{
                    this.tab[i]=0;
                }                
            }

      
            @Override
            public void paintComponent(Graphics pinceau){
                Graphics secondPinceau = pinceau.create();
                secondPinceau.setColor(Color.white);
                secondPinceau.fillRect(0,0,taille*40,this.getHeight());
                int large = 40;
                int nbr = 0;

                for(int j = 0 ; j < taille ;j=j+1){
            
                    for( int i = 0 ; i < taille ;i=i+1){
                        if(tab[nbr]==0){
                            secondPinceau.setColor(Color.white);
                            secondPinceau.fillRect(j*large,i*large,40,40);
                            secondPinceau.setColor(Color.black);
                            secondPinceau.drawRect(j*large,i*large,40,40);
                        }if(tab[nbr]==1){
                            secondPinceau.setColor(Color.black);
                            secondPinceau.fillRect(j*large,i*large,40,40);
                            secondPinceau.drawRect(j*large,i*large,40,40);
                        }if(tab[nbr]== 3){
                            secondPinceau.setColor(Color.green);
                            secondPinceau.fillRect(j*large,i*large,40,40);
                            secondPinceau.setColor(Color.black);
                            secondPinceau.drawRect(j*large,i*large,40,40);
                        } if(tab[nbr]==2){
                            secondPinceau.setColor(Color.red);
                            secondPinceau.fillRect(j*large,i*large,40,40);
                            secondPinceau.setColor(Color.black);
                            secondPinceau.drawRect(j*large,i*large,40,40);
                          /*  secondPinceau.drawImage(img, j*large, i*large, this);*/
                        }
                        nbr ++;
                    }

                }

                if(taille%2==0){
                    secondPinceau.setColor(Color.red);
                    secondPinceau.fillRect((taille+1)*40,((taille-2)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+1)*40,((taille-2)*40)/2,40,40);
                   /* secondPinceau.drawImage(img,(taille+1)*40, ((taille-2)*40)/2, this);*/

                    secondPinceau.setColor(Color.green);
                    secondPinceau.fillRect((taille+2)*40,((taille-2)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+2)*40,((taille-2)*40)/2,40,40);

                     secondPinceau.setColor(Color.blue);
                    secondPinceau.fillRect((taille+3)*40,((taille-2)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+3)*40,((taille-2)*40)/2,40,40);

                }else{
                    secondPinceau.setColor(Color.red);
                    secondPinceau.fillRect((taille+1)*40,((taille-3)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+1)*40,((taille-3)*40)/2,40,40);
                 /* secondPinceau.drawImage(img,(taille+1)*40, ((taille-2)*40)/2, this);*/

                    secondPinceau.setColor(Color.green);
                    secondPinceau.fillRect((taille+2)*40,((taille-3)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+2)*40,((taille-3)*40)/2,40,40);

                     secondPinceau.setColor(Color.blue);
                    secondPinceau.fillRect((taille+3)*40,((taille-3)*40)/2,40,40);
                    secondPinceau.setColor(Color.black);
                    secondPinceau.drawRect((taille+3)*40,((taille-3)*40)/2,40,40);
                }
        }

    }

