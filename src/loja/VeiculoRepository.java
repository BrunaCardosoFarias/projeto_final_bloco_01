package loja;

public interface VeiculoRepository {
	void adicionarVeiculo(Veiculo veiculo);

	void removerVeiculo(Veiculo veiculo);

	Veiculo buscarVeiculo(String modelo);

	void listarVeiculos();

	void listarCarrosDisponiveis();

	Veiculo buscarCarroPorCodigo(int codigo);
}
