package model;

//Bibliotecas importadas
import java.util.ArrayList;
import java.util.Scanner;
import dao.VendaDAO;

public class PrincipalClass {
	public static void main(String[] args) {
		//Declaração de variaveis
		int opcao = 0;
		double vlrtotal;
		ArrayList<Double> valortotal = new ArrayList<>();
        //Instância das classes
		CalculadoradeTroco calcular = new CalculadoradeTroco();
        Venda venda = new Venda();
        VendaDAO vendaDAO = new VendaDAO();
        Scanner scan = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO");
            System.out.println("1 - Adicionar venda\n" +
            				   "2 - Fechamento de caixa\n" +
            				   "3 - Sair");
            opcao = scan.nextInt();
		//Loop para realizar a escolha do usuario
            switch (opcao) {
            case 1 -> {
            	vlrtotal = 0;
                System.out.println("Digite o valor total da venda:");
                vlrtotal = calcular.lerDoubleComPonto(scan);
                valortotal.add(vlrtotal);
                System.out.println("Digite o valor pago:");                
                calcular.Calculartroco(scan.nextDouble() - vlrtotal);
                venda.setTotal(vlrtotal);
                vendaDAO.criarvenda(venda);	
            }
            case 2 -> {
                double soma = 0;
                for (double v : valortotal) {
                    soma += v;
                }
                    System.out.println("Vendas do dia: " + valortotal);
                    System.out.println("Total: " + soma);
            }
            case 3 -> System.out.println("Finalizando sistema...");
            default -> System.out.println("Opção inválida!");
//		Venda venda = new Venda(20);
//		VendaDAO vendaDAO = new VendaDAO();
//		
//		vendaDAO.criarvenda(venda);		
	}
}
}
}
