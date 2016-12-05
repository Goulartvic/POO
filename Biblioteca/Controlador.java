import javax.swing.JOptionPane;

public class Controlador {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca();
		boolean loop = true;
		b1.preCadastro();
		b1.preCadastro1();
		while (loop) {
			int escolha1 = Integer.parseInt(
					JOptionPane.showInputDialog(" 1 - Cadastrar USUÁRIO \n 2 - selecionar um USUÁRIO\n 0 - Sair"));
			if (escolha1 == 1) {
				b1.cadastrarUsuario();
			} else if (escolha1 == 2) {
				int checkID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Usuario:"));
				if (b1.verificarUsuario(checkID) == 1) {
					boolean loop2 = true;
					while (loop2) {
						int escolha2 = Integer.parseInt(JOptionPane.showInputDialog(
								" 1 - Cadastrar ITEM \n 2 - Verificar ITEM \n 3 - Verificar situação do ITEM \n 4 - Alocar ITEM \n 5 - Devolver ITEM \n 0 - Sair"));
						if (escolha2 == 1) {
							b1.cadastrarItem();
						} else if (escolha2 == 2) {
							b1.existeItem();
						}else if (escolha2 == 3) {
							b1.situacaoItem();
						} else if (escolha2 == 4) {
							b1.alocarItem();
						} else if (escolha2 == 5) {
							b1.devolverItem();
						} else {
							loop2 = false;
						}
					}
				} else if (b1.verificarUsuario(checkID) == 2) {
					boolean loop2 = true;
					while (loop2) {
						int escolha2 = Integer.parseInt(JOptionPane.showInputDialog(
								"1 - Verificar ITEM \n 2 - Verificar situação do ITEM \n 3 - Alocar ITEM \n 4 - Devolver ITEM \n 0 - Sair"));
						if (escolha2 == 1) {
							b1.existeItem();
						}else if (escolha2 == 2) {
							b1.situacaoItem();
						} else if (escolha2 == 3) {
							b1.alocarItem();
						} else if (escolha2 == 4) {
							b1.devolverItem();
						} else {
							loop2 = false;
						}
					}
				}
			}
			else {
				loop = false;
			}
		}
	}
}
