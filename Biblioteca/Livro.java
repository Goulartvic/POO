
public class Livro extends Item {
	
	private String autor;
	
	public Livro(String autor, int codigo, boolean alocado, String titulo){
		super();
		this.setAutor(autor);
		super.setCodigo(codigo);
		super.setAlocado(alocado);
		super.setTitulo(titulo);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}