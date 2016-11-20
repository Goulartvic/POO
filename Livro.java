
public class Livro extends Item {
	
	private String autor;
	
	public Livro(String autor, String codigo, boolean alocado, String dataPublic, String editora, String titulo){
		super();
		this.setAutor(autor);
		super.setCodigo(codigo);
		super.setDataPublic(dataPublic);
		super.setEditora(editora);
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
