package Exercici3;

import java.util.*;

public class Exercici3_Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/*Creeu un nou array per cada una de les ciutats que tenim. 
La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)*/
 
	ArrayList <String> ciutatsL = new ArrayList <>(Arrays.asList("Barcelona","Madrid","Valencia","Malaga","Cadis","Santander"));	 
	
	
	char[] Barcelona = new char [ciutatsL.get(0).length()];
	char[] Madrid = new char [ciutatsL.get(1).length()];
	char[] Valencia = new char [ciutatsL.get(2).length()];
	char[] Malaga = new char [ciutatsL.get(3).length()];
	char[] Cadis = new char [ciutatsL.get(4).length()];
	char[] Santander = new char [ciutatsL.get(5).length()];
		
		
//Ompliu els nous arrays lletra per lletra.(2 punts)
	

	Barcelona=ciutatsL.get(0).toCharArray();
	Madrid=ciutatsL.get(1).toCharArray();
	Valencia=ciutatsL.get(2).toCharArray();
	Malaga=ciutatsL.get(3).toCharArray();
	Cadis=ciutatsL.get(4).toCharArray();
	Santander=ciutatsL.get(5).toCharArray();

		
//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
	
	for (int i=Barcelona.length-1;i>=0;i--) {
	
		System.out.print(Barcelona[i]);
	}
	System.out.println();


	for (int i=Madrid.length-1; i>=0; i--) {
	
		System.out.print(Madrid[i]);
	
	}
	System.out.println();
	
	for (int i=Valencia.length-1; i>=0; i--) {
		
		System.out.print(Valencia[i]);
	}
	System.out.println();
	
	for (int i=Malaga.length-1; i>=0; i--) {
		
		System.out.print(Malaga[i]);
	}
	System.out.println();
	
	for (int i=Cadis.length-1; i>=0; i--) {
		
		System.out.print(Cadis[i]);
	}
	System.out.println();
	
	for (int i=Santander.length-1; i>=0; i--) {
		
		System.out.print(Santander[i]);
	}
	System.out.println();
	
	}

}
