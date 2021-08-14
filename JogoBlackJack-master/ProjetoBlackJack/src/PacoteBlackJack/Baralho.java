package PacoteBlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import PacoteBlackJack.exceptions.ExcecaoBaralhoVazio;

public class Baralho {

	private List<Carta> cartas = new ArrayList<Carta>();
	//private Carta[] cartas = new Carta[52]; // Vetor criado na etapa anterior, agora substituído por uma lista
	private String[] naipes = { "Ouros", "Copas", "Espadas", "Paus" };
	private String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private List<Carta> cartasRetiradas = new ArrayList<Carta>();

	// Lista auxiliar usada para embaralhar
	private List<Carta> listaBaralho;

	// Cria o baralho
	public Baralho() {
		carregaListaBaralho();
	}

	//Carrega as cartas no Array de Cartas
	private void carregaListaBaralho() {
		
		listaBaralho = new ArrayList<Carta>();
		
		int k = 0;
		for (int i = 0; i < naipes.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				cartas.add(new Carta(numeros[j], naipes[i], j + 1)) ;
				listaBaralho.add(cartas.get(k));
				k++;
			}
		}
	}
	
	// Mistura a ordem das cartas
	protected void embaralhar() {
		
		carregaListaBaralho();
		cartas = new ArrayList<Carta>();
		
		int index = 0;
		while (index < 52) {
			int num = new Random().nextInt(listaBaralho.size());
			cartas.add (listaBaralho.get(num));
			listaBaralho.remove(num);
			if(listaBaralho.size() == 0) {
				break;
			}
		}
		
		//versão do looping para Array, da etapa anterior
//		for (int i = 0; i < cartas.length; i++) {
//			int num = new Random().nextInt(listaBaralho.size());
//			cartas[i] = listaBaralho.get(num);
//			listaBaralho.remove(num);
//		}
	}
	
	protected Carta pegarCarta() throws ExcecaoBaralhoVazio {
		Carta carta = new Carta();
		try {
			carta = cartas.get(0);
			cartasRetiradas.add(carta);
			System.out.println("Carta " + carta + " retirada.");
			cartas.remove(0);
		} catch (Exception e) {
			throw new ExcecaoBaralhoVazio();
		}
		return carta;
	}

	//Imprime o baralho completo no console
	public void listarCartas() {
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
	}
}
