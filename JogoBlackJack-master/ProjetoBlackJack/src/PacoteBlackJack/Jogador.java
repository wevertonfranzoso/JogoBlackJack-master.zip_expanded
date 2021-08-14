package PacoteBlackJack;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Pessoa {

	private String nome;
	private String email;
	private List<Carta> cartasSacadas;
	
	public Jogador() {
		this.cartasSacadas = new ArrayList<Carta>();
	}
	
	public Jogador(String dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae, String cpf,
			String estadoCivil, String nacionalidade, String nome, String email) {
		super(dataDeNascimento, corDosOlhos, nomeDoPai, nomeDaMae, cpf, estadoCivil, nacionalidade);
		this.nome = nome;
		this.email = email;
		this.cartasSacadas = new ArrayList<Carta>();
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}
	
	//Sobrescreve o método da Classe Pai, Pessoa
	@Override
	public void mensagemVitoria() {
		System.out.println("Venci!!! O outro Jogador é muito noob!!");
	}
	
	public void adicionarCartaSacada(Carta c) {
		cartasSacadas.add(c);
	}
	
	protected int getPontos() {
		int pontos = 0;
		for (Carta carta : cartasSacadas) {
			pontos += carta.getValor();
		}
		return pontos;
	}

	protected String imprimeDadosJogador() {
		return "Jogador [email=" + email + ", getCpf()=" + getCpf() + ", getEstadoCivil()=" + getEstadoCivil()
				+ ", getNacionalidade()=" + getNacionalidade() + ", getDataDeNascimento()=" + getDataDeNascimento()
				+ ", getCorDosOlhos()=" + getCorDosOlhos() + ", getNomeDoPai()=" + getNomeDoPai() + ", getNomeDaMae()="
				+ getNomeDaMae() + "]";
	}
}
