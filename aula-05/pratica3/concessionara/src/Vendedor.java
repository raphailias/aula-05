public class Vendedor {
        private double salarioBase;
        private String nome;
        private double comissao;
        private Gerente gerente;




        public Vendedor(String nome,double salarioBase,Gerente gerente){
            this.nome = nome;
            this.salarioBase = salarioBase;
            this.comissao = 0.05;
            this.gerente = gerente;



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

        public Gerente getGerente() {
        return gerente;
    }
}
