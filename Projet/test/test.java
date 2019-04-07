    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.io.*;
    import java.util.*;
             
      public class test {
        public static void main(String[] args){
            JFrame fenetre = new JFrame();
            fenetre.setSize(500,500);
            fenetre.setLocation(100, 100);
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try {

                FileInputStream image = new FileInputStream("petit.lab");
              /*  DataInputStream file = new DataInputStream(image);*/
                  
            /*    byte[] details = new byte[5];  */
                int[] details = new int[5];

                for(int i = 0 ; i < 5 ; i++ ){
                 
                    details[i] = image.read(); /*readByte();*/

                }

                int taille = details[0]*details[0];
                int grille = details[0];
                int[] tab = new int[taille];
                int i=0,et;
                int s=1;
                double[] ava = new double[image.available()/8];


                if(grille == 4){       

                    for( double j = 0 ; j < 2 ; j++){
                      
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

                }

                if(grille==6){     

                for(double j = 0 ; j <  4; j++ ){   /*essai methode available()*/

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
                int l2 = image.read();
                System.out.println(l2);
                int x = 32;
               for( et = 8 ; et != 0 ; et=et/2){
                       
                    int res2= l2 & et;           
                                
                    if( res2 != 0){                                                                                                                                      
                               
                        tab[i]=1;
                    }else{                  
                               
                       tab[i]=0;
                    }
                    i++;
                }
                
            }

            if(grille == 8){       

                    for( double j = 0 ; j < 8 ; j++){
                      
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

            }

            if(grille==10){

                for(double j = 0 ; j <  12; j++ ){   /*essai methode available()*/

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
                int l2 = image.read();
                System.out.println(l2);
                int x = 32;
               for( et = 8 ; et != 0 ; et=et/2){
                       
                    int res2= l2 & et;           
                                
                    if( res2 != 0){                                                                                                                                      
                               
                        tab[i]=1;
                    }else{                  
                               
                       tab[i]=0;
                    }
                    i++;
                }

            }

            System.out.println(Arrays.toString(details));
            System.out.println(Arrays.toString(tab));
            Fenetre2 fen = new Fenetre2(tab, details);
            fenetre.add(fen);



                    
            }catch(IOException e){
              System.err.println("Probleme de lecture");
            }
            fenetre.setVisible(true);
        }
    }