package loja;

public class Sedam extends Veiculo {

    public Sedam(int codigo) {
        super(codigo, "Sedam " + codigo);
    }

    @Override
    public void alugar() {
        if (isDisponivelParaAlugar()) {
            setAlugado(true);
            System.out.println("Carro Sedã '" + getModelo() + "' alugado.");
        } else {
            System.out.println("Carro Sedã '" + getModelo() + "' já está alugado.");
        }
    }

    @Override
    public void devolver() {
        if (isAlugado()) {
            setAlugado(false);
            System.out.println("Carro Sedã '" + getModelo() + "' devolvido.");
        } else {
            System.out.println("Carro Sedã '" + getModelo() + "' não estava alugado.");
        }
    }
}
