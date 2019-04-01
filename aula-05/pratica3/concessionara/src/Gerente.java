import java.util.Objects;

public class Gerente {
        private double salarioBase;
        private String nome;
        private double comissao;




    public Gerente(String nome,double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = 0.1;

    }
    public double getsalarioDoMes(double totalDeVendas){
        return getComissao(totalDeVendas)+ this.salarioBase;
    }

    public double getComissao(double totaldeVendas) {
        return this.comissao*totaldeVendas+this.salarioBase*0.5;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if (vendedor.getGerente().equals(this) ){
            return  true;
        }
        else
            return false;
    }

}
