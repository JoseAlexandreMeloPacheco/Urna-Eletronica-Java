package urna;

import java.util.List;
import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCandidato listacandidato = new ListaCandidato();
        listacandidato.criarLista();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Branco/Nulo");
        pessoa1.setNumero(0);
        listacandidato.adicionarPessoaListaPosicao(0, pessoa1);
        listacandidato.adicionarVotoListaPosicao(0, pessoa1);
        while (true) {
            System.out.println("________________Urna Eletronica________________");
            System.out.println("1: Votar\n2: Cadastrar\n3: Olhar resultado");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println("_______________________________________________");
            if (menu == 1) {
                Pessoa pessoadovoto = new Pessoa();
                Pessoa votovazio = listacandidato.pegarPessoaPosicao(100);
                Pessoa votonulo = listacandidato.pegarPessoaPosicao(0);
                System.out.println("Digite o numero do candidato para realizar a votação");
                int posicao = sc.nextInt();
                pessoadovoto = listacandidato.pegarPessoaPosicao(posicao);
                System.out.println("_____________________________________");
                if (posicao == 0) {
                    System.out.println("Seu voto foi em branco/nulo");
                    pessoadovoto.adicionarUmVoto();
                }
                if(posicao >= 1){
                    System.out.println(pessoadovoto);
                    pessoadovoto.adicionarUmVoto();
                }
            }
            if (menu == 2) {
                Pessoa pessoa = new Pessoa();
                System.out.println("-------Cadastro de Candidato-------");
                System.out.println("Digite o nome do candidato: ");
                String nome = sc.nextLine();
                pessoa.setNome("Candidato: " + nome);
                System.out.println("Digite o numero do candidato: ");
                int numero = sc.nextInt();
                pessoa.setNumero(numero);
                listacandidato.adicionarPessoaListaPosicao(numero, pessoa);
                System.out.println("-----------------------------------");
                System.out.println("Candidato cadastrado com sucesso");
                System.out.println("-----------------------------------");
            }
            if (menu == 3) {
                Pessoa maior = listacandidato.pegarVotoPosicao(0);
                int indice = 0;
                Pessoa nulo = listacandidato.pegarPessoaPosicao(0);
                Pessoa vencedor = new Pessoa();
                for (int i = 0; i < listacandidato.mostrarTamanhoListaVoto(); ++i){
                    Pessoa teste = listacandidato.pegarPessoaPosicao(i);
                    if(maior.getVotoRecebido() < teste.getVotoRecebido()){
                        maior = teste;
                        indice = i;
                    }
                }
                vencedor = listacandidato.pegarPessoaPosicao(indice);
                System.out.println(vencedor.getNome() + " venceu com " + vencedor.getVotoRecebido() + " votos.");
            }
        }
    }
}

