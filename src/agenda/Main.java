package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	/*
	    (1) – inserir um contato
		(2) – Remover um contato
		(3) – Editar um
	 * */
	

	public static void main(String[] args) {
		List<String> codigo = new ArrayList<>();
		List<String> telefone = new ArrayList<>();
		List<Integer> idade = new ArrayList<>();
		
		int opcao = 0;
		int qtde = 0;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("(1) – Inserir um contato");
			System.out.println("(2) – Remover um contato");
			System.out.println("(3) – Editar um contato");
			System.out.println("(4) - Sair");
			System.out.println("Informe a opção desejada: ");
			
			try {
				opcao = in.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida!!!");
				opcao = 4;
			}
			
			switch (opcao) {
			case 1:
					
					
					System.out.println("Informe o código: ");
					codigo.add(in.next());
					
					System.out.print("Informe o telefone: ");
					telefone.add(in.next());
					
					System.out.print("Informe a idade: ");
					idade.add(in.nextInt());
					
					
					System.out.println("Contato adicionado com o indice " + qtde);
	                    
	                System.out.println("-----------------------------------");
					
					qtde++;
				
				break;

			case 2:
				System.out.println("Informe o indice do contato que deseja excluir: ");
				int idx = in.nextInt();
				codigo.remove(idx);
				telefone.remove(idx);
				idade.remove(idx);
				
				System.out.println("Contato excluído");
				break;


			case 3:
					System.out.println("Informe o indice do contato que deseja editar: ");
					int id = in.nextInt();
	
					if(id >= 0) {
						System.out.println("Informe o novo código: ");
						codigo.set(id, in.next());
							
						System.out.print("Informe o novo telefone: ");
						telefone.set(id, in.next());
							
						System.out.print("Informe a nova idade: ");
						idade.set(id, in.nextInt());
						
					} else {
						System.out.println("O código " + codigo + " é inválido!!");
					}				
					break;

			case 4:
				System.out.println("sair");
				break;

			default:
				System.out.println("Opção inválida!!!");
				break;
			}			
		} while (opcao != 4);
		
		in.close();

	}

}
