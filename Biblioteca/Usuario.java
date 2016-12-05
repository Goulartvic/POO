
public class Usuario {

	private String nome;
	private int funcao;
	private int id;
	
	public Usuario(String nome, int funcao, int id){
		
		this.setFuncao(funcao);
		this.setId(id);
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
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
