package Exercici2;
import java.util.*;
public class Exercici2_Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Canvia la taula per una llista (List<Character>)
		
		char[] nom = {'R','a','q','u','3','l'};
		List <Character> nomAList = new ArrayList<Character>();
		for (char c:nom) {
			nomAList.add(c);
		}

//Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.	
//Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
		
		ArrayList <Character> vocals=new ArrayList <Character>(5);
		
		vocals.add('a');
		vocals.add('e');
		vocals.add('i');
		vocals.add('o');
		vocals.add('u');
		vocals.add('A');
		vocals.add('E');
		vocals.add('I');
		vocals.add('O');
		vocals.add('U');
		vocals.add('ä');
		vocals.add('ö');
		vocals.add('ü');
		vocals.add('Ä');
		vocals.add('Ö');
		vocals.add('Ü');
		vocals.add('á');
		vocals.add('é');
		vocals.add('í');
		vocals.add('ó');
		vocals.add('ú');
		vocals.add('Á');
		vocals.add('É');
		vocals.add('Í');
		vocals.add('à');
		vocals.add('è');
		vocals.add('ì');
		vocals.add('ò');
		vocals.add('ù');
		vocals.add('À');
		vocals.add('È');
		vocals.add('Ì');
		vocals.add('Ò');
		vocals.add('Ù');
		
		for (char e:nom) {
			
			if (vocals.contains(e)) {
				System.out.print("VOCAL ");
			}else {System.out.print("CONSONANT ");
			}
			
		}
		System.out.println();
//Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.	
		
		for (char e:nom) {
			
			if (vocals.contains(e)) {
				
				System.out.print("VOCAL ");
				
			}else if (Character.isDigit(e)) {
				
				System.out.print("‘Els noms de persones no contenen números!’");
				
			}else {System.out.print("CONSONANT ");
			}
		}
		System.out.println();
	}

}

	