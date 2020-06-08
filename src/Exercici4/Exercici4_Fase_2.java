package Exercici4;

import java.util.*;

public class Exercici4_Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
 Afegirem el nom del plat i després el preu. (1 punt)
 */
	
		
	Scanner scn = new Scanner(System.in);
	
	for (int it=0; it<5;it++) {
		
		System.out.println("Please enter the name of a course in the menu");
		
		Exercici4_Fase_1.Menu[it]=scn.nextLine();
		
		System.out.println("Please enter the course's price");
		
		Exercici4_Fase_1.Price[it]=scn.nextDouble();
		
		scn.nextLine();
		
	}

	
	/* Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, 
 guardarem la informació en una List fent servir un bucle while. (1 punt)
 */
/*Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), 
per tant haureu de crear un altre variable int per guardar la informació. (1 punt)
*/
		System.out.println("Today in menu:");
		
		int it=0;
		
		while (it<5){
			
			System.out.println("Course "+(it+1)+" : "+Exercici4_Fase_1.Menu[it]+" "+Exercici4_Fase_1.Price[it]);
			
			it++;	
		}
		
		it=0;
		
		ArrayList <String> Order=new ArrayList <String>();	
		
		int numOrder=1; //counter for courses, assumption: at least a first order
		
		boolean nextOrder=true; //to rule the while loop
		
		System.out.println("What you would like to have today");
		
		Order.add(scn.nextLine());
		
		do {
			
			System.out.println("Anything else?");
			
			System.out.println("Y/N");
			
			nextOrder=(scn.nextLine().equalsIgnoreCase("Y") ? true : false);
			
			if (nextOrder==true) {
				
				System.out.println("What should it be?");
				
				Order.add(scn.nextLine());
			
				numOrder++;
			}
			
		} while (nextOrder!=false);
		
	}

}
