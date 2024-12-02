package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial ("Dell Computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("451245512121");
		System.out.println(dell.cadastro());
		
		Produto mouse = new Produto();
		mouse.setNome("Mouse sem fio");
		mouse.setDescricao("Mouse sem fio recarregavel");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preco do produto é"+mouse.getPreco());
		
		
		
	}

}
