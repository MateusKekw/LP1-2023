public class Variavel extends Gastos{
    private int tempmes;

    public Variavel(String nome, double valor, int tempmes) {
        super(nome, valor);
        this.tempmes = tempmes;
    }

    public int getTempmes(){return tempmes;}
    public void setTempmes(int tempmes){this.tempmes = tempmes;}

}
