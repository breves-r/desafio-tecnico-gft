package telefoneEncriptado;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TelefoneEncriptado {
	/*
	    ABC -> 2
		DEF -> 3
		GHI -> 4
		JKL -> 5
		MNO -> 6
		PQRS -> 7
		TUV -> 8
		WXYZ -> 9
	 */

	public static void main(String[] args) {
		
		List<String> dois = Arrays.asList("A","B","C");
		List<String> tres = Arrays.asList("D","E","F");
		List<String> quatro = Arrays.asList("G","H","I");
		List<String> cinco = Arrays.asList("J","K","L");
		List<String> seis = Arrays.asList("M","N","O");
		List<String> sete = Arrays.asList("P","Q","R","S");
		List<String> oito = Arrays.asList("T","U","V");
		List<String> nove = Arrays.asList("W","X","Y","Z");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com a expressão:");
		
		String exp = in.next();
		
		if(exp.length()<1 || exp.length()>30) {
			System.out.println("A expressão deve ser maior que 0 e menor que 30");
		}else {
			
			String[] letras = exp.toUpperCase().split("");
		
			for(int i = 0; i<letras.length; i++) {
				
				if(letras[i].equals("1")) {
					System.out.print("1");
					
				}else if(letras[i].equals("0")) {
					System.out.print("0");
					
				}else if(dois.contains(letras[i])) {
					System.out.print("2");
					
				}else if(tres.contains(letras[i])) {
					System.out.print("3");
					
				}else if(quatro.contains(letras[i])) {
					System.out.print("4");
					
				}else if(cinco.contains(letras[i])) {
					System.out.print("5");
					
				}else if(seis.contains(letras[i])) {
					System.out.print("6");
					
				}else if(sete.contains(letras[i])) {
					System.out.print("7");
					
				}else if(oito.contains(letras[i])) {
					System.out.print("8");
					
				}else if(nove.contains(letras[i])) {
					System.out.print("9");
					
				}else if(letras[i].equals("-")){
					System.out.print("-");
				}
				
				
			}
		}
	}

}
