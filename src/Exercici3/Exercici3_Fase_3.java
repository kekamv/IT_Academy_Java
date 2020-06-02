package Exercici3;

import java.util.*;

public class Exercici3_Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Cambieu les vocals “a” dels noms de les ciutats per el numero 4 
i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)*/
		
	ArrayList <String> ciutatsL = new ArrayList <>(Arrays.asList("Barcelona","Madrid","Valencia","Malaga","Cadis","Santander"));	 
	
	ArrayList <String> ArrayCiutatsModificades = new ArrayList <String>();

	
	for (String c:ciutatsL) {
		
		if (c.contains("a")) {
		
		c =c.replace('a', '4');
		
		ArrayCiutatsModificades.add(c);
	
		
		}
	
	}

//Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
	
	Collections.sort(ArrayCiutatsModificades);
	
	System.out.println(ciutatsL);
	
	System.out.println(ArrayCiutatsModificades);

	}


}