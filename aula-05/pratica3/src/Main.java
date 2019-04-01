public class Main {
    public static void main(String[] args) {
        Clientes clientes = new Clientes("scalco");
        Produto produto = new Produto(0, 4.5, "coxinha");
        Compra c1 = new Compra(1,clientes,produto);
        System.out.println(c1.pegarDetalhes());
        Compra c2 = new Compra(2,
                new Clientes("roberto"),
                new Produto(1,4.5,"cafe"));
        System.out.println(c2.pegarDetalhes());

    }
}
