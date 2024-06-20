package projeto_final_bloco_01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import loja.Hatch;
import loja.Sedam;
import loja.Veiculo;
import loja.util.Cores;
import loja.VeiculoRepository;
import loja.VeiculoRepositoryImpl;

public class Menu {

	public static void main(String[] args) {

		int opcao, codigo = 0;

		Scanner leia = new Scanner(System.in);

		List<Veiculo> listaCarros = new ArrayList<>();

		listaCarros.add(new Sedam(1));
		listaCarros.add(new Sedam(2));
		listaCarros.add(new Sedam(3));

		listaCarros.add(new Hatch(4));
		listaCarros.add(new Hatch(5));
		listaCarros.add(new Hatch(6));

		VeiculoRepository repository = new VeiculoRepositoryImpl(listaCarros);

		System.out.println("\nAlugar Carro\n");

		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Aluguel de Carros                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Alugar Carros                        ");
			System.out.println("            2 - Devolver Carros                      ");
			System.out.println("            3 - Listar Carros                        ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("*****************************************************");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 4) {
				System.out.println("\nObrigada pela preferência!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("\nQual modelo de carro deseja alugar?");
				System.out.println("1 - Sedam");
				System.out.println("2 - Hatch");
				int tipoCarro = leia.nextInt();
				leia.nextLine();

				if (tipoCarro == 1) {
					System.out.println("Digite o código do sedan que deseja alugar:");
					codigo = leia.nextInt();
					Veiculo sedan = repository.buscarCarroPorCodigo(codigo);
					if (sedan != null && !sedan.isAlugado()) {
						sedan.alugar();
						System.out.println("Carro Sedan de código " + codigo + " alugado com sucesso!");
					} else {
						System.out.println("Carro não disponível para aluguel ou já está alugado.");
					}
				} else if (tipoCarro == 2) {
					System.out.println("Digite o código do hatch que deseja alugar:");
					codigo = leia.nextInt();
					Veiculo hatch = repository.buscarCarroPorCodigo(codigo);
					if (hatch != null && !hatch.isAlugado()) {
						hatch.alugar();
						System.out.println("Carro Hatch de código " + codigo + " alugado com sucesso!");
					} else {
						System.out.println("Carro não disponível para aluguel ou já está alugado.");
					}
				} else {
					System.out.println("Opção inválida.");
				}
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o código do carro que deseja devolver:");
				codigo = leia.nextInt();
				Veiculo carroDevolvido = repository.buscarCarroPorCodigo(codigo);
				if (carroDevolvido != null && carroDevolvido.isAlugado()) {
					carroDevolvido.devolver();
					System.out.println("Carro de código " + codigo + " devolvido com sucesso!");
				} else {
					System.out.println("Carro não encontrado ou não está alugado.");
				}
				break;
			case 3:
				repository.listarVeiculos();
				break;
			default:
				System.out.println("\nOpção não encontrada!");
			}
		}
	}
}
