package loja;

import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository {
	private List<Veiculo> listaCarros;

	public VeiculoRepositoryImpl(List<Veiculo> listaCarros) {
		this.listaCarros = listaCarros;
	}

	@Override
	public void adicionarVeiculo(Veiculo veiculo) {
		listaCarros.add(veiculo);
	}

	@Override
	public void removerVeiculo(Veiculo veiculo) {
		listaCarros.remove(veiculo);
	}

	@Override
	public Veiculo buscarVeiculo(String modelo) {
		for (Veiculo veiculo : listaCarros) {
			if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
				return veiculo;
			}
		}
		return null;
	}

	@Override
	public void listarVeiculos() {
		System.out.println("\nLista de Veículos:");
		for (Veiculo veiculo : listaCarros) {
			System.out.println(veiculo.getModelo());
		}
		System.out.println();
	}

	@Override
	public void listarCarrosDisponiveis() {
		System.out.println("\nCarros Disponíveis para Aluguel:");
		for (Veiculo carro : listaCarros) {
			if (!carro.isAlugado()) {
				System.out.println(carro.getModelo());
			}
		}
		System.out.println();
	}

	@Override
	public Veiculo buscarCarroPorCodigo(int codigo) {
		for (Veiculo carro : listaCarros) {
			if (carro.getCodigo() == codigo) {
				return carro;
			}
		}
		return null; // Retorna null se o carro não for encontrado
	}
}
