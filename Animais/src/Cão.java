public class Cão extends Animais{
    private String porte;

    public Cão(String nome, double idade, String raça, String porte) {
        super(nome, idade);
        this.porte = porte;
    }
}
