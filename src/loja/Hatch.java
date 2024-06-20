package loja;

public class Hatch extends Veiculo {

    public Hatch(int codigo) {
        super(codigo, "Hatch " + codigo);
    }

    @Override
    public void alugar() {
        if (isDisponivelParaAlugar()) {
            setAlugado(true);
            System.out.println("Carro Hatch '" + getModelo() + "' alugado.");
        } else {
            System.out.println("Carro Hatch '" + getModelo() + "' já está alugado.");
        }
    }

    @Override
    public void devolver() {
        if (isAlugado()) {
            setAlugado(false);
            System.out.println("Carro Hatch '" + getModelo() + "' devolvido.");
        } else {
            System.out.println("Carro Hatch '" + getModelo() + "' não estava alugado.");
        }
    }
}
