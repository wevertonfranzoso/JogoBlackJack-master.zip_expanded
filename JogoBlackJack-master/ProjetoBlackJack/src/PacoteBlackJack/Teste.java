package PacoteBlackJack;

import PacoteBlackJack.exceptions.ExcecaoBaralhoVazio;

public class Teste {

	public static void main(String[] args) throws ExcecaoBaralhoVazio {
		
		Mesa mesa = new Mesa();
		mesa.jogar();
	}
}
