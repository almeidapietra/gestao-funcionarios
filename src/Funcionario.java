public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBase = 1000.00;
    protected double rendaTotal;
    private double comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaTotal = rendaBase;
    }

    public void calcularRenda() {

    }

    public void adicionarComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getRendaTotal() {
        return rendaTotal + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda Total: R$ " + getRendaTotal();
    }
}