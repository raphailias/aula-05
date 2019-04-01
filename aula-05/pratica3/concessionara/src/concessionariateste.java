public class concessionariateste {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("carlo2",6500);
        Vendedor v1 = new Vendedor("carlos",1000,g1);

        double totalVendasMes = 10000;
        System.out.println("vendedor");
        System.out.println("comissao; "+ v1.getComissao(totalVendasMes));
        System.out.println("gerente:");
        System.out.println("Comissão:"+g1.getComissao(totalVendasMes));
        if(g1.aumentarSalarioBaseVendedor(v1)){
            System.out.println("pode dar aumento!");
        }
    }




}
