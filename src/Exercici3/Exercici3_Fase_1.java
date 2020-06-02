package Exercici3;
import java.util.*;
public class Exercici3_Fase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Crea sis variables tipu string buides
	
	String str1="";
	String str2="";
	String str3="";
	String str4="";
	String str5="";
	String str6="";
	
	
//Demana per consola que s’introdueixin els noms
	
	System.out.println("Introdueix el nom d'una ciutat");

//Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat	
	
	Scanner scn = new Scanner(System.in);
	str1=scn.nextLine();
	
	System.out.println("Introdueix el nom d'una ciutat");
	str2=scn.nextLine();
		
	System.out.println("Introdueix el nom d'una ciutat");
	str3=scn.nextLine();
	
	System.out.println("Introdueix el nom d'una ciutat");
	str4=scn.nextLine();
	
	System.out.println("Introdueix el nom d'una ciutat");
	str5=scn.nextLine();
	
	System.out.println("Introdueix el nom d'una ciutat");
	str6=scn.nextLine();
	
//Mostra per consola el nom de les 6 ciutats. (0,5 punts)

	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	}

}
