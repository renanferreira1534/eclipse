package objetos;

import classes.Cliente;

public class UsarCliente {

	public static void main(String[] args) {
		//vamos instancia a classe cliente gerando o objeto cli
		Cliente cli = new Cliente();
		cli.setNome("Rodrigo Sampaio");
		cli.setEmail("rodrigo.sp@gmail.com");
		cli.setCpf("12345698725");
		cli.setIdade(22);
		System.out.println(cli.cadastrar());
	}

}