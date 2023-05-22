import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    //atributos

    String nome;
    String sobrenome;

    //metodos

    public void falar(){

        System.out.println("falei");
    }
    //sobrecarga do método falar()

    public String falar(String volume ){
        return"falei" + volume;
    }
    //construtor

    Pessoa(){

    }
    Pessoa(String _nome);
    this.nome = _nome;
}
