public class Graduacao extends EnsinoMedio {
    private String universidade;

    public Graduacao(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
        calcularRenda();
    }

    @Override
    public void calcularRenda() {
        rendaTotal = rendaBase * 1.10 * 1.50 * 2.00;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}