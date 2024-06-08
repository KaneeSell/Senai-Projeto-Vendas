package model;

import java.util.Scanner;

public class CalculadoradeTroco {
	
	public void Calculartroco(double valor) {
		
    	System.out.println("Troco: R$ " + valor);
    	int i = 0;
    	//notas
    	if (valor > 0) {
    	if (valor > 2) {
    		System.out.println("Notas:");
    	while (valor >= 2) {
    		    if (valor >= 100) {
    	    	while (valor >= 100) {
    			valor -= 100;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 100,00");
    			i = 0;
    		} else;
    			if (valor >= 50) {
    	    	while (valor >= 50) {
    			valor -= 50;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 50,00");
    			i = 0;
    		} else;
    			if (valor >= 20) {
    	    	while (valor >= 20) {
    			valor -= 20;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 20,00");
    			i = 0;
    		} else; 
    			if (valor >= 10) {
    	    	while (valor >= 10) {
    			valor -= 10;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 10,00");
    			i = 0;
    		} else; 
    			if (valor >= 5) {
    	    	while (valor >= 5) {
    			valor -= 5;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 5,00");
    			i = 0;
    		} else; 
    			if (valor >= 2) {
    	    	while (valor >= 2) {
    			valor -= 2;
    			i++;
    	    	}
    			System.out.println(i + " x R$ 2,00");
    			i = 0;
    	    	
    		} else;
    	}
    	}
    	//moedas
    	if (valor > 0) {
		System.out.println("Moedas:");
		if (valor >= 1) {
	    	while (valor >= 1) {
			valor -= 1;
			i++;
	    	}
			System.out.println(i + " x R$ 1,00");
			i = 0;
		} else;
		if (valor >= 0.5) {
	    	while (valor >= 0.5) {
			valor -= 0.5;
			i++;
	    	}
			System.out.println(i + " x R$ 0,50");
			i = 0;
		} else;
		if (valor >= 0.25) {
	    	while (valor >= 0.25) {
			valor -= 0.25;
			i++;
	    	}
			System.out.println(i + " x R$ 0,25");
			i = 0;
		} else;
		if (valor >= 0.10) {
	    	while (valor >= 0.10) {
			valor -= 0.10;
			i++;
	    	}
			System.out.println(i + " x R$ 0,10");
			i = 0;
		} else;
		if (valor >= 0.05) {
	    	while (valor >= 0.05) {
			valor -= 0.05;
			i++;
	    	}
			System.out.println(i + " x R$ 0,05");
			i = 0;
		} else;
		if (valor >= 0.009) {
	    	while (valor >= 0.009) {
			valor -= 0.009;
			i++;
	    	}
			System.out.println(i + " x R$ 0,01");
			i = 0;
		} else;
		
		} else;
    	//mensagem sem troco
    	} else {
		System.out.println("não precisa de troco");
    }
	}
	public static double lerDoubleComPonto(Scanner scanner) {
	    // Lê a entrada do usuário como uma string
	    String valorStr = scanner.next();

	    // Substitui qualquer vírgula (,) por um ponto (.) na string
	    valorStr = valorStr.replace(",", ".");

	    try {
	        // Tenta converter a string em um valor double
	        return Double.parseDouble(valorStr);
	    } catch (NumberFormatException e) {
	        // Em caso de erro na conversão, imprime uma mensagem de erro e encerra o programa
	        System.out.println("Valor inserido é inválido.");
	        System.exit(1); // Encerra o programa com código de saída 1 (indicando erro)
	    }

	    // Retorna 0.0 se a conversão falhar (nunca deve acontecer devido ao System.exit acima)
	    return 0.0;
	}

}
