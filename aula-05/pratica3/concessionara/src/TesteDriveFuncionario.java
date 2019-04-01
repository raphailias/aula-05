public class TesteDriveFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("CARLOS",1000,0.05);
        System.out.println("Salario mes:"
        +f1.getsalarioDoMes(10000));
    }
}
