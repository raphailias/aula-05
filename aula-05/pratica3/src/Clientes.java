public class Clientes {
    private String Nome;
    private String Ra;
    private boolean Funcionario;
    private boolean visitante;


    public void compra(){

    }
    public void acompanhar(){

    }


    public String getNome() {
        return Nome;
    }

    public String getRa() {
        return Ra;
    }

    public boolean isFuncionario() {
        return Funcionario;
    }

    public boolean isVisitante() {
        return visitante;
    }

    public Clientes(String Nome){
        this.Nome = Nome;
        this.visitante = true;

    }
    public Clientes(String Nome, boolean Funcianrio){
        this.Nome = Nome;
        if(Funcianrio)
            this.Funcionario = Funcianrio;
        else
            visitante = true;


    }
    public Clientes(String Nome, String ra){
        this.Ra = Ra;
        this.Nome = Nome;
    }



}

