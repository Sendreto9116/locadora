public class Carro{

    //atributos de classe
    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preço;


    // metodos construtor apenas no ato da instancia
    public Carro(String placa, double potencia, String modelo, String cor,
     String marca, boolean cambio_automatico, int ano){

        this.placa = placa;
        this.potencia = potencia;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.cambio_automatico = cambio_automatico;
        this.ano = ano;
    }

    //metodo de acesso aos atributos
    public void set_cor(String novacor){
        cor = novacor;
    }

    public void Informacao(){

        System.out.println("Placa: " + placa + "\n" +
        "Potencia: " + potencia + "\n" +
        "Modelo: " + modelo + "\n" +
        "Cor: " + cor + "\n" +
        "Com Cambio Automatico: " + cambio_automatico + "\n" +
        "Ano: " + ano + "\n" + "\n");
    }


    public static void main(String[] args) {

        Carro C1 = new Carro("FASDFEFE", 8.0, "Civic", "Verde", "Honda", true, 2022);
        Carro C2 = new Carro("GDGGWERC", 2.0, "Uno", "Azul", "Fiat", true, 2019);

        C1.Informacao();
        C2.Informacao();
        
        C1.set_cor("Vermelho");
        C1.Informacao();
    }

}