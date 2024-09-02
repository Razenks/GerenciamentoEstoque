package Produtos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto("Açai", 18.00, 68);
		
		/*
		System.out.println("Coloque o nome do produto em estoque: ");
		String nome = sc.next();
		produto.setNome(nome);
		
		System.out.println("Coloque o preço do produto: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		
		System.out.println("Coloque a quantidade em Estoque: ");
		int qntd = sc.nextInt();
		produto.setQntd(qntd); 
		*/
		
		System.out.println("Oque deseja fazer? ");
		System.out.println("[1]Comprar Produto");
		System.out.println("[2]Consultar preço");
		System.out.println("[3]Consultar estoque");
		System.out.println("[0]Sair");
		
		int opcao = sc.nextInt();
		int qntdCompras;
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				System.out.println("Quantos Açais deseja comprar? ");
				qntdCompras = sc.nextInt();
				produto.verificarProduto();
				produto.comprarProduto(qntdCompras);
				produto.consultarTotal(qntdCompras);
				break;
			case 2:
				System.out.println("Esse é o preço do produto: " +produto.getPreco());
				break;
			case 3:
				System.out.println("Essa é a quantidade em estoque: "+ produto.getQntd());
				break;
			default: 
				System.out.println("Opção invalida");
			}
			System.out.println("Oque deseja fazer? ");
			System.out.println("[1]Comprar Produto");
			System.out.println("[2]Consultar preço");
			System.out.println("[3]Consultar estoque");
			System.out.println("[0]Sair");
			opcao = sc.nextInt();
			
		}
		
		
		

	}

}
