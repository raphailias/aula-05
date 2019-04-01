public class Produto {
    private double preço;
    private double id;
    private String nome;


    public void pegarInformações(){

    }
    public void pegarPreço(){

    }


    public double getPreço() {
        return preço;
    }

    public double getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public Produto(int id,double preco,String nome){
        this.id = id;
        this.preço = preco;
        this.nome = nome;
    }

}
