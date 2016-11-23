
public abstract class Item {
	
	protected String titulo; 
	protected int codigo;
	protected boolean alocado;
	
	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected int getCodigo() {
		return codigo;
	}
	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	protected boolean getAlocado() {
		return alocado;
	}
	protected void setAlocado(boolean alocado) {
		this.alocado = alocado;
	}

}
