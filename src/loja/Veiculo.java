package loja;

public abstract class Veiculo {
    protected boolean alugado;
    protected int codigo;
    protected String modelo;

    public Veiculo(int codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.alugado = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void alugar();

    public abstract void devolver();

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public boolean isDisponivelParaAlugar() {
        return !alugado;
    }
}
