import java.io.*;
import java.util.*;
import java.JComponent.*;
public class test implements JComponent{
	public static void main(String[] args){
	
	try {
	    
	    FileInputStream image = new FileInputStream("sauvegarde.data");
        DataInputStream d = new DataInputStream(image);
        
        int ligne = d.read();
        System.out.println(ligne);/* sors 49 a la place de 148*/

	    int[] tab = new int[8];
	    int i,et;

	    for(i= 0, et = 128 ; et != 0 ; i ++ ,et=et/2){

	    	int res = 148 & et;           /*a la place de 148 mettre ce qu'il y a ds le fichier*/
	    	
	    	if( res != 0){
	    		System.out.println(1);
	    		tab[i]=1;
	    	}else{
	    		System.out.println(0);
	    		tab[i]=0;
	    	}
	    }
	    System.out.println(Arrays.toString(tab));
	    	
	}catch(IOException e){
		System.err.println("Probleme de lecture");
	}

	/*@Override
	public void paintComponent(Graphics pinceau){
		Graphics secondPinceau = pinceau.create();
		secondPinceau.setColor(Color.white);
		secondPinceau.fillRect(0,0,100,100);

		for(int j = 0 ; i<8 ;i++){
			if(tab[j]==0){
				secondPinceau.setColor(Color.white);
				secondPinceau.fillRect(0,0,10,10);
			}else{
				secondPinceau.setColor(Color.black);
				secondPinceau.fillRect(0,0,10,10);
			}
		}

	}*/

}
}