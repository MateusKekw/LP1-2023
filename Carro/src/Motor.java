public class Motor {
    private int potencia;
    private double classificacao;
    private int valvulas;


    public Motor(int pot, double classificacao, int val){
        this.potencia = pot;
        this.classificacao = classificacao;
        this.valvulas = val;

    }
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public double getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
    public int getValvulas() {
        return valvulas;
    }
    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }
}
