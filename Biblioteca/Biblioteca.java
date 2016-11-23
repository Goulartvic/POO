import javax.swing.JOptionPane;

public class Biblioteca {
	
	private int tamanhoItem = 0;
	private int tamanhoUsu = 1;
	private Item[] itens = new Item[tamanhoItem];
	private Usuario[] u = new Usuario[tamanhoUsu];
	
	public Usuario[] preCadastro(){
		u[0].setNome("Felipe");
		u[0].setFuncao(1);
		u[0].setId(tamanhoUsu);
		return u;
	}
	public Usuario[] cadastrarUsuario(){
		++tamanhoUsu;
		u[tamanhoUsu - 1].setNome(JOptionPane.showInputDialog("Insira o nome"));
		u[tamanhoUsu - 1].setFuncao(Integer.parseInt(JOptionPane.showInputDialog("Insira a fun��o")));
		u[tamanhoUsu - 1].setId(tamanhoUsu);
		return u;
	}
	public Item[] cadastrarItem(){

		return itens;
	}
	public void existeItem(){
		boolean verificador = false;
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar) {
				verificador = true;
				
			}
			
		}
		if (verificador) {
			JOptionPane.showMessageDialog(null, "O item existe");
		} else{
				JOptionPane.showMessageDialog(null, "O item n�o existe");
		}

	}
	public void situacaoItem(){
		boolean verificador = false;
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && itens[i].getAlocado()) {
				verificador = true;
				
			}
			
		}
		if (verificador) {
			JOptionPane.showMessageDialog(null, "O item j� est� locado");
		} else{
				JOptionPane.showMessageDialog(null, "O item n�o est� locado");
		}
	}
	public void alocarItem(){
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && !(itens[i].getAlocado())) {
				itens[i].setAlocado(true);
				
			}
		}
	
	}
	
	public void devolverItem(){
		int auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo"));
		for (int i = 0; i < itens.length; i++) {
			if (itens[i].getCodigo() == auxiliar && itens[i].getAlocado()) {
				itens[i].setAlocado(false);
				
			}
		}
	
	
	}
	

}