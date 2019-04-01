public class Compra {
    private Clientes clientes;
    private Produto produtos;
    private int id;

    public Compra(int id,Clientes clientes,Produto produtos){
        this.id = id;
        this.clientes = clientes;
        this.produtos = produtos;
    }
    public String pegarDetalhes(){
        return "ID:" + id+"Nome:"+clientes.getNome()+"Produto:"+ produtos.getNome();
    }


}
