public abstract class Item {
	
	private String codigo;
	private String titulo;
	private boolean alocado;
	private String dataPublic;
	private String editora;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isAlocado() {
		return alocado;
	}
	public void setAlocado(boolean alocado) {
		this.alocado = alocado;
	}
	public String getDataPublic() {
		return dataPublic;
	}
	public void setDataPublic(String dataPublic) {
		this.dataPublic = dataPublic;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
