package loja;

import java.util.List;
import java.util.Optional;

public class Controller implements VeiculoRepository {
    private List<Veiculo> listaCarros;

    public Controller(List<Veiculo> listaCarros) {
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
        Optional<Veiculo> veiculoEncontrado = listaCarros.stream()
                .filter(v -> v.getModelo().equalsIgnoreCase(modelo))
                .findFirst();
        return veiculoEncontrado.orElse(null);
    }

    @Override
    public void listarVeiculos() {
        System.out.println("\nLista de Veículos:");
        listaCarros.forEach(v -> System.out.println(v.getModelo()));
        System.out.println();
    }

    @Override
    public void listarCarrosDisponiveis() {
        System.out.println("\nCarros Disponíveis para Aluguel:");
        listaCarros.stream()
                .filter(v -> !v.isAlugado())
                .forEach(v -> System.out.println(v.getModelo()));
        System.out.println();
    }

    @Override
    public Veiculo buscarCarroPorCodigo(int codigo) {
        Optional<Veiculo> veiculoEncontrado = listaCarros.stream()
                .filter(v -> v.getCodigo() == codigo)
                .findFirst();
        return veiculoEncontrado.orElse(null);
    }
}
