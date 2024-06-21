package projeto_final_bloco_01;



import java.util.InputMismatchException;
import java.util.Scanner;

import loja.util.Cores;

public abstract class Menu {

	public static void main(String[] args) {

		String sedam, hatch, cor;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEscolha do Carro\n");

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("              Escolha seu Carro dos Sonhos           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Alugar carro                         ");
			System.out.println("            2 - Devolver carro                       ");
			System.out.println("            3 - Sair                                 ");
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			if (opcao == 3) {
				System.out.println("\nObrigada pela sua preferência");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Qual opção você deseja alugar?");

				break;
			case 2:
				System.out.println("Qual o código do carro a ser devolvido?");

				break;
			default:
				System.out.println("Opção Inválida");

			}
		}

	}

	public static void sobre() {
		System.out.println("\n********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("brunacardosodefarias@gmail.com");
		System.out.println("*********************************************************");
	}

}
