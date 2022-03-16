public class Cliente{

    //atributos de classe
    String nome;
    int idade;
    String email;
    int telefone;


    // metodos construtor apenas no ato da instancia
    public Cliente(String nome, int idade, String email, int telefone){

        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;

    }

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Idade: " + idade + "\n" +
        "Email: " + email + "\n" +
        "Telefone: " + telefone + "\n" + "\n");
    }


    public static void main(String[] args) {

        Cliente C1 = new Cliente("Naymer", 23, "naymer@hotmail.com.br", 983763948);
        Cliente C2 = new Cliente("Creiton", 34, "creiton@gmail.com", 989284982);

        C1.Informacao();
        C2.Informacao();
        
    }

}