public class Revista extends Item {

	private String edicao;
	
	public Revista(String edicao, String codigo, boolean alocado, String titulo){
		super();
		this.setEdicao(edicao);
		super.setCodigo(codigo);
		super.setAlocado(alocado);
		super.setTitulo(titulo);
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	
}