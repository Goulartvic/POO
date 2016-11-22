
public class Usuario {

	private String nome;
	private int funcao;
	
	public Usuario(String nome, int funcao){
		this.setFuncao(funcao);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFuncao() {
		return funcao;
	}
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}
	
}
