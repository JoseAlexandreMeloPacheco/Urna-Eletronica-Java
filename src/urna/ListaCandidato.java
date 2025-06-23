package urna;

import java.util.ArrayList;

public class ListaCandidato{
    private ArrayList<Pessoa> listaPessoa;
    private ArrayList<Pessoa> listaVoto;
    public void criarLista() {
        listaPessoa = new ArrayList<>(100);
        listaVoto = new ArrayList<>(100);
        Pessoa pessoazero = new Pessoa();
        for (int i = 0; i <= 100; i++) {
            listaPessoa.add(null);
            listaVoto.add(pessoazero);
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("Número não registrado");
            pessoa.setNumero(0);
            adicionarPessoaListaPosicao(i, pessoa);
        }
    }
    public void adicionarPessoaListaPosicao(int indice, Pessoa pessoa) {
        listaPessoa.set(indice, pessoa);
    }
    public void adicionarVotoListaPosicao(int indice, Pessoa pessoa) {
        listaVoto.set(indice, pessoa);
    }
    public int mostrarTamanhoListaPessoa() {
        return listaPessoa.size();
    }
    public int mostrarTamanhoListaVoto() {
        return listaVoto.size();
    }
    public Pessoa pegarPessoaPosicao(int posicao) {
        return listaPessoa.get(posicao);
    }
    public Pessoa pegarVotoPosicao(int posicao) {
        return listaVoto.get(posicao);
    }
    public void mostrarTodaListaVoto() {
        for (int i = 0; i < mostrarTamanhoListaVoto(); i++) {
            Pessoa pessoa = pegarVotoPosicao(i);
            System.out.println(pessoa.getVotoRecebido());
        }
    }
    public void mostrarTodaListaPessoa() {
        for (int i = 0; i < mostrarTamanhoListaPessoa(); i++) {
            Pessoa pessoa = pegarPessoaPosicao(i);
            System.out.println(pessoa.getNome());
        }
    }
}






