package Exercici1;
import javax.swing.*;
public class Exercici1_Fase_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Partint de l’any 1948 heu de fer un bucle for i 
  mostrar els anys de traspàs fins arriba al vostre any de naixement. 
  ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la. */
		
		final int base_anyTraspas=1948;
		
		for (int i=base_anyTraspas; i<=1975;i+=4) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		
/*Creeu una variable bool que sera certa si l’any de naixement és de traspàs 
  o falsa si no ho és.(0,75 punts)*/
		
		int anyNaixement= Integer.parseInt(JOptionPane.showInputDialog("Introdueix l'any de naixement YYYY"));
		
		boolean anyNaixementTps; //si l'any de naixement és o no de traspàs
		
		if ((anyNaixement - base_anyTraspas)%4 == 0) {
			
			anyNaixementTps= true;
		}
		else {
			
			anyNaixementTps= false;
		}
		
 /*En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui,
   en cas de ser falsa mostrareu la frase pertinent. 
   Creeu dues variables string per guardar les frases. (1,5 punts)*/

		int anyNaixTpsInt = anyNaixementTps ? 1 :0; //converteix booleans en enters
		//int myInt = myBoolean ? 1 : 0;
		
		switch (anyNaixTpsInt) {
		
		case 1:
			String anyNaixTpsT= "L'any de naixement és de traspàs";
			System.out.println(anyNaixTpsT);
			break;
			
		case 0:
			String anyNaixTpsF= "L'any de naixement no és de traspàs";
			System.out.println(anyNaixTpsF);
			break;
		
		}
	}

}
