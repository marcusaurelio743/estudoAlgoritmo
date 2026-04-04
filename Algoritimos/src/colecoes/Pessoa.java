package colecoes;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private String setor;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String setor) {
		super();
		this.nome = nome;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", setor=" + setor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, setor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(setor, other.setor);
	}

}
