package Exercici2;
import java.util.*;
public class Exercici2_Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Crea una altra llista amb el teu cognom on cada posici� correspongui a una lletra.
  Fusiona les dues llistes en una sola. 
  A m�s, afegeix una posici� amb un espai buit entre la primera i la segona. 
  �s a dir, partim de la llista name i surname i al acabar l�execuci� 
  nom�s tindrem una que es dir� fullName.

  FullName: [�N�, �A�, �M�, �E�, � �, �S�, �U�, �R�, �N�, �A�, �M�, �E�]
*/
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Si us plau, introdueixi el seu nom");
		
		String nom= scn.nextLine();
		
		System.out.println("Si us plau, introdueixi el seu cognom");
		
		String cognom= scn.nextLine();
				
		// convertir ambos strings a arraylist y despu�s sumarlos a un arraylist de un espacio y 
		//con el m�todo  .addAll a la segunda arraylist
		
		List <Character> FullName = new ArrayList <Character>();
		
		for (char e:nom.toCharArray()) 
		{
			char UpperCase = Character.toUpperCase(e);
			FullName.add(UpperCase);
		}
		FullName.add(' ');
		
		for (char e:cognom.toCharArray()) {
			
			char UpperCase = Character.toUpperCase(e);
			FullName.add(UpperCase);
		
		}
		
		System.out.println(FullName);
	}

}
