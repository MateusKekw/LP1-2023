public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("Verde", "Gol", "PIA2A19", 2003,new Motor(150, 1.6, 8));

        System.out.println(carro.getMotor().getClassificacao());

        carro.addRoda(new Roda(26, 33));
        carro.addRoda(new Roda(26, 33));
        carro.addRoda(new Roda(26, 33));
        carro.addRoda(new Roda(26, 33));

        
        
    }
}
