public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        int i = 0;

        for (; i < 4; i++) {
            funcionarios[i] = new EnsinoBasico("Funcionario" + i, "FB" + i, "Escola" + i);
            funcionarios[i].adicionarComissao(Vendedor.getComissao());
        }

        for (; i < 8; i++) {
            funcionarios[i] = new EnsinoMedio("Funcionario" + i, "FM" + i, "Escola" + i);
            funcionarios[i].adicionarComissao(Supervisor.getComissao());
        }

        for (; i < 10; i++) {
            funcionarios[i] = new Graduacao("Funcionario" + i, "FG" + i, "Escola" + i, "Universidade" + i);
            funcionarios[i].adicionarComissao(Gerente.getComissao());
        }

        double totalSalario = 0;
        double totalBasico = 0, totalMedio = 0, totalGraduacao = 0;

        for (Funcionario f : funcionarios) {
            System.out.println(f);
            totalSalario += f.getRendaTotal();
            if (f instanceof EnsinoBasico) totalBasico += f.getRendaTotal();
            if (f instanceof EnsinoMedio) totalMedio += f.getRendaTotal();
            if (f instanceof Graduacao) totalGraduacao += f.getRendaTotal();
        }

        System.out.println("\nCustos da Empresa:");
        System.out.println("Total com Ensino Básico: R$ " + totalBasico);
        System.out.println("Total com Ensino Médio: R$ " + totalMedio);
        System.out.println("Total com Graduação: R$ " + totalGraduacao);
        System.out.println("Total Geral: R$ " + totalSalario);
    }
}