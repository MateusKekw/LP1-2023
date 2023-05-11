public class Clientes {
    private String nome;
    private String CPF;
    private String tel;

    public Clientes(String nome, String CPF, String tele){
        this.nome = nome;
        this.CPF = CPF;
        this.tel = tel;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCPF() {return CPF;}
    public void setCPF(String CPF) {this.CPF = CPF;}
    public String getTele() {return tel;}
    public void setTele(String tel) {this.tel = tel;}
}
