abstract class Animais {
    private String nome;
    private double idade;
    

    public Animais(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

}
