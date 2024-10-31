public class FuncionarioAssalariado implements Funcionario     {
        // colocar o bonus fixo com um determinado valor
        public static final double BONUS_FIXO = 5000.00;

        //  calcularBonus, retornando o valor do bônus fixo
        @Override
        public double calcularBonus() {
            return BONUS_FIXO;
    
        }
}
