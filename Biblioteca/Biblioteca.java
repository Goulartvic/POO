import javax.swing.JOptionPane;

public class Biblioteca {
	
	private int tamanhoItem = 1;
	private int tamanhoUsu = 1;
	private Item[] itens = new Item[tamanhoItem];
	private Usuario[] u = new Usuario[tamanhoUsu];
	
	public Usuario[] preCadastro(){
		Usuario u1 = new Usuario("Felipe", 1, tamanhoUsu);
		u[0] = u1;
		return u;
	}
	public Usuario[] cadastrarUsuario(){
		tamanhoUsu++;
		Usuario[] usu = new Usuario[tamanhoUsu];
		for (int i = 0; i < u.length; i++) {
			usu[i] = u[i];
			
		}
		Usuario u1 = new Usuario(null, 0, tamanhoUsu);
		u1.setNome(JOptionPane.showInputDialog("Insira o nome"));
		u1.setFuncao(Integer.parseInt(JOptionPane.showInputDialog("Insira a função - Digite 1 para ADMIN e 2 para USUÁRIO")));
		usu[tamanhoUsu - 1] = u1;
		u = usu;
		return u;
	}
	public Item[] preCadastro1(){
		Item l1 = new Livro("Pedro Lotto", 1, false, "Supreme");
		itens[0] = l1;
		return itens;
	}

	public Item[] cadastrarItem(){
		tamanhoItem++;
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Aperte 1 para cadastrar um LIVRO ou 2 para cadastrar uma REVISTA"));
		if (tipo == 1) {
			Item[] livro = new Item[tamanhoItem];
			for (int i = 0; i < itens.length; i++) {
				livro[i] = itens[i];
			}
			Livro l = new Livro(null, 0, false, null);
			l.setAutor(JOptionPane.showInputDialog("Insira o nome do autor"));
			l.setCodigo(tamanhoItem);
			l.setTitulo(JOptionPane.showInputDialog("Insira o título do livro"));
			livro[tamanhoItem - 1] = l;
			itens = livro;
		
		} 
		else if(tipo == 2){
			Item[] revista = new Item[tamanhoItem];
			for (int i = 0; i < itens.length; i++) {
				revista[i] = itens[i];
			}
			Revista r = new Revista(null, 0, false, null);
			r.setEdicao(JOptionPane.showInputDialog("Insira o nome do autor"));
			r.setCodigo(tamanhoItem);
			r.setTitulo(JOptionPane.showInputDialog("Insira o título do livro"));
			revista[tamanhoItem - 1] = r;
			itens = revista;
			
			
		}
		return itens;
		
	}
	public void existeItem(){
		boolean verificador = false;
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o código"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar) {
				verificador = true;
				
			}
			
		}
		if (verificador) {
			JOptionPane.showMessageDialog(null, "O item existe");
		} else{
				JOptionPane.showMessageDialog(null, "O item não existe");
		}

	}
	public void situacaoItem(){
		boolean verificador = false;
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o código"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && itens[i].getAlocado()) {
				verificador = true;
				
			}
			
		}
		if (verificador) {
			JOptionPane.showMessageDialog(null, "O item já está locado");
		} else{
				JOptionPane.showMessageDialog(null, "O item não está locado");
		}
	}
	public void alocarItem(){
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o código"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && !(itens[i].getAlocado())) {
				itens[i].setAlocado(true);
				
			}
		}
	
	}
	
	public void devolverItem(){
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o código"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && itens[i].getAlocado()) {
				itens[i].setAlocado(false);
				
			}
		}
	
	
	}
	
	public int verificarUsuario(int checkID){
		int auxiliar = 0;
		for (int i = 0; i < u.length; i++) {
			if (u[i].getId() == checkID) {
				auxiliar = u[i].getFuncao();
				
			}
		}
		return auxiliar;
	}
	

}