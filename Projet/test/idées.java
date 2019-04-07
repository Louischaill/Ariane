 for(int j = 0 ; j < image.available(); j++ ){

                    int nbr = file.read(); /*lecture*/
                    String conv = Integer.toBinaryString(nbr);    /*met le binaire dans un string*/
                    System.out.println(conv);

                    for(int sub = 0 ; sub < conv.length() ; sub++){

                        String str = conv.substring(sub,s);
                        System.out.println(str);
                        tab[i] = Integer.parseInt(str);
                        i++;
                        s++;
                  }

                }
                    int nbr = file.read(); /*lecture*/
                    String conv = Integer.toBinaryString(nbr);    /*met le binaire dans un string*/
                    System.out.println(conv);

                }
                    
                System.out.println(Arrays.toString(tab));
                  /*  int nbr = 131;
                    String conv = Integer.toBinaryString(nbr);
                    System.out.println(conv);*/

