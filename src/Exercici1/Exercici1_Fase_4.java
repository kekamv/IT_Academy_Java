package Exercici1;
import javax.swing.*;
import java.util.*;
public class Exercici1_Fase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Creeu una variable on juntareu el nom i els cognoms (tot en una variable) 
  i un altre on juntareu la data de naixement separada per �/� (tot en una variable). 
  Mostreu per consola les variables del nom complet, la data de naixement i 
  si l�any de naixement es de trasp�s o no.*/
		
		//Exemple de sortida per consola:
		
	String nom="Raquel";
	String cognom1="Mart�n";
	String cognom2= "Vicente";
	
	String nomComplet= nom+" "+cognom1 +" " +cognom2;
	System.out.println("El meu nom �s "+nomComplet);
		//El meu nom �s Juan Perez Gonzalez
	
	
	String diaNaix= JOptionPane.showInputDialog("Introdueix en n�mero el dia de naixement dd");
	String mesNaix= JOptionPane.showInputDialog("Introdueix en n�mero el mes de naixement MM");
	String anyNaix= JOptionPane.showInputDialog("Introdueix en n�mero l'any de naixement YYYY");
	
	if (diaNaix.length()<2) {
		diaNaix="0"+diaNaix;
	}
	
	if (mesNaix.length()<2) {
		mesNaix="0"+mesNaix;
	}
	
	String dataNaix=diaNaix+"/"+mesNaix+"/"+anyNaix;
	
	System.out.println("Vaig n�ixer el "+dataNaix);
		//Vaig n�ixer el 01/01/1979
		
	final int base_anyTraspas=1948; //primer any de trasp�s de refer�ncia
	
	boolean anyNaixementTps; //si l'any de naixement �s o no de trasp�s
	
	if ((Integer.parseInt(anyNaix) - base_anyTraspas)%4 == 0) {
		
		anyNaixementTps= true;
	}
	else {
		
		anyNaixementTps= false;
	}
	
	int anyNaixTpsInt = anyNaixementTps ? 1 :0; //converteix booleans en enters
	
	switch (anyNaixTpsInt) {
	
	case 1:
		System.out.println("/El meu any de naixement �s de trasp�s.");
		break;
		
	case 0:
		System.out.println("El meu any de naixement no �s de trasp�s");
		break;
	}
	//El meu any de naixement �s de trasp�s.

	}

}
	
	
