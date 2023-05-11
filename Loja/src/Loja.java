import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Clientes> clientes = new ArrayList<>();
    private List<Pedidos> pedidos = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public List<Clientes> getClientes() {return clientes;}
    public void setClientes(List<Clientes> clientes) {this.clientes = clientes;}
    public void addClientes(Clientes clientes){
        this.clientes.add(clientes);
    }
    public List<Pedidos> getPedidos() {return pedidos;}
    public void setPedidos(List<Pedidos> pedidos) {this.pedidos = pedidos;}
    public void addPedidos(Pedidos pedidos){
        this.pedidos.add(pedidos);
    }
}
