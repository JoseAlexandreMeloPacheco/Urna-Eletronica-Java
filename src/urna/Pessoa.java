package urna;

public class Pessoa {
    private String nome;
    private int numero;
    private int votoRecebido = 0;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionarUmVoto (){
        votoRecebido++;
    }
    public int getVotoRecebido() {
        return votoRecebido;
    }
    public String toString() {
        return nome;
    }

}
