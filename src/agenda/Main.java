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
		List<Agenda> ag = new ArrayList<>();
		
		int opcao = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("(1) – Inserir um contato");
			System.out.println("(2) – Remover um contato");
			System.out.println("(3) – Editar um contato");
			System.out.println("(4) - Sair");
			System.out.print("Informe a opção desejada: ");
			
			try {
				opcao = Integer.valueOf(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida!!!");
				opcao = 4;
			}
			
			switch (opcao) {
			case 1:
					
					Agenda agenda = new Agenda();
					
					System.out.println("Informe o código: ");
					agenda.setCodigo(in.next());
					
					System.out.print("Informe o telefone: ");
					agenda.setTelefone(in.next());
					
					System.out.print("Informe a idade: ");
					agenda.setIdade(in.nextInt());
					
					
					System.out.println("Contato adicionado");
	                    
	                System.out.println("-----------------------------------");
					
					ag.add(agenda);
				
				break;

			

			default:
				System.out.println("Opção inválida!!!");
				break;
			}			
		} while (opcao != 4);
		
		in.close();

	}

}
