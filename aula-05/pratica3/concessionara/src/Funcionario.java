public class Funcionario {
    private double salarioBase;
    private String nome;
    private double comissao;




    public Funcionario(String nome,double salarioBase, double comissao){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;

    }
    public double getsalarioDoMes(double totalDeVendas){
        return this.comissao*totalDeVendas+this.salarioBase;
    }

    public double getComissao(double totaldeVendas) {
        return this.comissao*totaldeVendas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

}
