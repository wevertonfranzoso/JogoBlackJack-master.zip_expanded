package PacoteBlackJack;

public class Humano {

	private String dataDeNascimento;
	private String corDosOlhos;
	private String nomeDoPai;
	private String nomeDaMae;

	public Humano() {
	}
	
	public Humano(String dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae) {
		this.dataDeNascimento = dataDeNascimento;
		this.corDosOlhos = corDosOlhos;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
	}
	
	protected String getDataDeNascimento() {
		return dataDeNascimento;
	}
	protected void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	protected String getCorDosOlhos() {
		return corDosOlhos;
	}
	protected void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}
	protected String getNomeDoPai() {
		return nomeDoPai;
	}
	protected void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	protected String getNomeDaMae() {
		return nomeDaMae;
	}
	protected void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
}
