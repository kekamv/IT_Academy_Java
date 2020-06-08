package Exercici4;

import java.util.*;

public class Exercici4_Fase_3 {

	public static void main(String[] args) {
		// Copy of Exercici4_Fase_2
		
	Scanner scn = new Scanner(System.in);
	for (int it=0; it<5;it++) {
		System.out.println("Please enter the name of a course in the menu");
		Exercici4_Fase_1.Menu[it]=scn.nextLine();
		System.out.println("Please enter the course's price");
		Exercici4_Fase_1.Price[it]=scn.nextDouble();
		scn.nextLine();	
	}
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
		
		//End Copy of Exercici4_Fase_2
		
/*Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al principi. 
* En el cas que la informació que hem introduït a la List coincideixi amb la del array, 
* haurem de sumar el preu del producte demanat; en el cas contrari haurem de mostrar 
* un missatge que digui que el producte que hem demanat no existeix.	
*/
	int	idx;
	int bc=0;
		
	for (String o:Order) {
		
		if (Arrays.asList(Exercici4_Fase_1.Menu).contains(o) && bc>=0) {
			
			idx=Arrays.asList(Exercici4_Fase_1.Menu).indexOf(o);
			
			Exercici4_Fase_1.total_bill+=Exercici4_Fase_1.Price[idx];
			
			bc++;
			
		} else {
			
			System.out.println("Your order includes a course not available in the menu");
			bc=-1;
			
		}
		if (bc==-1) {
			break;
			}
			
	}
	
	if (bc!=-1) {
		System.out.println("Your bill amounts to "+Exercici4_Fase_1.total_bill+ " euros");
	}
	
			
				
		
		
	}

}




		

