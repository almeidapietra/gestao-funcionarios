public class EnsinoMedio extends EnsinoBasico {
    public EnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
        calcularRenda();
    }

    @Override
    public void calcularRenda() {
        rendaTotal = rendaBase * 1.10 * 1.50;
    }
}