public class FuncionarioHorista implements Funcionario {

    // Métodos double e int para o salário por hora e horas trabalhadas
    public double salarioPorHora;
    public int horasTrabalhadas;

    // Construção para inicializar o salário por hora e todas as horas trabalhadas
    public FuncionarioHorista(double salarioPorHora, int horasTrabalhadas) {
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Calcular Bonus, calculando 10% do salário anual
    @Override
    public double calcularBonus() {
        double salarioAnual = salarioPorHora * horasTrabalhadas * 12; // 12= meses
        return salarioAnual * 0.10;
    }
}   