package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {

		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nAlugar Carro\n");

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "**************************************************************");
			System.out.println("                                                     ");
			System.out.println("               Aluguel de Carros                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Alugar Carros                         ");
			System.out.println("            2 - Devolver Carros                       ");
			System.out.println("            3 - Sair                                  ");
			System.out.println("*****************************************************");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 3) {
				System.out.println("\nObrigada pela preferência!");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("\nQual modelo de carro deseja digite 1 para sedam e 2 para hatch!");

			case 2:
				System.out.println("\nDigite o código do carro alugado!");

			default:
				System.out.println("\nOpção não encontrada!");

			}

		}
	}
}
