public class Pedidos {
    private Clientes cliente;
    private String produto;
    private double valor;
    private String codigo;

    public Pedidos(Clientes cliente, String produto, double valor, String codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }
    public Clientes getCliente() {return cliente;}
    public void setCliente(Clientes cliente) {this.cliente = cliente;}
    public String getProduto() {return produto;}
    public void setProduto(String produto) {this.produto = produto;}
    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
}
