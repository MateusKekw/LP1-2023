abstract class Gastos {
    protected String nome;
    protected double valor;

    public Gastos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getValor() {return valor;}
    public void setValor(double valor){this.valor = valor;}

    public void mudarValor(double valor) {
        valor = this.valor;
        setValor(valor * 0.05 + valor);
    }

    public void mostrarGastos(String nome, double valor ) {
    valor = this.valor;
    nome = this.nome;

        System.out.println(nome +" gastou "+valor);
    }
}
