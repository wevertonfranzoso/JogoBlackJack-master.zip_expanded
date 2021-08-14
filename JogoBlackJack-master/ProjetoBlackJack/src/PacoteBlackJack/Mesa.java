package PacoteBlackJack;

import java.util.Scanner;

import PacoteBlackJack.exceptions.ExcecaoBaralhoVazio;

public class Mesa {

	private Baralho baralho;
	private Jogador jogador1;
	private Jogador jogador2;
	private boolean foiPuxadaCarta = true;
	int decisao1;
	int decisao2;
	
	public Mesa() {
		this.baralho = new Baralho();
		this.jogador1 = new Jogador();
		this.jogador2 = new Jogador();
		
	}

	public Mesa(Jogador jogador1, Jogador jogador2) {
		this.baralho = new Baralho();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void jogar() throws ExcecaoBaralhoVazio {
		embaralhar();
		int rodada = 1;
		
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o nome do Jogador 1:");
			jogador1.setNome(scanner.nextLine());
			System.out.println("Digite o nome do Jogador 2:");
			jogador2.setNome(scanner.nextLine());
			
			while(!jogoTerminado()) {
				int cartasPuxadas = 0;
				
				System.out.println("Rodada " + rodada);
				
				if(pegouCarta(jogador1.getNome(), scanner)) {
					jogador1.adicionarCartaSacada(pegarCarta());
					cartasPuxadas++;
				}
				if(pegouCarta(jogador2.getNome(), scanner)) {
					jogador2.adicionarCartaSacada(pegarCarta());
					cartasPuxadas++;
				}
				
				if(cartasPuxadas == 0) {
					foiPuxadaCarta = false;
				}
				
				mostrarPlacar();
				
				rodada++;
			}
		};
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}
	
	

	@Override
	public String toString() {
		return "Mesa [jogador1=" + jogador1 + ", jogador2=" + jogador2 + "]";
	}
	
	protected String imprimeDadosJogador1() {
		return "Mesa [jogador1=" + jogador1.imprimeDadosJogador() + "]";
	}
	
	protected String imprimeDadosJogador2() {
		return "Mesa [jogador2=" + jogador2.imprimeDadosJogador() + "]";
	}
	
	public void listarCartas() {
		baralho.listarCartas();
	}
	
	public void embaralhar() {
		baralho.embaralhar();
	}
	
	protected Carta pegarCarta() throws ExcecaoBaralhoVazio {
		return baralho.pegarCarta();
	}
	
	protected void mostrarPlacar() {
		System.out.println(jogador1.getNome() + ":" + jogador1.getPontos());
		System.out.println(jogador2.getNome() + ":" + jogador2.getPontos());
	}
	
	protected boolean jogoTerminado() {
		if(
			jogador1.getPontos() >= 22 ||
			jogador2.getPontos() >= 22 ||
			foiPuxadaCarta == false
			) {
			return true;
		}
		return false;
	}
	
	private boolean pegouCarta(String nome, Scanner scanner) {
		int valor = 0;
		boolean decisao = false;
		System.out.println(nome + ", pegará uma carta?");
		System.out.println("1 - SIM");
		System.out.println("0 - NÃO");
			try {
				valor = scanner.nextInt();
				if(valor > 0) {
					decisao = true;
				}
			} catch (Exception e) {
				System.out.println("Opção inválida!");
			}
		return decisao;
	}
}
