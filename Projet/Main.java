import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;
             
      public class Main {
        public static void main(String[] args){
                JFrame fenetre = new JFrame();
                fenetre.setSize(200,200);
            fenetre.setLocation(100, 100);
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try {

                FileInputStream image = new FileInputStream("petit.lab");
                  
                int[] details = new int[5];
                 
                details[0] = image.read();
            
                details[1] = image.read();            
                
                details[2] = image.read();              
               
                details[3] = image.read();
  
                details[4] = image.read();
               
                int[] tab = new int[16];
                int i=0,et;
                double[] ava = new double[image.available()];

                for( double j = 0 ; j < ava.length ; j++){
                  
                    int l1 = image.read();

                    for( et = 128 ; et != 0 ; et=et/2){
                   
                      int res = l1 & et;           
                        
                      if( res != 0){                                                                                                                                      
                          tab[i]=1;
                      }else{                  
                          tab[i]=0;
                      }
                      i++;
                    }
                }

                System.out.println(Arrays.toString(details));
                System.out.println(Arrays.toString(tab));


                Fenetre fen = new Fenetre(tab, details);
                fenetre.add(fen);
          
            }catch(IOException e){
              System.err.println("Probleme de lecture");
            }

                
                fenetre.setVisible(true);
            
        }
}