package Exercici1;
import javax.swing.*;
import java.util.*;
public class Exercici1_Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Creeu una variable on juntareu el nom i els cognoms (tot en una variable) 
  i un altre on juntareu la data de naixement separada per “/” (tot en una variable). 
  Mostreu per consola les variables del nom complet, la data de naixement i 
  si l’any de naixement es de traspàs o no.*/
		
		//Exemple de sortida per consola:
		
	String nom="Raquel";
	String cognom1="Martín";
	String cognom2= "Vicente";
	
	String nomComplet= nom+" "+cognom1 +" " +cognom2;
	System.out.println("El meu nom és "+nomComplet);
		//El meu nom és Juan Perez Gonzalez
	
	
	String diaNaix= JOptionPane.showInputDialog("Introdueix en número el dia de naixement dd");
	String mesNaix= JOptionPane.showInputDialog("Introdueix en número el mes de naixement MM");
	String anyNaix= JOptionPane.showInputDialog("Introdueix en número l'any de naixement YYYY");
	
	if (diaNaix.length()<2) {
		diaNaix="0"+diaNaix;
	}
	
	if (mesNaix.length()<2) {
		mesNaix="0"+mesNaix;
	}
	
	String dataNaix=diaNaix+"/"+mesNaix+"/"+anyNaix;
	
	System.out.println("Vaig néixer el "+dataNaix);
		//Vaig néixer el 01/01/1979
		
	final int base_anyTraspas=1948; //primer any de traspàs de referència
	
	boolean anyNaixementTps; //si l'any de naixement és o no de traspàs
	
	if ((Integer.parseInt(anyNaix) - base_anyTraspas)%4 == 0) {
		
		anyNaixementTps= true;
	}
	else {
		
		anyNaixementTps= false;
	}
	
	int anyNaixTpsInt = anyNaixementTps ? 1 :0; //converteix booleans en enters
	
	switch (anyNaixTpsInt) {
	
	case 1:
		System.out.println("/El meu any de naixement és de traspàs.");
		break;
		
	case 0:
		System.out.println("El meu any de naixement no és de traspàs");
		break;
	}
	//El meu any de naixement és de traspàs.

	}

}
	
	
