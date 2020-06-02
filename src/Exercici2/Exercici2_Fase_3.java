package Exercici2;
import java.util.*;
public class Exercici2_Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
        HashMap <Character, Integer> lletresMap = new HashMap <Character, Integer> ();
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Si us plau, introdueixi el seu nom");
        
        String usuariNom = scann.nextLine();
        
        for (char c:usuariNom.toCharArray()) {
        	
        	if (lletresMap.containsKey(c)) {
        		
        		lletresMap.put(c, lletresMap.get(c)+1);
        		
        	}
        	
        	else {lletresMap.put(c,1);
        	
        	}
        	
        }
        System.out.println(lletresMap.entrySet());

	}

}
