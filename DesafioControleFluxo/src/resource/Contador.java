package resource;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro :");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro :");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e) {
			e.printStackTrace();
		}
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int contagem;
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("Parametros inválidos. Primeiro parâmetro maior que o segundo parâmetro");	//é possivel instânciar de duas formas (sem paramentro() OU String message) conforme a classe ParametroInvalidoException está escrita
		}
		
		contagem = parametroDois - parametroUm;
	
		for(int contar = 1; contar <= contagem; contar++) {
			System.out.println("contar = " + contar);
		}	
	}

}
