package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestandoList {

	public static void main(String[] args) {
		// utilizando o Arraylist - coleção de dados 
		
		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite 5 cores:");
		
		for(int indice = 0; indice<5; indice++) {
			System.out.println("Digite a cor:" + indice);
			String cor = leia.nextLine();
		 cores.add(cor);
		}
		System.out.println("\nTodas as cores adicionadas:");
		 for(String cor : cores) {
			 System.out.println(cor);
		 }
		 cores.sort(null);
		 System.out.println("Cores em ordem alfabetica");
		 for(String cor : cores) {
			 System.out.println(cor); 
		 
		 }
		
		
		

	}

}
