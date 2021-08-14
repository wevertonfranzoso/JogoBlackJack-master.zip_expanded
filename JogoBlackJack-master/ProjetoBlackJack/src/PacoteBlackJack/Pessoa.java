package PacoteBlackJack;

public class Pessoa extends Humano {

	private String cpf;
	private String estadoCivil;
	private String nacionalidade;
	
	public Pessoa() {
	}
	
	public Pessoa(String dataDeNascimento, String corDosOlhos, String nomeDoPai, String nomeDaMae, String cpf,
			String estadoCivil, String nacionalidade) {
		super(dataDeNascimento, corDosOlhos, nomeDoPai, nomeDaMae);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
	}
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	protected String getEstadoCivil() {
		return estadoCivil;
	}
	protected void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	protected String getNacionalidade() {
		return nacionalidade;
	}
	protected void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void mensagemVitoria() {
		System.out.println("Venci!!!");
	}
}
