public class Main {
    public static void main(String[] args) {
        Lazer piscina = new Lazer("Mateus", 1500, false);
        Fixo aluguel = new Fixo("Joana", 3000);
        Variavel onibus = new Variavel("Leo", 40, 12);

        aluguel.mostrarGastos(aluguel.nome, aluguel.valor );
        piscina.mostrarGastos(piscina.nome, piscina.valor);
        onibus.mostrarGastos(onibus.nome, onibus.valor);

        System.out.println("Agora mudando o valor dom aluguel para 5% mais caro");
        aluguel.mudarValor(aluguel.valor);

        aluguel.mostrarGastos(aluguel.nome, aluguel.valor);
    }
}