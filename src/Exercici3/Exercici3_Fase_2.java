package Exercici3;

import java.util.*;

public class Exercici3_Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str1="Barcelona";
	String str2="Madrid";
	String str3="Valencia";
	String str4="Malaga";
	String str5="Cadis";
	String str6="Santander";
		
//Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)

	 ArrayList <String> ciutatsL = new ArrayList <>(Arrays.asList(str1,str2,str3,str4,str5,str6));
		
//Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)

	 Collections.sort(ciutatsL);
	 
	 for (String c:ciutatsL) {
		 
		 System.out.println(c);
	 }


	}

}
