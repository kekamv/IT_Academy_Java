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
//Al bucle, si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONTANT�.
		
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
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		vocals.add('�');
		
		for (char e:nom) {
			
			if (vocals.contains(e)) {
				System.out.print("VOCAL ");
			}else {System.out.print("CONSONANT ");
			}
			
		}
		System.out.println();
//Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�.	
		
		for (char e:nom) {
			
			if (vocals.contains(e)) {
				
				System.out.print("VOCAL ");
				
			}else if (Character.isDigit(e)) {
				
				System.out.print("�Els noms de persones no contenen n�meros!�");
				
			}else {System.out.print("CONSONANT ");
			}
		}
		System.out.println();
	}

}

	