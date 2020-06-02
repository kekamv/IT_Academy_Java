package Exercici1;

public class Exercici1_Fase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Sabent que l’any 1948 es un any de traspàs:
Creeu una constant amb el valor de l’any (1948).*/
		
		final int base_anyTraspas=1948;
		
//Creeu una variable que guardi cada quan hi ha un any de traspàs.
		
		int any_deTraspas;
		
/*Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement 
 i emmagatzemeu el valor resultant en una variable.*/
		
		int m_anys_dT=(1975 - base_anyTraspas)/4;
	
//Mostreu per pantalla el resultat del càlcul.
		
		System.out.println(m_anys_dT);

	}

}
