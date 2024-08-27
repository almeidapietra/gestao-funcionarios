public class EnsinoBasico extends Funcionario {
    private String escola;

    public EnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
        calcularRenda();
    }

    @Override
    public void calcularRenda() {
        rendaTotal = rendaBase * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola: " + escola;
    }
}