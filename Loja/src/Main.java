public class Main {
    public static void main(String[] args) {
    Loja loja = new Loja("Worst Beater");
    Clientes clientes = new Clientes("Mateus", "464.464.848-52", "959080341");
    Clientes clientes1 = new Clientes("Leo", "999.888.777-69", "958582241");
    Clientes clientes2 = new Clientes("Cleide", "435.667.554-35", "835672567");

        loja.addPedidos(new Pedidos(clientes, "Massageador", 22.90, "12435678"));
        loja.addPedidos(new Pedidos(clientes, "loção pós barba", 39.60, "68145843"));
        loja.addPedidos(new Pedidos(clientes1, "Amplificador", 799.99, "69335679"));
        loja.addPedidos(new Pedidos(clientes2, "creme de cabelo", 54.79, "52589092"));


        for(int i=0; i<loja.getPedidos().size(); i++){
            System.out.println(loja.getPedidos().get(i).getCliente().getNome());
            System.out.println(loja.getPedidos().get(i).getProduto());
            System.out.println(loja.getPedidos().get(i).getValor());
            System.out.println(loja.getPedidos().get(i).getCodigo());
            System.out.println("___________________________________");
        }
    }
}