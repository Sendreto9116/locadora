public class sofa {

    // atributos de classe
    String nome;
    String cor;
    double preço;
    String descrição;

    // metodos construtor apenas no ato da instancia
public sofa(String nome,String cor, double preço, String descrição)
 {
		this.cor=cor;
        this.preço=preço;
        this.descrição=descrição;
	    	
 }

    // metodo de acesso aos atributos
    public void set_nome(String novonome) {
        nome = novonome;
    }
    public void set_cor(String novacor) {
        cor = novacor;
    }
    public void set_preço(Double novopreço) {
        preço = novopreço;
    }
    public void set_descrição(String novadesc) {
        descrição = novadesc;
    }


    public void Informacao() {

        System.out.println("Nome: " + nome + "\n" +
                "Cor: " + cor + "\n" +
                "Preço: " + preço + "\n" +
                "Descrição: " + descrição + "\n");

    }

    public void status() {

        System.out.println("Disponivel - 3 em estoque");

    }

    public static void main(String[] args) {

        sofa s1 = new sofa("Sofa", "preto", 1600.00, "sofa grande");

        s1.set_nome("super sofa");
        s1.set_cor("branco");
        s1.set_preço(2000.00);
        s1.set_descrição("branco");

        s1.Informacao();
        s1.status();
    }

}