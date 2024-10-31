public class Main {

    public static void main(String[] args) {
        // Criação de um objeto Funcionario Assalariado para instanciar o CalcularBonus
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado();
        System.out.println("Bônus do funcionário assalariado: R$ " + funcionarioAssalariado.calcularBonus());

        // Criação de um objeto Funcionario Horista para instanciar o CalcularBonus
        // Depois, utiliza-se o System.out.println para imprimir o resultado da operação
        // já com o bonus
        Funcionario funcionarioHorista = new FuncionarioHorista(50.00, 160);
        System.out.println("Bônus do funcionário horista: R$ " + funcionarioHorista.calcularBonus());
    }
}